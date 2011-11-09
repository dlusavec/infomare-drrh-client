
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceStatusNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceStatusNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}NotificationHeader" minOccurs="0"/>
 *         &lt;element name="invoiceStatus" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}InvoiceStatusType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceStatusNotification", propOrder = {
    "header",
    "invoiceStatus",
    "description"
})
public class InvoiceStatusNotification {

    protected NotificationHeader header;
    protected InvoiceStatusType invoiceStatus;
    protected String description;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationHeader }
     *     
     */
    public NotificationHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationHeader }
     *     
     */
    public void setHeader(NotificationHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceStatusType }
     *     
     */
    public InvoiceStatusType getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceStatusType }
     *     
     */
    public void setInvoiceStatus(InvoiceStatusType value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
