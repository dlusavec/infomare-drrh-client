
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderChangeRequestMsg;


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
 *         &lt;element name="changePurchaseOrderParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderChangeRequestMsg"/>
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
    "changePurchaseOrderParamIn"
})
@XmlRootElement(name = "changePurchaseOrder")
public class ChangePurchaseOrder {

    @XmlElement(required = true, nillable = true)
    protected PurchaseOrderChangeRequestMsg changePurchaseOrderParamIn;

    /**
     * Gets the value of the changePurchaseOrderParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderChangeRequestMsg }
     *     
     */
    public PurchaseOrderChangeRequestMsg getChangePurchaseOrderParamIn() {
        return changePurchaseOrderParamIn;
    }

    /**
     * Sets the value of the changePurchaseOrderParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderChangeRequestMsg }
     *     
     */
    public void setChangePurchaseOrderParamIn(PurchaseOrderChangeRequestMsg value) {
        this.changePurchaseOrderParamIn = value;
    }

}
