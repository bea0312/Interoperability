package hr.isabelle.weatherclient;

import org.apache.xmlrpc.XmlRpcRequestConfig;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimeZone;

import org.apache.xmlrpc.XmlRpcException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class ClientXmlRpcClient {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/getTemperature.html")
    public String getTemp(){
        return "temperature";
    }

    /*public String getTemperature(@RequestParam("city") String city, Model model) {
        try {
            double temperature = weatherService.getTemperature(city);
            model.addAttribute("temp", temperature);
        } catch (MalformedURLException | XmlRpcException e) {
            e.printStackTrace();
            model.addAttribute("error", "Error fetching temperature data");
        }
        return "redirect:tempForm.html";
    }*/
}

