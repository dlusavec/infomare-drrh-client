
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetCommitmentItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetCommitmentItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetCommitmentItem" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetCommitmentItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetCommitmentItemList", propOrder = {
    "budgetCommitmentItem"
})
public class BudgetCommitmentItemList {

    protected List<BudgetCommitmentItem> budgetCommitmentItem;

    /**
     * Gets the value of the budgetCommitmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetCommitmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetCommitmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetCommitmentItem }
     * 
     * 
     */
    public List<BudgetCommitmentItem> getBudgetCommitmentItem() {
        if (budgetCommitmentItem == null) {
            budgetCommitmentItem = new ArrayList<BudgetCommitmentItem>();
        }
        return this.budgetCommitmentItem;
    }

}
