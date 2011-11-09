
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankCreationRequestMsg;


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
 *         &lt;element name="bankCreationRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankCreationRequestMsg"/>
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
    "bankCreationRequestMsg"
})
@XmlRootElement(name = "createBank")
public class CreateBank {

    @XmlElement(required = true, nillable = true)
    protected BankCreationRequestMsg bankCreationRequestMsg;

    /**
     * Gets the value of the bankCreationRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankCreationRequestMsg }
     *     
     */
    public BankCreationRequestMsg getBankCreationRequestMsg() {
        return bankCreationRequestMsg;
    }

    /**
     * Sets the value of the bankCreationRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankCreationRequestMsg }
     *     
     */
    public void setBankCreationRequestMsg(BankCreationRequestMsg value) {
        this.bankCreationRequestMsg = value;
    }

}
