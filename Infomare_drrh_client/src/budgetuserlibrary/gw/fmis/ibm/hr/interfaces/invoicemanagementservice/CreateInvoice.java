
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceCreateRequestMsg;


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
 *         &lt;element name="InvoiceCreateRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}InvoiceCreateRequestMsg"/>
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
    "invoiceCreateRequestMsg"
})
@XmlRootElement(name = "createInvoice")
public class CreateInvoice {

    @XmlElement(name = "InvoiceCreateRequestMsg", required = true, nillable = true)
    protected InvoiceCreateRequestMsg invoiceCreateRequestMsg;

    /**
     * Gets the value of the invoiceCreateRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCreateRequestMsg }
     *     
     */
    public InvoiceCreateRequestMsg getInvoiceCreateRequestMsg() {
        return invoiceCreateRequestMsg;
    }

    /**
     * Sets the value of the invoiceCreateRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCreateRequestMsg }
     *     
     */
    public void setInvoiceCreateRequestMsg(InvoiceCreateRequestMsg value) {
        this.invoiceCreateRequestMsg = value;
    }

}
