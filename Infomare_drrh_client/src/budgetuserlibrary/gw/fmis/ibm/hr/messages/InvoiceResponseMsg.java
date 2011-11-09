
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Invoice;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.InvoiceStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;


/**
 * <p>Java class for InvoiceResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseMessageType" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ResponseMessageType" minOccurs="0"/>
 *         &lt;element name="errorResponse" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ErrorResponse" minOccurs="0"/>
 *         &lt;element name="notificationResponse" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}InvoiceStatusNotification" minOccurs="0"/>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="invoice" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Invoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResponseMsg", propOrder = {
    "responseMessageType",
    "errorResponse",
    "notificationResponse",
    "messageHeader",
    "invoice"
})
public class InvoiceResponseMsg {

    protected ResponseMessageType responseMessageType;
    protected ErrorResponse errorResponse;
    protected InvoiceStatusNotification notificationResponse;
    protected MessageHeader messageHeader;
    protected Invoice invoice;

    /**
     * Gets the value of the responseMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType }
     *     
     */
    public ResponseMessageType getResponseMessageType() {
        return responseMessageType;
    }

    /**
     * Sets the value of the responseMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType }
     *     
     */
    public void setResponseMessageType(ResponseMessageType value) {
        this.responseMessageType = value;
    }

    /**
     * Gets the value of the errorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the value of the errorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setErrorResponse(ErrorResponse value) {
        this.errorResponse = value;
    }

    /**
     * Gets the value of the notificationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatusNotification }
     *     
     */
    public InvoiceStatusNotification getNotificationResponse() {
        return notificationResponse;
    }

    /**
     * Sets the value of the notificationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatusNotification }
     *     
     */
    public void setNotificationResponse(InvoiceStatusNotification value) {
        this.notificationResponse = value;
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

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link Invoice }
     *     
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Invoice }
     *     
     */
    public void setInvoice(Invoice value) {
        this.invoice = value;
    }

}
