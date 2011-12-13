
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;


/**
 * <p>Java class for PaymentExecution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentExecution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="documentHeader" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader" minOccurs="0"/>
 *         &lt;element name="localCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="referencedDocumentHeader" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader" minOccurs="0"/>
 *         &lt;element name="masterVendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sapVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buFmisVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentExecutionStatusType" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}PaymentExecutionStatusType" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="isCession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentExecution", propOrder = {
    "amount",
    "documentHeader",
    "localCurrencyAmount",
    "referencedDocumentHeader",
    "masterVendorId",
    "sapVendorId",
    "buFmisVendorId",
    "paymentReference",
    "paymentExecutionStatusType",
    "paymentDate",
    "isCession"
})
public class PaymentExecution {

    protected BigDecimal amount;
    protected DocumentHeader documentHeader;
    protected BigDecimal localCurrencyAmount;
    protected DocumentHeader referencedDocumentHeader;
    protected Long masterVendorId;
    protected String sapVendorId;
    protected String buFmisVendorId;
    protected String paymentReference;
    protected PaymentExecutionStatusType paymentExecutionStatusType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    protected Boolean isCession;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the localCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalCurrencyAmount() {
        return localCurrencyAmount;
    }

    /**
     * Sets the value of the localCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalCurrencyAmount(BigDecimal value) {
        this.localCurrencyAmount = value;
    }

    /**
     * Gets the value of the referencedDocumentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getReferencedDocumentHeader() {
        return referencedDocumentHeader;
    }

    /**
     * Sets the value of the referencedDocumentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setReferencedDocumentHeader(DocumentHeader value) {
        this.referencedDocumentHeader = value;
    }

    /**
     * Gets the value of the masterVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasterVendorId() {
        return masterVendorId;
    }

    /**
     * Sets the value of the masterVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasterVendorId(Long value) {
        this.masterVendorId = value;
    }

    /**
     * Gets the value of the sapVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapVendorId() {
        return sapVendorId;
    }

    /**
     * Sets the value of the sapVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapVendorId(String value) {
        this.sapVendorId = value;
    }

    /**
     * Gets the value of the buFmisVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuFmisVendorId() {
        return buFmisVendorId;
    }

    /**
     * Sets the value of the buFmisVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuFmisVendorId(String value) {
        this.buFmisVendorId = value;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * Gets the value of the paymentExecutionStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExecutionStatusType }
     *     
     */
    public PaymentExecutionStatusType getPaymentExecutionStatusType() {
        return paymentExecutionStatusType;
    }

    /**
     * Sets the value of the paymentExecutionStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExecutionStatusType }
     *     
     */
    public void setPaymentExecutionStatusType(PaymentExecutionStatusType value) {
        this.paymentExecutionStatusType = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the isCession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCession() {
        return isCession;
    }

    /**
     * Sets the value of the isCession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCession(Boolean value) {
        this.isCession = value;
    }

}
