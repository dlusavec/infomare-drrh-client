
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountDeactivateRequestMsg;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankAccountDeactivateRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankAccountDeactivateRequestMsg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bankAccountDeactivateRequestMsg"
})
@XmlRootElement(name = "deactivateBankAccount")
public class DeactivateBankAccount {

    @XmlElement(required = true, nillable = true)
    protected BankAccountDeactivateRequestMsg bankAccountDeactivateRequestMsg;

    /**
     * Gets the value of the bankAccountDeactivateRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountDeactivateRequestMsg }
     *     
     */
    public BankAccountDeactivateRequestMsg getBankAccountDeactivateRequestMsg() {
        return bankAccountDeactivateRequestMsg;
    }

    /**
     * Sets the value of the bankAccountDeactivateRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountDeactivateRequestMsg }
     *     
     */
    public void setBankAccountDeactivateRequestMsg(BankAccountDeactivateRequestMsg value) {
        this.bankAccountDeactivateRequestMsg = value;
    }

}
