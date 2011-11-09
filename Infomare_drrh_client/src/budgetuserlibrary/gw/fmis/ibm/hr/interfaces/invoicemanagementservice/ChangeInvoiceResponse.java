
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg;


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
 *         &lt;element name="InvoiceResponseMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}InvoiceResponseMsg"/>
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
    "invoiceResponseMsg"
})
@XmlRootElement(name = "changeInvoiceResponse")
public class ChangeInvoiceResponse {

    @XmlElement(name = "InvoiceResponseMsg", required = true, nillable = true)
    protected InvoiceResponseMsg invoiceResponseMsg;

    /**
     * Gets the value of the invoiceResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResponseMsg }
     *     
     */
    public InvoiceResponseMsg getInvoiceResponseMsg() {
        return invoiceResponseMsg;
    }

    /**
     * Sets the value of the invoiceResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResponseMsg }
     *     
     */
    public void setInvoiceResponseMsg(InvoiceResponseMsg value) {
        this.invoiceResponseMsg = value;
    }

}
