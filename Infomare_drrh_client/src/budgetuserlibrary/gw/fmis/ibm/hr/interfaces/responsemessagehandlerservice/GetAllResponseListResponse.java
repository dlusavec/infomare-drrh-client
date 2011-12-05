
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
 *         &lt;element name="distributionMessageList" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "distributionMessageList"
})
@XmlRootElement(name = "getAllResponseListResponse")
public class GetAllResponseListResponse {

    @XmlElement(required = true, nillable = true)
    protected Object distributionMessageList;

    /**
     * Gets the value of the distributionMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDistributionMessageList() {
        return distributionMessageList;
    }

    /**
     * Sets the value of the distributionMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDistributionMessageList(Object value) {
        this.distributionMessageList = value;
    }

}
