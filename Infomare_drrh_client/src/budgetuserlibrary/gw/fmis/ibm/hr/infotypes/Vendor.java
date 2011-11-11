package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Venbanaccm;
import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pojo.Vendormsg;
import hr.infomare.drrh.postavke.Postavke;

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

/**
 * <p>
 * Java class for Vendor complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogicalSystemVendorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Oib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NaturalPerson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VendorAccountDataList" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}VendorAccountDataList"/>
 *         &lt;element name="VendorGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AlternativeVendorDataList" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}VendorList" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SapVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor", propOrder = { "logicalSystemName",
		"logicalSystemVendorID", "title", "name", "oib", "taxNumber",
		"naturalPerson", "language", "vendorAccountDataList", "vendorGroup",
		"street", "houseNumber", "zipCode", "city", "country", "email", "fax",
		"telephone", "alternativeVendorDataList", "vendorId", "sapVendorId" })
public class Vendor {

	@XmlElement(name = "LogicalSystemName")
	protected String logicalSystemName;
	@XmlElement(name = "LogicalSystemVendorID", required = true)
	protected String logicalSystemVendorID;
	@XmlElement(name = "Title", required = true)
	protected String title;
	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "Oib")
	protected String oib;
	@XmlElement(name = "TaxNumber", required = true)
	protected String taxNumber;
	@XmlElement(name = "NaturalPerson", required = true)
	protected String naturalPerson;
	@XmlElement(name = "Language", required = true)
	protected String language;
	@XmlElement(name = "VendorAccountDataList", required = true)
	protected VendorAccountDataList vendorAccountDataList;
	@XmlElement(name = "VendorGroup")
	protected String vendorGroup;
	@XmlElement(name = "Street", required = true)
	protected String street;
	@XmlElement(name = "HouseNumber", required = true)
	protected String houseNumber;
	@XmlElement(name = "ZipCode")
	protected String zipCode;
	@XmlElement(name = "City")
	protected String city;
	@XmlElement(name = "Country", required = true)
	protected String country;
	@XmlElement(name = "Email", required = true)
	protected String email;
	@XmlElement(name = "Fax", required = true)
	protected String fax;
	@XmlElement(name = "Telephone", required = true)
	protected String telephone;
	@XmlElement(name = "AlternativeVendorDataList")
	protected VendorList alternativeVendorDataList;
	@XmlElement(name = "VendorId")
	protected Long vendorId;
	@XmlElement(name = "SapVendorId")
	protected String sapVendorId;

	/**
	 * Gets the value of the logicalSystemName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogicalSystemName() {
		return logicalSystemName;
	}

	/**
	 * Sets the value of the logicalSystemName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLogicalSystemName(String value) {
		this.logicalSystemName = value;
	}

	/**
	 * Gets the value of the logicalSystemVendorID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogicalSystemVendorID() {
		return logicalSystemVendorID;
	}

	/**
	 * Sets the value of the logicalSystemVendorID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLogicalSystemVendorID(String value) {
		this.logicalSystemVendorID = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the oib property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOib() {
		return oib;
	}

	/**
	 * Sets the value of the oib property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOib(String value) {
		this.oib = value;
	}

	/**
	 * Gets the value of the taxNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaxNumber() {
		return taxNumber;
	}

	/**
	 * Sets the value of the taxNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaxNumber(String value) {
		this.taxNumber = value;
	}

	/**
	 * Gets the value of the naturalPerson property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNaturalPerson() {
		return naturalPerson;
	}

	/**
	 * Sets the value of the naturalPerson property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNaturalPerson(String value) {
		this.naturalPerson = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the vendorAccountDataList property.
	 * 
	 * @return possible object is {@link VendorAccountDataList }
	 * 
	 */
	public VendorAccountDataList getVendorAccountDataList() {
		return vendorAccountDataList;
	}

	/**
	 * Sets the value of the vendorAccountDataList property.
	 * 
	 * @param value
	 *            allowed object is {@link VendorAccountDataList }
	 * 
	 */
	public void setVendorAccountDataList(VendorAccountDataList value) {
		this.vendorAccountDataList = value;
	}

	/**
	 * Gets the value of the vendorGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVendorGroup() {
		return vendorGroup;
	}

	/**
	 * Sets the value of the vendorGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVendorGroup(String value) {
		this.vendorGroup = value;
	}

	/**
	 * Gets the value of the street property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the value of the street property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStreet(String value) {
		this.street = value;
	}

	/**
	 * Gets the value of the houseNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Sets the value of the houseNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHouseNumber(String value) {
		this.houseNumber = value;
	}

	/**
	 * Gets the value of the zipCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the value of the zipCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZipCode(String value) {
		this.zipCode = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountry(String value) {
		this.country = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the fax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the value of the fax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFax(String value) {
		this.fax = value;
	}

	/**
	 * Gets the value of the telephone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Sets the value of the telephone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTelephone(String value) {
		this.telephone = value;
	}

	/**
	 * Gets the value of the alternativeVendorDataList property.
	 * 
	 * @return possible object is {@link VendorList }
	 * 
	 */
	public VendorList getAlternativeVendorDataList() {
		return alternativeVendorDataList;
	}

	/**
	 * Sets the value of the alternativeVendorDataList property.
	 * 
	 * @param value
	 *            allowed object is {@link VendorList }
	 * 
	 */
	public void setAlternativeVendorDataList(VendorList value) {
		this.alternativeVendorDataList = value;
	}

	/**
	 * Gets the value of the vendorId property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getVendorId() {
		return vendorId;
	}

	/**
	 * Sets the value of the vendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setVendorId(Long value) {
		this.vendorId = value;
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

	public void postaviVrijednosti(Vendormsg vendorMsg,
			List<Venbanaccm> venBanAccounti, VendorVezna vendorVezna) {
		logicalSystemName = StringUtils
				.trimToNull(Postavke.LOGICAL_SYSTEM_NAME);
		logicalSystemVendorID = StringUtils.trimToNull(vendorMsg.getF41ctr());
		title = StringUtils.trimToNull(vendorMsg.getTitle());
		name = StringUtils.trimToNull(vendorMsg.getName());
		oib = StringUtils.trimToNull(vendorMsg.getOib());
		taxNumber = StringUtils.trimToNull(vendorMsg.getTaxnumber());
		naturalPerson = Character.toString(vendorMsg.getNaturalpe())
				.equals("1") ? "true" : "false";
		language = StringUtils
				.trimToNull(vendorMsg.getLanguage().toLowerCase());
		// Upis ziro racuna, samo kod upisa novog partnera
		if (((int) vendorMsg.getOpt()) == 1 && venBanAccounti != null
				&& venBanAccounti.size() > 0) {
			vendorAccountDataList = new VendorAccountDataList();
			List<VendorAccountData> vendorAccountDataLista = vendorAccountDataList
					.getVendorAccountData();
			for (Iterator iterator = venBanAccounti.iterator(); iterator
					.hasNext();) {
				Venbanaccm venBanAccM = (Venbanaccm) iterator.next();
				VendorAccountData vendorAccountData = new VendorAccountData();
				vendorAccountData.postaviVrijednosti(venBanAccM);
				vendorAccountDataLista.add(vendorAccountData);
			}
		}
		vendorGroup = StringUtils.trimToNull(vendorMsg.getVendorgro());
		street = StringUtils.trimToNull(vendorMsg.getStreet());
		houseNumber = StringUtils.trimToNull(vendorMsg.getHousenumb());
		zipCode = StringUtils.trimToNull(vendorMsg.getZipcode());
		city = StringUtils.trimToNull(vendorMsg.getCity());
		country = StringUtils.trimToNull(vendorMsg.getCountry());
		email = StringUtils.trimToNull(vendorMsg.getEmail());
		fax = StringUtils.trimToNull(vendorMsg.getFax());
		telephone = StringUtils.trimToNull(vendorMsg.getTelephone());
		// alternativeVendorDataList se nikad ne salje!
		if (((int) vendorMsg.getOpt()) != 1 && vendorVezna != null) {
			vendorId = NumberUtils.toLong(vendorVezna.getF41vid());
			sapVendorId = StringUtils.trimToNull(vendorVezna.getF41svi());
		}
	}
}
