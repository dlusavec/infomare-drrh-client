
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderCreateRequestMsg;


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
 *         &lt;element name="createPurchaseOrderParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}PurchaseOrderCreateRequestMsg"/>
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
    "createPurchaseOrderParamIn"
})
@XmlRootElement(name = "createPurchaseOrder")
public class CreatePurchaseOrder {

    @XmlElement(required = true)
    protected PurchaseOrderCreateRequestMsg createPurchaseOrderParamIn;

    /**
     * Gets the value of the createPurchaseOrderParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderCreateRequestMsg }
     *     
     */
    public PurchaseOrderCreateRequestMsg getCreatePurchaseOrderParamIn() {
        return createPurchaseOrderParamIn;
    }

    /**
     * Sets the value of the createPurchaseOrderParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderCreateRequestMsg }
     *     
     */
    public void setCreatePurchaseOrderParamIn(PurchaseOrderCreateRequestMsg value) {
        this.createPurchaseOrderParamIn = value;
    }

}
