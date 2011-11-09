
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderCloseRequestMsg;


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
 *         &lt;element name="closePurchaseOrderParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderCloseRequestMsg"/>
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
    "closePurchaseOrderParamIn"
})
@XmlRootElement(name = "closePurchaseOrder")
public class ClosePurchaseOrder {

    @XmlElement(required = true)
    protected PurchaseOrderCloseRequestMsg closePurchaseOrderParamIn;

    /**
     * Gets the value of the closePurchaseOrderParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderCloseRequestMsg }
     *     
     */
    public PurchaseOrderCloseRequestMsg getClosePurchaseOrderParamIn() {
        return closePurchaseOrderParamIn;
    }

    /**
     * Sets the value of the closePurchaseOrderParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderCloseRequestMsg }
     *     
     */
    public void setClosePurchaseOrderParamIn(PurchaseOrderCloseRequestMsg value) {
        this.closePurchaseOrderParamIn = value;
    }

}
