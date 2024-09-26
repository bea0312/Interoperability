package hr.isabelle.weatherserver;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class WeatherServerApplication {

    public static void main(String[] args) throws XmlRpcException, IOException {
        SpringApplication.run(WeatherServerApplication.class, args);
        // Create web server on port 8081
        WebServer webServer = new WebServer(8081);

        // Create XML-RPC server
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();

        // Register handler mapping
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        phm.addHandler("Temp", WeatherHandler.class); // Use the handler name here
        xmlRpcServer.setHandlerMapping(phm);

        // Configure server
        XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
        serverConfig.setEnabledForExtensions(true);
        serverConfig.setContentLengthOptional(false);

        // Start server
        webServer.start();
        System.out.println("XML-RPC Server started on port 8082");
    }
}
