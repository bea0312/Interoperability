package hr.isabelle.soapclient;

import hr.isabelle.soapclient.wsdl.Country;
import hr.isabelle.soapclient.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapClientController {
    @Autowired
    private CountryClient countryClient;
    @GetMapping("/getCountry")
    public Country getCountry(@RequestParam("name") String countryName) {
        GetCountryResponse response = countryClient.getCountry(countryName);
        if (response != null && response.getCountry() != null) {
            return response.getCountry();
        } else {
            return null;
        }
    }
}
