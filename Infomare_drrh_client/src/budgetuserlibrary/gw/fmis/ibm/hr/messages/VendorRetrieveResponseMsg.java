
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Vendor;


/**
 * <p>Java class for VendorRetrieveResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorRetrieveResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Vendor" minOccurs="0"/>
 *         &lt;element name="responseMessageType" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ResponseMessageType" minOccurs="0"/>
 *         &lt;element name="errorResponse" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ErrorResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorRetrieveResponseMsg", propOrder = {
    "messageHeader",
    "vendor",
    "responseMessageType",
    "errorResponse"
})
public class VendorRetrieveResponseMsg {

    protected MessageHeader messageHeader;
    protected Vendor vendor;
    protected ResponseMessageType responseMessageType;
    protected ErrorResponse errorResponse;

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
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

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

}
