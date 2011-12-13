
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentExecutionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentExecutionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="paid"/>
 *     &lt;enumeration value="notPaid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentExecutionStatusType")
@XmlEnum
public enum PaymentExecutionStatusType {

    @XmlEnumValue("paid")
    PAID("paid"),
    @XmlEnumValue("notPaid")
    NOT_PAID("notPaid");
    private final String value;

    PaymentExecutionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentExecutionStatusType fromValue(String v) {
        for (PaymentExecutionStatusType c: PaymentExecutionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
