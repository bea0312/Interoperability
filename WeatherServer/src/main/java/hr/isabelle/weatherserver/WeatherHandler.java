package hr.isabelle.weatherserver;

import org.apache.xmlrpc.XmlRpcException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WeatherHandler {
    public List<List<Object>> getWeather(Object name) throws XmlRpcException {
        List<List<Object>> weatherDataList = new ArrayList<>();
        String city = (String) name;

        try {
            URL url = new URL("https://vrijeme.hr/hrvatska_n.xml");
            String xmlData = fetchDataFromURL(url);
            weatherDataList = parseWeatherData(xmlData, city);
        } catch (IOException e) {
            throw new XmlRpcException("Error fetching weather data: " + e.getMessage());
        }

        return weatherDataList;
    }

    private String fetchDataFromURL(URL url) throws IOException {
        StringBuilder content = new StringBuilder();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }

        connection.disconnect();
        return content.toString();
    }

    private List<List<Object>> parseWeatherData(String xmlData, String city) {
        List<List<Object>> weatherDataList = new ArrayList<>();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlData));
            Document document = builder.parse(is);

            NodeList cityNodes = document.getElementsByTagName("Grad");
            for (int i = 0; i < cityNodes.getLength(); i++) {
                Element cityNode = (Element) cityNodes.item(i);
                String cityName = cityNode.getElementsByTagName("GradIme").item(0).getTextContent();
                if (cityName.contains(city)) {
                    String temperatureStr = cityNode.getElementsByTagName("Temp").item(0).getTextContent();
                    double temperature = Double.parseDouble(temperatureStr);
                    List<Object> data = new ArrayList<>();
                    data.add(cityName);
                    data.add(temperature);
                    weatherDataList.add(data);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace(); // Handle parsing exceptions appropriately
        }

        return weatherDataList;
    }
}
