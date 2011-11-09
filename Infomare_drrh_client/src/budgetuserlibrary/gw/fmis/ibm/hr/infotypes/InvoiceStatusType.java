
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="REVERSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceStatusType")
@XmlEnum
public enum InvoiceStatusType {

    APPROVED,
    DENIED,
    PENDING_APPROVAL,
    ACCEPTED,
    REVERSE;

    public String value() {
        return name();
    }

    public static InvoiceStatusType fromValue(String v) {
        return valueOf(v);
    }

}
