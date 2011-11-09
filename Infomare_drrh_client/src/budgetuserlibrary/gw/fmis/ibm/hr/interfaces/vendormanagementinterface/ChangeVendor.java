
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorChangeRequestMsg;


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
 *         &lt;element name="requestVendorChangeInput" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorChangeRequestMsg"/>
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
    "requestVendorChangeInput"
})
@XmlRootElement(name = "changeVendor")
public class ChangeVendor {

    @XmlElement(required = true, nillable = true)
    protected VendorChangeRequestMsg requestVendorChangeInput;

    /**
     * Gets the value of the requestVendorChangeInput property.
     * 
     * @return
     *     possible object is
     *     {@link VendorChangeRequestMsg }
     *     
     */
    public VendorChangeRequestMsg getRequestVendorChangeInput() {
        return requestVendorChangeInput;
    }

    /**
     * Sets the value of the requestVendorChangeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorChangeRequestMsg }
     *     
     */
    public void setRequestVendorChangeInput(VendorChangeRequestMsg value) {
        this.requestVendorChangeInput = value;
    }

}
