
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountResponseMsg;


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
 *         &lt;element name="bankAccountResponseMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankAccountResponseMsg"/>
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
    "bankAccountResponseMsg"
})
@XmlRootElement(name = "deactivateBankAccountResponse")
public class DeactivateBankAccountResponse {

    @XmlElement(required = true, nillable = true)
    protected BankAccountResponseMsg bankAccountResponseMsg;

    /**
     * Gets the value of the bankAccountResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountResponseMsg }
     *     
     */
    public BankAccountResponseMsg getBankAccountResponseMsg() {
        return bankAccountResponseMsg;
    }

    /**
     * Sets the value of the bankAccountResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountResponseMsg }
     *     
     */
    public void setBankAccountResponseMsg(BankAccountResponseMsg value) {
        this.bankAccountResponseMsg = value;
    }

}
