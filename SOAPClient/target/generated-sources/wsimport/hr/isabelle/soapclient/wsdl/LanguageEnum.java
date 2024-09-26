
package hr.isabelle.soapclient.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LanguageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFRIKAANS"/&gt;
 *     &lt;enumeration value="ALBANIAN"/&gt;
 *     &lt;enumeration value="AMHARIC"/&gt;
 *     &lt;enumeration value="ARABIC"/&gt;
 *     &lt;enumeration value="ARMENIAN"/&gt;
 *     &lt;enumeration value="AZERBAIJANI"/&gt;
 *     &lt;enumeration value="BASQUE"/&gt;
 *     &lt;enumeration value="BELARUSIAN"/&gt;
 *     &lt;enumeration value="BENGALI"/&gt;
 *     &lt;enumeration value="BOSNIAN"/&gt;
 *     &lt;enumeration value="BULGARIAN"/&gt;
 *     &lt;enumeration value="BURMESE"/&gt;
 *     &lt;enumeration value="CATALAN"/&gt;
 *     &lt;enumeration value="CEBUANO"/&gt;
 *     &lt;enumeration value="CHICHEN_ITZA"/&gt;
 *     &lt;enumeration value="CHINESE"/&gt;
 *     &lt;enumeration value="CORSICAN"/&gt;
 *     &lt;enumeration value="CROATIAN"/&gt;
 *     &lt;enumeration value="CZECH"/&gt;
 *     &lt;enumeration value="DANISH"/&gt;
 *     &lt;enumeration value="DUTCH"/&gt;
 *     &lt;enumeration value="ENGLISH"/&gt;
 *     &lt;enumeration value="ESPERANTO"/&gt;
 *     &lt;enumeration value="ESTONIAN"/&gt;
 *     &lt;enumeration value="FAROESE"/&gt;
 *     &lt;enumeration value="FILIPINO"/&gt;
 *     &lt;enumeration value="FINNISH"/&gt;
 *     &lt;enumeration value="FRENCH"/&gt;
 *     &lt;enumeration value="FRISIAN"/&gt;
 *     &lt;enumeration value="GALICIAN"/&gt;
 *     &lt;enumeration value="GEORGIAN"/&gt;
 *     &lt;enumeration value="GERMAN"/&gt;
 *     &lt;enumeration value="GREEK"/&gt;
 *     &lt;enumeration value="GUJARATI"/&gt;
 *     &lt;enumeration value="HAITIAN_CREOLE"/&gt;
 *     &lt;enumeration value="HAUSA"/&gt;
 *     &lt;enumeration value="HAWAIIAN"/&gt;
 *     &lt;enumeration value="HEBREW"/&gt;
 *     &lt;enumeration value="HINDI"/&gt;
 *     &lt;enumeration value="HMONG"/&gt;
 *     &lt;enumeration value="HUNGARIAN"/&gt;
 *     &lt;enumeration value="ICELANDIC"/&gt;
 *     &lt;enumeration value="IGBO"/&gt;
 *     &lt;enumeration value="INDONESIAN"/&gt;
 *     &lt;enumeration value="IRISH"/&gt;
 *     &lt;enumeration value="ITALIAN"/&gt;
 *     &lt;enumeration value="JAPANESE"/&gt;
 *     &lt;enumeration value="JAVANESE"/&gt;
 *     &lt;enumeration value="KANNADA"/&gt;
 *     &lt;enumeration value="KAZAKH"/&gt;
 *     &lt;enumeration value="KHMER"/&gt;
 *     &lt;enumeration value="KOREAN"/&gt;
 *     &lt;enumeration value="KURDISH"/&gt;
 *     &lt;enumeration value="KYRGYZ"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LATIN"/&gt;
 *     &lt;enumeration value="LATVIAN"/&gt;
 *     &lt;enumeration value="LITHUANIAN"/&gt;
 *     &lt;enumeration value="LUXEMBOURGISH"/&gt;
 *     &lt;enumeration value="MACEDONIAN"/&gt;
 *     &lt;enumeration value="MALAGASY"/&gt;
 *     &lt;enumeration value="MALAY"/&gt;
 *     &lt;enumeration value="MALAYALAM"/&gt;
 *     &lt;enumeration value="MALTESE"/&gt;
 *     &lt;enumeration value="MAORI"/&gt;
 *     &lt;enumeration value="MARATHI"/&gt;
 *     &lt;enumeration value="MONGOLIAN"/&gt;
 *     &lt;enumeration value="NEPALI"/&gt;
 *     &lt;enumeration value="MONGOLIAN"/&gt;
 *     &lt;enumeration value="NEPALI"/&gt;
 *     &lt;enumeration value="NORWEGIAN"/&gt;
 *     &lt;enumeration value="PASHTO"/&gt;
 *     &lt;enumeration value="PERSIAN"/&gt;
 *     &lt;enumeration value="POLISH"/&gt;
 *     &lt;enumeration value="PORTUGUESE"/&gt;
 *     &lt;enumeration value="PUNJABI"/&gt;
 *     &lt;enumeration value="ROMANIAN"/&gt;
 *     &lt;enumeration value="RUSSIAN"/&gt;
 *     &lt;enumeration value="SAMOAN"/&gt;
 *     &lt;enumeration value="SCOTS_GAELIC"/&gt;
 *     &lt;enumeration value="SERBIAN"/&gt;
 *     &lt;enumeration value="SESOTHO"/&gt;
 *     &lt;enumeration value="SHONA"/&gt;
 *     &lt;enumeration value="SINDHI"/&gt;
 *     &lt;enumeration value="SINHALESE"/&gt;
 *     &lt;enumeration value="SLOVAK"/&gt;
 *     &lt;enumeration value="SLOVENIAN"/&gt;
 *     &lt;enumeration value="SOMALI"/&gt;
 *     &lt;enumeration value="SPANISH"/&gt;
 *     &lt;enumeration value="SUNDANESE"/&gt;
 *     &lt;enumeration value="SWAHILI"/&gt;
 *     &lt;enumeration value="SWEDISH"/&gt;
 *     &lt;enumeration value="TAJIK"/&gt;
 *     &lt;enumeration value="TAMIL"/&gt;
 *     &lt;enumeration value="TELUGU"/&gt;
 *     &lt;enumeration value="THAI"/&gt;
 *     &lt;enumeration value="TURKISH"/&gt;
 *     &lt;enumeration value="UKRAINIAN"/&gt;
 *     &lt;enumeration value="URDU"/&gt;
 *     &lt;enumeration value="UZBEK"/&gt;
 *     &lt;enumeration value="VIETNAMESE"/&gt;
 *     &lt;enumeration value="WELSH"/&gt;
 *     &lt;enumeration value="XHOSA"/&gt;
 *     &lt;enumeration value="YIDDISH"/&gt;
 *     &lt;enumeration value="YORUBA"/&gt;
 *     &lt;enumeration value="ZULU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageEnum")
@XmlEnum
public enum LanguageEnum {

    AFRIKAANS,
    ALBANIAN,
    AMHARIC,
    ARABIC,
    ARMENIAN,
    AZERBAIJANI,
    BASQUE,
    BELARUSIAN,
    BENGALI,
    BOSNIAN,
    BULGARIAN,
    BURMESE,
    CATALAN,
    CEBUANO,
    CHICHEN_ITZA,
    CHINESE,
    CORSICAN,
    CROATIAN,
    CZECH,
    DANISH,
    DUTCH,
    ENGLISH,
    ESPERANTO,
    ESTONIAN,
    FAROESE,
    FILIPINO,
    FINNISH,
    FRENCH,
    FRISIAN,
    GALICIAN,
    GEORGIAN,
    GERMAN,
    GREEK,
    GUJARATI,
    HAITIAN_CREOLE,
    HAUSA,
    HAWAIIAN,
    HEBREW,
    HINDI,
    HMONG,
    HUNGARIAN,
    ICELANDIC,
    IGBO,
    INDONESIAN,
    IRISH,
    ITALIAN,
    JAPANESE,
    JAVANESE,
    KANNADA,
    KAZAKH,
    KHMER,
    KOREAN,
    KURDISH,
    KYRGYZ,
    LAO,
    LATIN,
    LATVIAN,
    LITHUANIAN,
    LUXEMBOURGISH,
    MACEDONIAN,
    MALAGASY,
    MALAY,
    MALAYALAM,
    MALTESE,
    MAORI,
    MARATHI,
    MONGOLIAN,
    NEPALI,
    NORWEGIAN,
    PASHTO,
    PERSIAN,
    POLISH,
    PORTUGUESE,
    PUNJABI,
    ROMANIAN,
    RUSSIAN,
    SAMOAN,
    SCOTS_GAELIC,
    SERBIAN,
    SESOTHO,
    SHONA,
    SINDHI,
    SINHALESE,
    SLOVAK,
    SLOVENIAN,
    SOMALI,
    SPANISH,
    SUNDANESE,
    SWAHILI,
    SWEDISH,
    TAJIK,
    TAMIL,
    TELUGU,
    THAI,
    TURKISH,
    UKRAINIAN,
    URDU,
    UZBEK,
    VIETNAMESE,
    WELSH,
    XHOSA,
    YIDDISH,
    YORUBA,
    ZULU;

    public String value() {
        return name();
    }

    public static LanguageEnum fromValue(String v) {
        return valueOf(v);
    }

}
