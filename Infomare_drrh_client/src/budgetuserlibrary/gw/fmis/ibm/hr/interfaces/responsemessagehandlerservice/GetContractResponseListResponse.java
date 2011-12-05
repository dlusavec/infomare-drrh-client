
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="contractResponseList" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "contractResponseList"
})
@XmlRootElement(name = "getContractResponseListResponse")
public class GetContractResponseListResponse {

    @XmlElement(required = true, nillable = true)
    protected Object contractResponseList;

    /**
     * Gets the value of the contractResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContractResponseList() {
        return contractResponseList;
    }

    /**
     * Sets the value of the contractResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContractResponseList(Object value) {
        this.contractResponseList = value;
    }

}
