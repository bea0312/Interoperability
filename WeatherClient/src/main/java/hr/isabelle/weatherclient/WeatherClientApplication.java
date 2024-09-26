package hr.isabelle.weatherclient;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class WeatherClientApplication {
    public static void main(String[] args) {
        String keyword = "RC"; // Replace with your desired keyword
        try {
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:8081/xmlrpc"));
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);

            Object[] params = new Object[]{keyword};
            Object[] result = (Object[]) client.execute("Temp.getWeather", params);

            System.out.println("Weather data for cities containing keyword '" + keyword + "':");
            for (Object obj : result) {
                Object[] data = (Object[]) obj;
                String cityName = (String) data[0];
                double temperature = (double) data[1];
                System.out.println("City: " + cityName + ", Temperature: " + temperature);
            }
        } catch (MalformedURLException | XmlRpcException e) {
            e.printStackTrace();
        }
    }
}

