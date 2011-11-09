
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountCreationRequestMsg;


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
 *         &lt;element name="bankAccountCreationRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankAccountCreationRequestMsg"/>
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
    "bankAccountCreationRequestMsg"
})
@XmlRootElement(name = "addNewBankAccount")
public class AddNewBankAccount {

    @XmlElement(required = true, nillable = true)
    protected BankAccountCreationRequestMsg bankAccountCreationRequestMsg;

    /**
     * Gets the value of the bankAccountCreationRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountCreationRequestMsg }
     *     
     */
    public BankAccountCreationRequestMsg getBankAccountCreationRequestMsg() {
        return bankAccountCreationRequestMsg;
    }

    /**
     * Sets the value of the bankAccountCreationRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountCreationRequestMsg }
     *     
     */
    public void setBankAccountCreationRequestMsg(BankAccountCreationRequestMsg value) {
        this.bankAccountCreationRequestMsg = value;
    }

}
