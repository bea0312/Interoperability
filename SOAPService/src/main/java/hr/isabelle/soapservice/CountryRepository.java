package hr.isabelle.soapservice;

import jakarta.annotation.PostConstruct;
import models.ContinentEnum;
import models.Country;
import models.FormOfGovernmentEnum;
import models.LanguageEnum;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setArea(new BigDecimal(2378492));
        spain.setContinent(ContinentEnum.EUROPE);
        spain.setFormOfGovernment(FormOfGovernmentEnum.DEMOCRACY);
        spain.setLanguage(LanguageEnum.SPANISH);
        spain.setCurrency("EUR");
        spain.setPopulation(new BigDecimal(46704314));

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCurrency("PLN");
        poland.setPopulation(new BigDecimal(38186860));
        poland.setFormOfGovernment(FormOfGovernmentEnum.DEMOCRACY);
        poland.setLanguage(LanguageEnum.POLISH);
        poland.setContinent(ContinentEnum.EUROPE);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCurrency("GBP");
        poland.setPopulation(new BigDecimal(38186860));

        countries.put(uk.getName(), uk);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}

