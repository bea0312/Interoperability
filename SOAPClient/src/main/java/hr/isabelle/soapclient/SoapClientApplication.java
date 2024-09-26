package hr.isabelle.soapclient;

import hr.isabelle.soapclient.wsdl.GetCountryResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(CountryClient countryClient) {
        return args -> {
            try {
                String country = "Denmark";

                if (args.length > 0) {
                    country = args[0];
                }
                GetCountryResponse response = countryClient.getCountry(country);
                System.err.println(response.getCountry().getCurrency());
                System.err.println(response.getCountry().getContinent());
                System.err.println(response.getCountry().getArea());
                System.err.println(response.getCountry().getLanguage());
                System.err.println(response.getCountry().getFormOfGovernment());
                System.err.println(response.getCountry().getPopulation());
                //u xml odgovor s jaxb - vise zemalja u xml, ucitat xml datoteku u service
            }
            catch (NullPointerException e){
                System.err.println("Ne postoji takva drzava.");
            }
        };
    }
}
