
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetCommitmentStatusNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetCommitmentStatusNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}NotificationHeader"/>
 *         &lt;element name="commitmentStatus" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetCommitmentStatusType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetCommitmentStatusNotification", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/", propOrder = {
    "header",
    "commitmentStatus",
    "description"
})
public class BudgetCommitmentStatusNotification {

    @XmlElement(required = true)
    protected NotificationHeader header;
    @XmlElement(required = true)
    protected BudgetCommitmentStatusType commitmentStatus;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationHeader }
     *     
     */
    public NotificationHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationHeader }
     *     
     */
    public void setHeader(NotificationHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the commitmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetCommitmentStatusType }
     *     
     */
    public BudgetCommitmentStatusType getCommitmentStatus() {
        return commitmentStatus;
    }

    /**
     * Sets the value of the commitmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetCommitmentStatusType }
     *     
     */
    public void setCommitmentStatus(BudgetCommitmentStatusType value) {
        this.commitmentStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
