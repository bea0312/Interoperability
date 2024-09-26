
package hr.isabelle.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormOfGovernmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FormOfGovernmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANARCHY"/&gt;
 *     &lt;enumeration value="ARISTOCRACY"/&gt;
 *     &lt;enumeration value="AUTHORITARIANISM"/&gt;
 *     &lt;enumeration value="BUREAUCRACY"/&gt;
 *     &lt;enumeration value="CAPITALISM"/&gt;
 *     &lt;enumeration value="CONFEDERATION"/&gt;
 *     &lt;enumeration value="COLONIALISM"/&gt;
 *     &lt;enumeration value="COMMUNISM"/&gt;
 *     &lt;enumeration value="CORPORATOCRACY"/&gt;
 *     &lt;enumeration value="DEMOCRACY"/&gt;
 *     &lt;enumeration value="ELECTOCRACY"/&gt;
 *     &lt;enumeration value="ERGATOCRACY"/&gt;
 *     &lt;enumeration value="FASCISM"/&gt;
 *     &lt;enumeration value="FEDERALISM"/&gt;
 *     &lt;enumeration value="FEUDALISM"/&gt;
 *     &lt;enumeration value="GENIOCRACY"/&gt;
 *     &lt;enumeration value="IMPERIALISM"/&gt;
 *     &lt;enumeration value="KAKISTOCRACY"/&gt;
 *     &lt;enumeration value="KLEPTOCRACY"/&gt;
 *     &lt;enumeration value="LOGOCRACY"/&gt;
 *     &lt;enumeration value="MERITOCRACY"/&gt;
 *     &lt;enumeration value="MILITARY_DICTATORSHIP"/&gt;
 *     &lt;enumeration value="MONARCHY"/&gt;
 *     &lt;enumeration value="OLIGARCHY"/&gt;
 *     &lt;enumeration value="PLUTOCRACY"/&gt;
 *     &lt;enumeration value="REPUBLICANISM"/&gt;
 *     &lt;enumeration value="SOCIALISM"/&gt;
 *     &lt;enumeration value="STATISM"/&gt;
 *     &lt;enumeration value="TECHNOCRACY"/&gt;
 *     &lt;enumeration value="THEOCRACY"/&gt;
 *     &lt;enumeration value="TOTALITARIANISM"/&gt;
 *     &lt;enumeration value="TRIBALISM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormOfGovernmentEnum")
@XmlEnum
public enum FormOfGovernmentEnum {

    ANARCHY,
    ARISTOCRACY,
    AUTHORITARIANISM,
    BUREAUCRACY,
    CAPITALISM,
    CONFEDERATION,
    COLONIALISM,
    COMMUNISM,
    CORPORATOCRACY,
    DEMOCRACY,
    ELECTOCRACY,
    ERGATOCRACY,
    FASCISM,
    FEDERALISM,
    FEUDALISM,
    GENIOCRACY,
    IMPERIALISM,
    KAKISTOCRACY,
    KLEPTOCRACY,
    LOGOCRACY,
    MERITOCRACY,
    MILITARY_DICTATORSHIP,
    MONARCHY,
    OLIGARCHY,
    PLUTOCRACY,
    REPUBLICANISM,
    SOCIALISM,
    STATISM,
    TECHNOCRACY,
    THEOCRACY,
    TOTALITARIANISM,
    TRIBALISM;

    public String value() {
        return name();
    }

    public static FormOfGovernmentEnum fromValue(String v) {
        return valueOf(v);
    }

}
