
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractChangeRequestMsg;


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
 *         &lt;element name="changeContractParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ContractChangeRequestMsg"/>
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
    "changeContractParamIn"
})
@XmlRootElement(name = "changeContract")
public class ChangeContract {

    @XmlElement(required = true, nillable = true)
    protected ContractChangeRequestMsg changeContractParamIn;

    /**
     * Gets the value of the changeContractParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractChangeRequestMsg }
     *     
     */
    public ContractChangeRequestMsg getChangeContractParamIn() {
        return changeContractParamIn;
    }

    /**
     * Sets the value of the changeContractParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractChangeRequestMsg }
     *     
     */
    public void setChangeContractParamIn(ContractChangeRequestMsg value) {
        this.changeContractParamIn = value;
    }

}
