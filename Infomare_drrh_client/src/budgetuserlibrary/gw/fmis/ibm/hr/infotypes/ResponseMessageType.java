
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseMessageType")
@XmlEnum
public enum ResponseMessageType {

    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("notification")
    NOTIFICATION("notification");
    private final String value;

    ResponseMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseMessageType fromValue(String v) {
        for (ResponseMessageType c: ResponseMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
