
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.BudgetCommitmentStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;


/**
 * <p>Java class for PurchaseOrderResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseMessageType" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ResponseMessageType"/>
 *         &lt;element name="errorResponse" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ErrorResponse"/>
 *         &lt;element name="notificationResponse" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetCommitmentStatusNotification"/>
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
@XmlType(name = "PurchaseOrderResponseMsg", propOrder = {
    "responseMessageType",
    "errorResponse",
    "notificationResponse",
    "messageHeader"
})
public class PurchaseOrderResponseMsg {

    @XmlElement(required = true)
    protected ResponseMessageType responseMessageType;
    @XmlElement(required = true)
    protected ErrorResponse errorResponse;
    @XmlElement(required = true)
    protected BudgetCommitmentStatusNotification notificationResponse;
    @XmlElement(required = true)
    protected MessageHeader messageHeader;

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
     *     {@link BudgetCommitmentStatusNotification }
     *     
     */
    public BudgetCommitmentStatusNotification getNotificationResponse() {
        return notificationResponse;
    }

    /**
     * Sets the value of the notificationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetCommitmentStatusNotification }
     *     
     */
    public void setNotificationResponse(BudgetCommitmentStatusNotification value) {
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

}
