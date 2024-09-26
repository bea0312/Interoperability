package hr.isabelle.weatherserver;


import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class WeatherClientApplication {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        SpringApplication.run(WeatherClientApplication.class, args);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:8081"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Object[] params = new Object[]{"Zavižan"};
        double temperature = (double) client.execute("Temp.getWeather", params);

        // Process result
        System.out.println(temperature);
    }
}

