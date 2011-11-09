package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Venbanaccm;
import hr.infomare.drrh.pomocni.PomocnaDatum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for VendorAccountData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VendorAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VBDI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SWIFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorBankAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorBankCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferenceDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SapBankType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorAccountData", propOrder = { "vbdi", "iban", "swift",
		"vendorBankAccount", "vendorBankCountry", "referenceDetails",
		"sapBankType", "accountName", "validTo" })
public class VendorAccountData {

	@XmlElement(name = "VBDI", required = true)
	protected String vbdi;
	@XmlElement(name = "IBAN")
	protected String iban;
	@XmlElement(name = "SWIFT")
	protected String swift;
	@XmlElement(name = "VendorBankAccount", required = true)
	protected String vendorBankAccount;
	@XmlElement(name = "VendorBankCountry", required = true)
	protected String vendorBankCountry;
	@XmlElement(name = "ReferenceDetails")
	protected String referenceDetails;
	@XmlElement(name = "SapBankType", nillable = true)
	protected String sapBankType;
	@XmlElement(name = "AccountName")
	protected String accountName;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar validTo;

	/**
	 * Gets the value of the vbdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVBDI() {
		return vbdi;
	}

	/**
	 * Sets the value of the vbdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVBDI(String value) {
		this.vbdi = value;
	}

	/**
	 * Gets the value of the iban property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIBAN() {
		return iban;
	}

	/**
	 * Sets the value of the iban property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIBAN(String value) {
		this.iban = value;
	}

	/**
	 * Gets the value of the swift property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSWIFT() {
		return swift;
	}

	/**
	 * Sets the value of the swift property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSWIFT(String value) {
		this.swift = value;
	}

	/**
	 * Gets the value of the vendorBankAccount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorBankAccount() {
		return vendorBankAccount;
	}

	/**
	 * Sets the value of the vendorBankAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorBankAccount(String value) {
		this.vendorBankAccount = value;
	}

	/**
	 * Gets the value of the vendorBankCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorBankCountry() {
		return vendorBankCountry;
	}

	/**
	 * Sets the value of the vendorBankCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorBankCountry(String value) {
		this.vendorBankCountry = value;
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
	 * Gets the value of the sapBankType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSapBankType() {
		return sapBankType;
	}

	/**
	 * Sets the value of the sapBankType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSapBankType(String value) {
		this.sapBankType = value;
	}

	/**
	 * Gets the value of the accountName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Sets the value of the accountName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountName(String value) {
		this.accountName = value;
	}

	/**
	 * Gets the value of the validTo property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getValidTo() {
		return validTo;
	}

	/**
	 * Sets the value of the validTo property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setValidTo(XMLGregorianCalendar value) {
		this.validTo = value;
	}

	public void postaviVrijednosti(Venbanaccm venBanAccM) {
		vbdi = StringUtils.trimToNull(venBanAccM.getVbdi());
		iban = StringUtils.trimToNull(venBanAccM.getIban());
		swift = StringUtils.trimToNull(venBanAccM.getSwift());
		vendorBankAccount = StringUtils.trimToNull(venBanAccM.getVenbanacc());
		vendorBankCountry = StringUtils.trimToNull(venBanAccM.getVenbancou());
		referenceDetails = StringUtils.trimToNull(venBanAccM.getReference());
		sapBankType = StringUtils.trimToNull(venBanAccM.getSapbanktyp());
		accountName = StringUtils.trimToNull(venBanAccM.getAccountnam());
		validTo = PomocnaDatum.numDatumUXMLDatum(venBanAccM.getValidto());

	}
}
