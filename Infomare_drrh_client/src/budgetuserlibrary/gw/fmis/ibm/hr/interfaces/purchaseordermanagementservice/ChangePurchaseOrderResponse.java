
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
 *         &lt;element name="changePurchaseOrderParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderResponseMsg"/>
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
    "changePurchaseOrderParamReturn"
})
@XmlRootElement(name = "changePurchaseOrderResponse")
public class ChangePurchaseOrderResponse {

    @XmlElement(required = true, nillable = true)
    protected PurchaseOrderResponseMsg changePurchaseOrderParamReturn;

    /**
     * Gets the value of the changePurchaseOrderParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public PurchaseOrderResponseMsg getChangePurchaseOrderParamReturn() {
        return changePurchaseOrderParamReturn;
    }

    /**
     * Sets the value of the changePurchaseOrderParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public void setChangePurchaseOrderParamReturn(PurchaseOrderResponseMsg value) {
        this.changePurchaseOrderParamReturn = value;
    }

}
