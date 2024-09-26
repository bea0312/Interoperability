package hr.isabelle.soapservice;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.StringWriter;
import java.math.BigDecimal;

@Endpoint
    public class CountryEndpoint {
        private static final String NAMESPACE_URI = "http://models";

        private CountryRepository countryRepository;

        public CountryEndpoint(CountryRepository countryRepository){
            this.countryRepository = countryRepository;
        }


        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
        @ResponsePayload
        public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
            GetCountryResponse response = new GetCountryResponse();

            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new File("C:\\Users\\Isabelle\\Desktop\\VUA\\Semestar6\\IIP\\APIproba\\src\\main\\resources\\country.xml"));

                XPath xpath = XPathFactory.newInstance().newXPath();

                String expression = String.format("/countries/country[name='%s']", request.getName());

                NodeList nodes = (NodeList) xpath.compile(expression).evaluate(doc, XPathConstants.NODESET);


                if (nodes.getLength() > 0) {
                    Country country = new Country();
                    Element countryElement = (Element) nodes.item(0);

                    country.setName(countryElement.getElementsByTagName("name").item(0).getTextContent());
                    country.setShortName(countryElement.getElementsByTagName("shortName").item(0).getTextContent());
                    country.setArea(new BigDecimal(countryElement.getElementsByTagName("area").item(0).getTextContent()));
                    country.setPopulation(new BigDecimal(countryElement.getElementsByTagName("population").item(0).getTextContent()));
                    country.setCurrency(countryElement.getElementsByTagName("currency").item(0).getTextContent());

                    country.setContinent(ContinentEnum.valueOf(countryElement.getElementsByTagName("continent").item(0).getTextContent()));
                    country.setFormOfGovernment(FormOfGovernmentEnum.valueOf(countryElement.getElementsByTagName("formOfGovernment").item(0).getTextContent()));
                    country.setLanguage(LanguageEnum.valueOf(countryElement.getElementsByTagName("language").item(0).getTextContent()));


                    JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
                    Marshaller marshaller = jaxbContext.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                    File countryFile = new File("countryForJaxB.xml");
                    marshaller.marshal(country, countryFile);

                    StringWriter stringWriter = new StringWriter();
                    marshaller.marshal(country, stringWriter);
                    String xmlString = stringWriter.toString();
                    System.out.println(xmlString);

                    try {
                        File xmlFile = new File("countryForJaxB.xml");
                        File xsdFile = new File("C:\\Users\\Isabelle\\Desktop\\VUA\\Semestar6\\IIP\\countryXSDForsJaxB.xsd");

                        JAXBContext jaxbContextValid = JAXBContext.newInstance(Country.class);
                        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

                        Country unmarshallCountry = (Country) unmarshaller.unmarshal(xmlFile);

                        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                        Schema schema = schemaFactory.newSchema(xsdFile);
                        Validator validator = schema.newValidator();
                        validator.validate(new javax.xml.transform.stream.StreamSource(xmlFile));

                        System.out.println("XML is valid.");
                    } catch (JAXBException | org.xml.sax.SAXException e) {
                        System.out.println("XML is not valid: " + e.getMessage());
                        e.printStackTrace();
                        e.getStackTrace();
                    }

                    //validirat s jaxbom stvoreni xml

                    response.setCountry(country);
                } else {
                    response.setCountry(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.setCountry(null);
            }

            return response;
        }
    }
