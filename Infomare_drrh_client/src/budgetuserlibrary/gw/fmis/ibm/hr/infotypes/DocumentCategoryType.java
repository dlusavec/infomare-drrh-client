
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVATION"/>
 *     &lt;enumeration value="CONTRACT"/>
 *     &lt;enumeration value="PURCHASE_ORDER"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="PAYMENT_REQUEST"/>
 *     &lt;enumeration value="PAYMENT"/>
 *     &lt;enumeration value="BUDGET_PLAN"/>
 *     &lt;enumeration value="GL_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentCategoryType")
@XmlEnum
public enum DocumentCategoryType {

    RESERVATION,
    CONTRACT,
    PURCHASE_ORDER,
    INVOICE,
    PAYMENT_REQUEST,
    PAYMENT,
    BUDGET_PLAN,
    GL_TRANSFER;

    public String value() {
        return name();
    }

    public static DocumentCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
