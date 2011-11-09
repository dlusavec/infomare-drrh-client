
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorRetrieveRequestMsg;


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
 *         &lt;element name="vendorRetrieveRequestMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorRetrieveRequestMsg"/>
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
    "vendorRetrieveRequestMsg"
})
@XmlRootElement(name = "retrieveVendor")
public class RetrieveVendor {

    @XmlElement(required = true, nillable = true)
    protected VendorRetrieveRequestMsg vendorRetrieveRequestMsg;

    /**
     * Gets the value of the vendorRetrieveRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRetrieveRequestMsg }
     *     
     */
    public VendorRetrieveRequestMsg getVendorRetrieveRequestMsg() {
        return vendorRetrieveRequestMsg;
    }

    /**
     * Sets the value of the vendorRetrieveRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRetrieveRequestMsg }
     *     
     */
    public void setVendorRetrieveRequestMsg(VendorRetrieveRequestMsg value) {
        this.vendorRetrieveRequestMsg = value;
    }

}
