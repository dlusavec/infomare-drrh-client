
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMITMENT"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="PAYMENT_REQUEST"/>
 *     &lt;enumeration value="PAYMENT_EXECUTION"/>
 *     &lt;enumeration value="BUDGET_PLAN"/>
 *     &lt;enumeration value="GL_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentClassType")
@XmlEnum
public enum DocumentClassType {

    COMMITMENT,
    INVOICE,
    PAYMENT_REQUEST,
    PAYMENT_EXECUTION,
    BUDGET_PLAN,
    GL_TRANSFER;

    public String value() {
        return name();
    }

    public static DocumentClassType fromValue(String v) {
        return valueOf(v);
    }

}
