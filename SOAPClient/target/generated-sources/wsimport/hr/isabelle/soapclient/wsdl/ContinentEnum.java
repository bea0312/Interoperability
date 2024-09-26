
package hr.isabelle.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContinentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContinentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFRICA"/&gt;
 *     &lt;enumeration value="ANTARCTICA"/&gt;
 *     &lt;enumeration value="ASIA"/&gt;
 *     &lt;enumeration value="EUROPE"/&gt;
 *     &lt;enumeration value="NORTH_AMERICA"/&gt;
 *     &lt;enumeration value="AUSTRALIA"/&gt;
 *     &lt;enumeration value="SOUTH_AMERICA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContinentEnum")
@XmlEnum
public enum ContinentEnum {

    AFRICA,
    ANTARCTICA,
    ASIA,
    EUROPE,
    NORTH_AMERICA,
    AUSTRALIA,
    SOUTH_AMERICA;

    public String value() {
        return name();
    }

    public static ContinentEnum fromValue(String v) {
        return valueOf(v);
    }

}
