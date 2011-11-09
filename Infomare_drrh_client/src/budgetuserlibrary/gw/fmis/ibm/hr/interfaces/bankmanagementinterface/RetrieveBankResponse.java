
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankResponseMsg;


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
 *         &lt;element name="bankResponseMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}BankResponseMsg"/>
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
    "bankResponseMsg"
})
@XmlRootElement(name = "retrieveBankResponse")
public class RetrieveBankResponse {

    @XmlElement(required = true, nillable = true)
    protected BankResponseMsg bankResponseMsg;

    /**
     * Gets the value of the bankResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BankResponseMsg }
     *     
     */
    public BankResponseMsg getBankResponseMsg() {
        return bankResponseMsg;
    }

    /**
     * Sets the value of the bankResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankResponseMsg }
     *     
     */
    public void setBankResponseMsg(BankResponseMsg value) {
        this.bankResponseMsg = value;
    }

}
