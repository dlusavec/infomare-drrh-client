
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorCreationRequestMsg;


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
 *         &lt;element name="requestVendorCreationInput" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorCreationRequestMsg"/>
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
    "requestVendorCreationInput"
})
@XmlRootElement(name = "createVendor")
public class CreateVendor {

    @XmlElement(required = true, nillable = true)
    protected VendorCreationRequestMsg requestVendorCreationInput;

    /**
     * Gets the value of the requestVendorCreationInput property.
     * 
     * @return
     *     possible object is
     *     {@link VendorCreationRequestMsg }
     *     
     */
    public VendorCreationRequestMsg getRequestVendorCreationInput() {
        return requestVendorCreationInput;
    }

    /**
     * Sets the value of the requestVendorCreationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorCreationRequestMsg }
     *     
     */
    public void setRequestVendorCreationInput(VendorCreationRequestMsg value) {
        this.requestVendorCreationInput = value;
    }

}
