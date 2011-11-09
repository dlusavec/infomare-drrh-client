
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankChangeRequestMsg;


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
 *         &lt;element name="bankChangeRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankChangeRequestMsg"/>
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
    "bankChangeRequestMsg"
})
@XmlRootElement(name = "changeBank")
public class ChangeBank {

    @XmlElement(required = true, nillable = true)
    protected BankChangeRequestMsg bankChangeRequestMsg;

    /**
     * Gets the value of the bankChangeRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankChangeRequestMsg }
     *     
     */
    public BankChangeRequestMsg getBankChangeRequestMsg() {
        return bankChangeRequestMsg;
    }

    /**
     * Sets the value of the bankChangeRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankChangeRequestMsg }
     *     
     */
    public void setBankChangeRequestMsg(BankChangeRequestMsg value) {
        this.bankChangeRequestMsg = value;
    }

}
