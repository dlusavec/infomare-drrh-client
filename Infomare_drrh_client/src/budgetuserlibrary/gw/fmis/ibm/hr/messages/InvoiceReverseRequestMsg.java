
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;


/**
 * <p>Java class for InvoiceReverseRequestMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceReverseRequestMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="invoice" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader" minOccurs="0"/>
 *         &lt;element name="buFmisDocumentIdToReverse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceReverseRequestMsg", propOrder = {
    "messageHeader",
    "invoice",
    "buFmisDocumentIdToReverse"
})
public class InvoiceReverseRequestMsg {

    protected MessageHeader messageHeader;
    protected DocumentHeader invoice;
    protected String buFmisDocumentIdToReverse;

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
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setInvoice(DocumentHeader value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the buFmisDocumentIdToReverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuFmisDocumentIdToReverse() {
        return buFmisDocumentIdToReverse;
    }

    /**
     * Sets the value of the buFmisDocumentIdToReverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuFmisDocumentIdToReverse(String value) {
        this.buFmisDocumentIdToReverse = value;
    }

}
