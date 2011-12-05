
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
 *         &lt;element name="logicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "logicalSystemName",
    "messageId"
})
@XmlRootElement(name = "getAllResponseListStartingWithMessageId")
public class GetAllResponseListStartingWithMessageId {

    @XmlElement(required = true, nillable = true)
    protected String logicalSystemName;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long messageId;

    /**
     * Gets the value of the logicalSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalSystemName() {
        return logicalSystemName;
    }

    /**
     * Sets the value of the logicalSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalSystemName(String value) {
        this.logicalSystemName = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageId(Long value) {
        this.messageId = value;
    }

}
