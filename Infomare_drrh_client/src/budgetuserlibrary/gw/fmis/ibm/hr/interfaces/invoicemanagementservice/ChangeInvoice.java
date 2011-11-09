
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceChangeRequestMsg;


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
 *         &lt;element name="InvoiceChangeRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}InvoiceChangeRequestMsg"/>
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
    "invoiceChangeRequestMsg"
})
@XmlRootElement(name = "changeInvoice")
public class ChangeInvoice {

    @XmlElement(name = "InvoiceChangeRequestMsg", required = true, nillable = true)
    protected InvoiceChangeRequestMsg invoiceChangeRequestMsg;

    /**
     * Gets the value of the invoiceChangeRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceChangeRequestMsg }
     *     
     */
    public InvoiceChangeRequestMsg getInvoiceChangeRequestMsg() {
        return invoiceChangeRequestMsg;
    }

    /**
     * Sets the value of the invoiceChangeRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceChangeRequestMsg }
     *     
     */
    public void setInvoiceChangeRequestMsg(InvoiceChangeRequestMsg value) {
        this.invoiceChangeRequestMsg = value;
    }

}
