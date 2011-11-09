
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorDeactivationRequestMsg;


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
 *         &lt;element name="requestVendorDeactivationInput" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorDeactivationRequestMsg"/>
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
    "requestVendorDeactivationInput"
})
@XmlRootElement(name = "deactivateVendor")
public class DeactivateVendor {

    @XmlElement(required = true, nillable = true)
    protected VendorDeactivationRequestMsg requestVendorDeactivationInput;

    /**
     * Gets the value of the requestVendorDeactivationInput property.
     * 
     * @return
     *     possible object is
     *     {@link VendorDeactivationRequestMsg }
     *     
     */
    public VendorDeactivationRequestMsg getRequestVendorDeactivationInput() {
        return requestVendorDeactivationInput;
    }

    /**
     * Sets the value of the requestVendorDeactivationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorDeactivationRequestMsg }
     *     
     */
    public void setRequestVendorDeactivationInput(VendorDeactivationRequestMsg value) {
        this.requestVendorDeactivationInput = value;
    }

}
