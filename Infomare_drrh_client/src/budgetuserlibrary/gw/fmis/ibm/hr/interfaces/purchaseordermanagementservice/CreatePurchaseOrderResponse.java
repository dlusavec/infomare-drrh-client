
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
 *         &lt;element name="createPurchaseOrderParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderResponseMsg"/>
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
    "createPurchaseOrderParamReturn"
})
@XmlRootElement(name = "createPurchaseOrderResponse")
public class CreatePurchaseOrderResponse {

    @XmlElement(required = true)
    protected PurchaseOrderResponseMsg createPurchaseOrderParamReturn;

    /**
     * Gets the value of the createPurchaseOrderParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public PurchaseOrderResponseMsg getCreatePurchaseOrderParamReturn() {
        return createPurchaseOrderParamReturn;
    }

    /**
     * Sets the value of the createPurchaseOrderParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderResponseMsg }
     *     
     */
    public void setCreatePurchaseOrderParamReturn(PurchaseOrderResponseMsg value) {
        this.createPurchaseOrderParamReturn = value;
    }

}
