
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
 *         &lt;element name="requestVendorChangeOutput" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorResponseMsg"/>
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
    "requestVendorChangeOutput"
})
@XmlRootElement(name = "changeVendorResponse")
public class ChangeVendorResponse {

    @XmlElement(required = true, nillable = true)
    protected VendorResponseMsg requestVendorChangeOutput;

    /**
     * Gets the value of the requestVendorChangeOutput property.
     * 
     * @return
     *     possible object is
     *     {@link VendorResponseMsg }
     *     
     */
    public VendorResponseMsg getRequestVendorChangeOutput() {
        return requestVendorChangeOutput;
    }

    /**
     * Sets the value of the requestVendorChangeOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorResponseMsg }
     *     
     */
    public void setRequestVendorChangeOutput(VendorResponseMsg value) {
        this.requestVendorChangeOutput = value;
    }

}
