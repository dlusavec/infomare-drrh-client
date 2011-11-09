
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorResponseMsg;


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
 *         &lt;element name="requestVendorDeactivationOutput" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorResponseMsg"/>
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
    "requestVendorDeactivationOutput"
})
@XmlRootElement(name = "deactivateVendorResponse")
public class DeactivateVendorResponse {

    @XmlElement(required = true, nillable = true)
    protected VendorResponseMsg requestVendorDeactivationOutput;

    /**
     * Gets the value of the requestVendorDeactivationOutput property.
     * 
     * @return
     *     possible object is
     *     {@link VendorResponseMsg }
     *     
     */
    public VendorResponseMsg getRequestVendorDeactivationOutput() {
        return requestVendorDeactivationOutput;
    }

    /**
     * Sets the value of the requestVendorDeactivationOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorResponseMsg }
     *     
     */
    public void setRequestVendorDeactivationOutput(VendorResponseMsg value) {
        this.requestVendorDeactivationOutput = value;
    }

}
