
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.BudgetCommitment;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;


/**
 * <p>Java class for ReservationChangeRequestMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationChangeRequestMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetCommitment" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetCommitment"/>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationChangeRequestMsg", propOrder = {
    "budgetCommitment",
    "messageHeader"
})
public class ReservationChangeRequestMsg {

    @XmlElement(required = true)
    protected BudgetCommitment budgetCommitment;
    @XmlElement(required = true)
    protected MessageHeader messageHeader;

    /**
     * Gets the value of the budgetCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetCommitment }
     *     
     */
    public BudgetCommitment getBudgetCommitment() {
        return budgetCommitment;
    }

    /**
     * Sets the value of the budgetCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetCommitment }
     *     
     */
    public void setBudgetCommitment(BudgetCommitment value) {
        this.budgetCommitment = value;
    }

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

}
