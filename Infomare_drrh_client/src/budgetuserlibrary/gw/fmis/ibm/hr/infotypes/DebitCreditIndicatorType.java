
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitCreditIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebitCreditIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DebitCreditIndicatorType", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/")
@XmlEnum
public enum DebitCreditIndicatorType {

    D,
    C;

    public String value() {
        return name();
    }

    public static DebitCreditIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
