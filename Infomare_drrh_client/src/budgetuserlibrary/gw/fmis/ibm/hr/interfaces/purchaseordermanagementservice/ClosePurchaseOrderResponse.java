
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderResponseMsg;


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
 *         &lt;element name="closePurchaseOrderParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderResponseMsg"/>
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
    "closePurchaseOrderParamReturn"
})
@XmlRootElement(name = "closePurchaseOrderResponse")
public class ClosePurchaseOrderResponse {

    @XmlElement(required = true)
    protected PurchaseOrderResponseMsg closePurchaseOrderParamReturn;

    /**
     * Gets the value of the closePurchaseOrderParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public PurchaseOrderResponseMsg getClosePurchaseOrderParamReturn() {
        return closePurchaseOrderParamReturn;
    }

    /**
     * Sets the value of the closePurchaseOrderParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public void setClosePurchaseOrderParamReturn(PurchaseOrderResponseMsg value) {
        this.closePurchaseOrderParamReturn = value;
    }

}
