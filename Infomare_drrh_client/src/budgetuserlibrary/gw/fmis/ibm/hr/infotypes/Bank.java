package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Bankmsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for Bank complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Bank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vbdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StreetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bank", propOrder = { "vbdi", "name", "swift", "streetName",
		"streetNumber", "city", "zipCode", "countryCode" })
public class Bank {

	@XmlElement(name = "Vbdi")
	protected String vbdi;
	@XmlElement(name = "Name", required = true)
	protected String name;
	@XmlElement(name = "Swift")
	protected String swift;
	@XmlElement(name = "StreetName", required = true)
	protected String streetName;
	@XmlElement(name = "StreetNumber", required = true)
	protected String streetNumber;
	@XmlElement(name = "City", required = true)
	protected String city;
	@XmlElement(name = "ZipCode", required = true)
	protected String zipCode;
	@XmlElement(name = "CountryCode", required = true)
	protected String countryCode;

	/**
	 * Gets the value of the vbdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVbdi() {
		return vbdi;
	}

	/**
	 * Sets the value of the vbdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVbdi(String value) {
		this.vbdi = value;
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
	 * Gets the value of the swift property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSwift() {
		return swift;
	}

	/**
	 * Sets the value of the swift property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSwift(String value) {
		this.swift = value;
	}

	/**
	 * Gets the value of the streetName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the value of the streetName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStreetName(String value) {
		this.streetName = value;
	}

	/**
	 * Gets the value of the streetNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * Sets the value of the streetNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStreetNumber(String value) {
		this.streetNumber = value;
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
	 * Gets the value of the countryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the countryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public void postaviVrijednosti(Bankmsg bankMsg) {
		this.vbdi = StringUtils.trimToNull(bankMsg.getVbdi());
		this.name = StringUtils.trimToNull(bankMsg.getName());
		this.swift = StringUtils.trimToNull(bankMsg.getSwift());
		this.streetName = StringUtils.trimToNull(bankMsg.getStreet());
		this.streetNumber = StringUtils.trimToNull(bankMsg.getStreetnum());
		this.city = StringUtils.trimToNull(bankMsg.getCity());
		this.zipCode = StringUtils.trimToNull(bankMsg.getZipcode());
		this.countryCode = StringUtils.trimToNull(bankMsg.getCountryco());
	}
}
