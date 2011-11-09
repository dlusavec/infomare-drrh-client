
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractCloseRequestMsg;


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
 *         &lt;element name="closeContractParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ContractCloseRequestMsg"/>
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
    "closeContractParamIn"
})
@XmlRootElement(name = "closeContract")
public class CloseContract {

    @XmlElement(required = true)
    protected ContractCloseRequestMsg closeContractParamIn;

    /**
     * Gets the value of the closeContractParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCloseRequestMsg }
     *     
     */
    public ContractCloseRequestMsg getCloseContractParamIn() {
        return closeContractParamIn;
    }

    /**
     * Sets the value of the closeContractParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCloseRequestMsg }
     *     
     */
    public void setCloseContractParamIn(ContractCloseRequestMsg value) {
        this.closeContractParamIn = value;
    }

}
