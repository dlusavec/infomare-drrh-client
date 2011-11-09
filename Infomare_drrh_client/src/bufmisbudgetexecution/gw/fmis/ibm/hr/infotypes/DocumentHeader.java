package bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pomocni.PomocnaDatum;
import hr.infomare.drrh.postavke.Postavke;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Currency;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.DocumentClassCategoryType;

/**
 * <p>
 * Java class for DocumentHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="budgetUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buFmisDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="reference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currency" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Currency"/>
 *         &lt;element name="postingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentClassCategory" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}DocumentClassCategoryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentHeader", propOrder = { "logicalSystemName",
		"budgetUser", "buFmisDocumentId", "documentDate", "reference",
		"currency", "postingDate", "description", "companyCode",
		"documentClassCategory" })
public class DocumentHeader {

	@XmlElement(required = true)
	protected String logicalSystemName;
	@XmlElement(required = true)
	protected String budgetUser;
	@XmlElement(required = true)
	protected String buFmisDocumentId;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar documentDate;
	protected String reference;
	@XmlElement(required = true)
	protected Currency currency;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar postingDate;
	protected String description;
	@XmlElement(required = true, defaultValue = "DRRH")
	protected String companyCode;
	@XmlElement(required = true)
	protected DocumentClassCategoryType documentClassCategory;

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
	 * Gets the value of the budgetUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBudgetUser() {
		return budgetUser;
	}

	/**
	 * Sets the value of the budgetUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBudgetUser(String value) {
		this.budgetUser = value;
	}

	/**
	 * Gets the value of the buFmisDocumentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBuFmisDocumentId() {
		return buFmisDocumentId;
	}

	/**
	 * Sets the value of the buFmisDocumentId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBuFmisDocumentId(String value) {
		this.buFmisDocumentId = value;
	}

	/**
	 * Gets the value of the documentDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDocumentDate() {
		return documentDate;
	}

	/**
	 * Sets the value of the documentDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDocumentDate(XMLGregorianCalendar value) {
		this.documentDate = value;
	}

	/**
	 * Gets the value of the reference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Sets the value of the reference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReference(String value) {
		this.reference = value;
	}

	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link Currency }
	 * 
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value
	 *            allowed object is {@link Currency }
	 * 
	 */
	public void setCurrency(Currency value) {
		this.currency = value;
	}

	/**
	 * Gets the value of the postingDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getPostingDate() {
		return postingDate;
	}

	/**
	 * Sets the value of the postingDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setPostingDate(XMLGregorianCalendar value) {
		this.postingDate = value;
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
	 * Gets the value of the companyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * Sets the value of the companyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyCode(String value) {
		this.companyCode = value;
	}

	/**
	 * Gets the value of the documentClassCategory property.
	 * 
	 * @return possible object is {@link DocumentClassCategoryType }
	 * 
	 */
	public DocumentClassCategoryType getDocumentClassCategory() {
		return documentClassCategory;
	}

	/**
	 * Sets the value of the documentClassCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link DocumentClassCategoryType }
	 * 
	 */
	public void setDocumentClassCategory(DocumentClassCategoryType value) {
		this.documentClassCategory = value;
	}

	public void postaviVrijednosti(Dochead docHead) {
		logicalSystemName = Postavke.LOGICAL_SYSTEM_NAME;
		budgetUser = StringUtils.trimToNull(docHead.getBudgetuser());
		buFmisDocumentId = Integer.toString(docHead.getBufmisdoc());
		documentDate = PomocnaDatum.numDatumUXMLDatum(docHead.getDocdate());
		reference = StringUtils.trimToNull(docHead.getReference());
		currency = new Currency();
		currency.postaviVrijednosti(docHead);
		postingDate = PomocnaDatum.numDatumUXMLDatum(docHead.getPostdate());
		description = StringUtils.trimToNull(docHead.getDescripthd());
		companyCode = StringUtils.trimToNull(docHead.getCompanyco());
		documentClassCategory = new DocumentClassCategoryType();
		documentClassCategory.postaviVrijednosti(docHead);
	}
}
