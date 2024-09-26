
package hr.isabelle.soapclient.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for country complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="country"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="formOfGovernment" type="{http://models}FormOfGovernmentEnum"/&gt;
 *         &lt;element name="continent" type="{http://models}ContinentEnum"/&gt;
 *         &lt;element name="language" type="{http://models}LanguageEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
    "name",
    "shortName",
    "area",
    "population",
    "currency",
    "formOfGovernment",
    "continent",
    "language"
})
public class Country {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String shortName;
    @XmlElement(required = true)
    protected BigDecimal area;
    @XmlElement(required = true)
    protected BigDecimal population;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FormOfGovernmentEnum formOfGovernment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ContinentEnum continent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LanguageEnum language;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the population property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPopulation(BigDecimal value) {
        this.population = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the formOfGovernment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfGovernmentEnum }
     *     
     */
    public FormOfGovernmentEnum getFormOfGovernment() {
        return formOfGovernment;
    }

    /**
     * Sets the value of the formOfGovernment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfGovernmentEnum }
     *     
     */
    public void setFormOfGovernment(FormOfGovernmentEnum value) {
        this.formOfGovernment = value;
    }

    /**
     * Gets the value of the continent property.
     * 
     * @return
     *     possible object is
     *     {@link ContinentEnum }
     *     
     */
    public ContinentEnum getContinent() {
        return continent;
    }

    /**
     * Sets the value of the continent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinentEnum }
     *     
     */
    public void setContinent(ContinentEnum value) {
        this.continent = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageEnum }
     *     
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageEnum }
     *     
     */
    public void setLanguage(LanguageEnum value) {
        this.language = value;
    }

}
