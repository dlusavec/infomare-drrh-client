
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractResponseMsg;


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
 *         &lt;element name="createContractParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ContractResponseMsg"/>
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
    "createContractParamReturn"
})
@XmlRootElement(name = "createContractResponse")
public class CreateContractResponse {

    @XmlElement(required = true)
    protected ContractResponseMsg createContractParamReturn;

    /**
     * Gets the value of the createContractParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractResponseMsg }
     *     
     */
    public ContractResponseMsg getCreateContractParamReturn() {
        return createContractParamReturn;
    }

    /**
     * Sets the value of the createContractParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractResponseMsg }
     *     
     */
    public void setCreateContractParamReturn(ContractResponseMsg value) {
        this.createContractParamReturn = value;
    }

}
