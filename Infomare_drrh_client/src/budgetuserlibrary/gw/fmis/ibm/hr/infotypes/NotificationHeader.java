
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifiedBudgetUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notifiedLogicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fmisGwNotificationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originatingBuFmisDocumentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sapDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationHeader", propOrder = {
    "notifiedBudgetUser",
    "notifiedLogicalSystemName",
    "fmisGwNotificationId",
    "originatingBuFmisDocumentID",
    "sapDocumentId",
    "notificationDate"
})
public class NotificationHeader {

    @XmlElement(required = true)
    protected String notifiedBudgetUser;
    @XmlElement(required = true)
    protected String notifiedLogicalSystemName;
    @XmlElement(required = true)
    protected String fmisGwNotificationId;
    @XmlElement(required = true)
    protected String originatingBuFmisDocumentID;
    protected String sapDocumentId;
    @XmlElement(required = true)
    protected String notificationDate;

    /**
     * Gets the value of the notifiedBudgetUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifiedBudgetUser() {
        return notifiedBudgetUser;
    }

    /**
     * Sets the value of the notifiedBudgetUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifiedBudgetUser(String value) {
        this.notifiedBudgetUser = value;
    }

    /**
     * Gets the value of the notifiedLogicalSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifiedLogicalSystemName() {
        return notifiedLogicalSystemName;
    }

    /**
     * Sets the value of the notifiedLogicalSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifiedLogicalSystemName(String value) {
        this.notifiedLogicalSystemName = value;
    }

    /**
     * Gets the value of the fmisGwNotificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmisGwNotificationId() {
        return fmisGwNotificationId;
    }

    /**
     * Sets the value of the fmisGwNotificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmisGwNotificationId(String value) {
        this.fmisGwNotificationId = value;
    }

    /**
     * Gets the value of the originatingBuFmisDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingBuFmisDocumentID() {
        return originatingBuFmisDocumentID;
    }

    /**
     * Sets the value of the originatingBuFmisDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingBuFmisDocumentID(String value) {
        this.originatingBuFmisDocumentID = value;
    }

    /**
     * Gets the value of the sapDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapDocumentId() {
        return sapDocumentId;
    }

    /**
     * Sets the value of the sapDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapDocumentId(String value) {
        this.sapDocumentId = value;
    }

    /**
     * Gets the value of the notificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDate() {
        return notificationDate;
    }

    /**
     * Sets the value of the notificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDate(String value) {
        this.notificationDate = value;
    }

}
