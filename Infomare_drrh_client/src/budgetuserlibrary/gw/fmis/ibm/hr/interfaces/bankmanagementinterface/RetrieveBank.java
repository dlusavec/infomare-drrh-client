
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankRetrieveRequestMsg;


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
 *         &lt;element name="bankRetrieveRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankRetrieveRequestMsg"/>
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
    "bankRetrieveRequestMsg"
})
@XmlRootElement(name = "retrieveBank")
public class RetrieveBank {

    @XmlElement(required = true, nillable = true)
    protected BankRetrieveRequestMsg bankRetrieveRequestMsg;

    /**
     * Gets the value of the bankRetrieveRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankRetrieveRequestMsg }
     *     
     */
    public BankRetrieveRequestMsg getBankRetrieveRequestMsg() {
        return bankRetrieveRequestMsg;
    }

    /**
     * Sets the value of the bankRetrieveRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRetrieveRequestMsg }
     *     
     */
    public void setBankRetrieveRequestMsg(BankRetrieveRequestMsg value) {
        this.bankRetrieveRequestMsg = value;
    }

}
