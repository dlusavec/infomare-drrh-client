package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for VendorItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VendorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterVendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="buFmisVendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sapVendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternativeMasterVendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="alternativeBuFmisVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternativeSapVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseBank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorBank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instructionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitCreditIndicator" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}DebitCreditIndicatorType"/>
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorItem", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/", propOrder = {
		"masterVendorId", "buFmisVendorId", "sapVendorId",
		"alternativeMasterVendorId", "alternativeBuFmisVendorId",
		"alternativeSapVendorId", "paymentReference", "description",
		"houseBank", "vendorBank", "instructionKey", "referenceDetails",
		"vendorAccountNumber", "debitCreditIndicator", "lineItemNumber" })
public class VendorItem {

	protected Long masterVendorId;
	@XmlElement(required = true)
	protected String buFmisVendorId;
	@XmlElement(required = true)
	protected String sapVendorId;
	protected Long alternativeMasterVendorId;
	protected String alternativeBuFmisVendorId;
	protected String alternativeSapVendorId;
	protected String paymentReference;
	protected String description;
	@XmlElement(required = true, defaultValue = "HNB")
	protected String houseBank;
	@XmlElement(required = true)
	protected String vendorBank;
	protected String instructionKey;
	protected String referenceDetails;
	protected String vendorAccountNumber;
	@XmlElement(required = true)
	protected DebitCreditIndicatorType debitCreditIndicator;
	protected long lineItemNumber;

	/**
	 * Gets the value of the masterVendorId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getMasterVendorId() {
		return masterVendorId;
	}

	/**
	 * Sets the value of the masterVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setMasterVendorId(Long value) {
		this.masterVendorId = value;
	}

	/**
	 * Gets the value of the buFmisVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuFmisVendorId() {
		return buFmisVendorId;
	}

	/**
	 * Sets the value of the buFmisVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuFmisVendorId(String value) {
		this.buFmisVendorId = value;
	}

	/**
	 * Gets the value of the sapVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSapVendorId() {
		return sapVendorId;
	}

	/**
	 * Sets the value of the sapVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSapVendorId(String value) {
		this.sapVendorId = value;
	}

	/**
	 * Gets the value of the alternativeMasterVendorId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getAlternativeMasterVendorId() {
		return alternativeMasterVendorId;
	}

	/**
	 * Sets the value of the alternativeMasterVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setAlternativeMasterVendorId(Long value) {
		this.alternativeMasterVendorId = value;
	}

	/**
	 * Gets the value of the alternativeBuFmisVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlternativeBuFmisVendorId() {
		return alternativeBuFmisVendorId;
	}

	/**
	 * Sets the value of the alternativeBuFmisVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlternativeBuFmisVendorId(String value) {
		this.alternativeBuFmisVendorId = value;
	}

	/**
	 * Gets the value of the alternativeSapVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlternativeSapVendorId() {
		return alternativeSapVendorId;
	}

	/**
	 * Sets the value of the alternativeSapVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlternativeSapVendorId(String value) {
		this.alternativeSapVendorId = value;
	}

	/**
	 * Gets the value of the paymentReference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentReference() {
		return paymentReference;
	}

	/**
	 * Sets the value of the paymentReference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentReference(String value) {
		this.paymentReference = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the houseBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHouseBank() {
		return houseBank;
	}

	/**
	 * Sets the value of the houseBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHouseBank(String value) {
		this.houseBank = value;
	}

	/**
	 * Gets the value of the vendorBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorBank() {
		return vendorBank;
	}

	/**
	 * Sets the value of the vendorBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorBank(String value) {
		this.vendorBank = value;
	}

	/**
	 * Gets the value of the instructionKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInstructionKey() {
		return instructionKey;
	}

	/**
	 * Sets the value of the instructionKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInstructionKey(String value) {
		this.instructionKey = value;
	}

	/**
	 * Gets the value of the referenceDetails property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReferenceDetails() {
		return referenceDetails;
	}

	/**
	 * Sets the value of the referenceDetails property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReferenceDetails(String value) {
		this.referenceDetails = value;
	}

	/**
	 * Gets the value of the vendorAccountNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorAccountNumber() {
		return vendorAccountNumber;
	}

	/**
	 * Sets the value of the vendorAccountNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorAccountNumber(String value) {
		this.vendorAccountNumber = value;
	}

	/**
	 * Gets the value of the debitCreditIndicator property.
	 * 
	 * @return possible object is {@link DebitCreditIndicatorType }
	 * 
	 */
	public DebitCreditIndicatorType getDebitCreditIndicator() {
		return debitCreditIndicator;
	}

	/**
	 * Sets the value of the debitCreditIndicator property.
	 * 
	 * @param value
	 *            allowed object is {@link DebitCreditIndicatorType }
	 * 
	 */
	public void setDebitCreditIndicator(DebitCreditIndicatorType value) {
		this.debitCreditIndicator = value;
	}

	/**
	 * Gets the value of the lineItemNumber property.
	 * 
	 */
	public long getLineItemNumber() {
		return lineItemNumber;
	}

	/**
	 * Sets the value of the lineItemNumber property.
	 * 
	 */
	public void setLineItemNumber(long value) {
		this.lineItemNumber = value;
	}

	public void postaviVrijednosti(Invoicemsg invoiceMsg,
			VendorVeznaDAO vendorVeznaDAO) {
		VendorVezna vendorVezna = vendorVeznaDAO.getVendorVeznaByPK(StringUtils
				.trimToNull(invoiceMsg.getBufmisven()));
		if (vendorVezna != null) {
			masterVendorId = Long.parseLong(vendorVezna.getF41ctr().trim());
			// Citam iz InvoiceMSG
			// buFmisVendorId = vendorVezna.getF41vid();
			sapVendorId = StringUtils.trimToNull(vendorVezna.getF41svi());
		}
		buFmisVendorId = StringUtils.trimToNull(invoiceMsg.getBufmisven());
		paymentReference = StringUtils.trimToNull(invoiceMsg.getPayref());
		description = StringUtils.trimToNull(invoiceMsg.getPaydesc());
		houseBank = StringUtils.trimToNull(invoiceMsg.getHousebank());
		vendorBank = StringUtils.trimToNull(invoiceMsg.getVendobank());
		instructionKey = StringUtils.trimToNull(invoiceMsg.getInstrkey());
		referenceDetails = StringUtils.trimToNull(invoiceMsg.getRefdetail());
		vendorAccountNumber = StringUtils.trimToNull(invoiceMsg.getVenaccnum());
		lineItemNumber=invoiceMsg.getVenitemid();
		try {
			debitCreditIndicator = DebitCreditIndicatorType.valueOf(invoiceMsg
					.getDebcreind());
		} catch (Exception e) {
			Log.loger.severe("Greška kod razmjene faktura "
					+ PomocnaError.getErrorMessage(e));

		}

	};
}
