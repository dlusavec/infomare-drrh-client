
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractCreateRequestMsg;


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
 *         &lt;element name="createContractParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ContractCreateRequestMsg"/>
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
    "createContractParamIn"
})
@XmlRootElement(name = "createContract")
public class CreateContract {

    @XmlElement(required = true)
    protected ContractCreateRequestMsg createContractParamIn;

    /**
     * Gets the value of the createContractParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCreateRequestMsg }
     *     
     */
    public ContractCreateRequestMsg getCreateContractParamIn() {
        return createContractParamIn;
    }

    /**
     * Sets the value of the createContractParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCreateRequestMsg }
     *     
     */
    public void setCreateContractParamIn(ContractCreateRequestMsg value) {
        this.createContractParamIn = value;
    }

}
