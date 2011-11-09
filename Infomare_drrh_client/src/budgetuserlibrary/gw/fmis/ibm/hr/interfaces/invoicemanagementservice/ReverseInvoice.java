
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceReverseRequestMsg;


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
 *         &lt;element name="InvoiceReverseRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}InvoiceReverseRequestMsg"/>
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
    "invoiceReverseRequestMsg"
})
@XmlRootElement(name = "reverseInvoice")
public class ReverseInvoice {

    @XmlElement(name = "InvoiceReverseRequestMsg", required = true, nillable = true)
    protected InvoiceReverseRequestMsg invoiceReverseRequestMsg;

    /**
     * Gets the value of the invoiceReverseRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceReverseRequestMsg }
     *     
     */
    public InvoiceReverseRequestMsg getInvoiceReverseRequestMsg() {
        return invoiceReverseRequestMsg;
    }

    /**
     * Sets the value of the invoiceReverseRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceReverseRequestMsg }
     *     
     */
    public void setInvoiceReverseRequestMsg(InvoiceReverseRequestMsg value) {
        this.invoiceReverseRequestMsg = value;
    }

}
