
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetCommitmentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetCommitmentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="SIGNED"/>
 *     &lt;enumeration value="CLOSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetCommitmentStatusType", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/")
@XmlEnum
public enum BudgetCommitmentStatusType {

    CREATED,
    DENIED,
    PENDING_APPROVAL,
    ACCEPTED,
    SIGNED,
    CLOSED;

    public String value() {
        return name();
    }

    public static BudgetCommitmentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
