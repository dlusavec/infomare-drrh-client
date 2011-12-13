
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.PaymentExecution;


/**
 * <p>Java class for PaymentExecutionNotificationEventMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentExecutionNotificationEventMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="paymentExecution" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}PaymentExecution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentExecutionNotificationEventMsg", propOrder = {
    "messageHeader",
    "paymentExecution"
})
public class PaymentExecutionNotificationEventMsg {

    protected MessageHeader messageHeader;
    protected PaymentExecution paymentExecution;

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

    /**
     * Gets the value of the paymentExecution property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExecution }
     *     
     */
    public PaymentExecution getPaymentExecution() {
        return paymentExecution;
    }

    /**
     * Sets the value of the paymentExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExecution }
     *     
     */
    public void setPaymentExecution(PaymentExecution value) {
        this.paymentExecution = value;
    }

}
