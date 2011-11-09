
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorRetrieveResponseMsg;


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
 *         &lt;element name="vendorResponseMsg" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}VendorRetrieveResponseMsg"/>
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
    "vendorResponseMsg"
})
@XmlRootElement(name = "retrieveVendorResponse")
public class RetrieveVendorResponse {

    @XmlElement(required = true, nillable = true)
    protected VendorRetrieveResponseMsg vendorResponseMsg;

    /**
     * Gets the value of the vendorResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRetrieveResponseMsg }
     *     
     */
    public VendorRetrieveResponseMsg getVendorResponseMsg() {
        return vendorResponseMsg;
    }

    /**
     * Sets the value of the vendorResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRetrieveResponseMsg }
     *     
     */
    public void setVendorResponseMsg(VendorRetrieveResponseMsg value) {
        this.vendorResponseMsg = value;
    }

}
