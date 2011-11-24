package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pomocni.PomocnaDatum;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for BudgetCommitmentItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetCommitmentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="budgetStructure" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetStructure"/>
 *         &lt;element name="bufmisVendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterVendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sapVendorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="referencedDocumentItem" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ReferencedDocumentItem" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetCommitmentItem", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/", propOrder = {
		"amount", "localCurrencyAmount", "itemDueDate", "budgetStructure",
		"bufmisVendorId", "masterVendorId", "sapVendorId", "lineItemNumber",
		"referencedDocumentItem", "location" })
public class BudgetCommitmentItem {

	protected BigDecimal amount;
	protected BigDecimal localCurrencyAmount;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar itemDueDate;
	@XmlElement(required = true)
	protected BudgetStructure budgetStructure;
	@XmlElement(required = true)
	protected String bufmisVendorId;
	@XmlElement(required = true)
	protected String masterVendorId;
	@XmlElement(required = true)
	protected String sapVendorId;
	protected long lineItemNumber;
	protected ReferencedDocumentItem referencedDocumentItem;
	protected Location location;

	/**
	 * Gets the value of the amount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAmount(BigDecimal value) {
		this.amount = value;
	}

	/**
	 * Gets the value of the localCurrencyAmount property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getLocalCurrencyAmount() {
		return localCurrencyAmount;
	}

	/**
	 * Sets the value of the localCurrencyAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setLocalCurrencyAmount(BigDecimal value) {
		this.localCurrencyAmount = value;
	}

	/**
	 * Gets the value of the itemDueDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getItemDueDate() {
		return itemDueDate;
	}

	/**
	 * Sets the value of the itemDueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setItemDueDate(XMLGregorianCalendar value) {
		this.itemDueDate = value;
	}

	/**
	 * Gets the value of the budgetStructure property.
	 * 
	 * @return possible object is {@link BudgetStructure }
	 * 
	 */
	public BudgetStructure getBudgetStructure() {
		return budgetStructure;
	}

	/**
	 * Sets the value of the budgetStructure property.
	 * 
	 * @param value
	 *            allowed object is {@link BudgetStructure }
	 * 
	 */
	public void setBudgetStructure(BudgetStructure value) {
		this.budgetStructure = value;
	}

	/**
	 * Gets the value of the bufmisVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBufmisVendorId() {
		return bufmisVendorId;
	}

	/**
	 * Sets the value of the bufmisVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBufmisVendorId(String value) {
		this.bufmisVendorId = value;
	}

	/**
	 * Gets the value of the masterVendorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMasterVendorId() {
		return masterVendorId;
	}

	/**
	 * Sets the value of the masterVendorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMasterVendorId(String value) {
		this.masterVendorId = value;
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

	/**
	 * Gets the value of the referencedDocumentItem property.
	 * 
	 * @return possible object is {@link ReferencedDocumentItem }
	 * 
	 */
	public ReferencedDocumentItem getReferencedDocumentItem() {
		return referencedDocumentItem;
	}

	/**
	 * Sets the value of the referencedDocumentItem property.
	 * 
	 * @param value
	 *            allowed object is {@link ReferencedDocumentItem }
	 * 
	 */
	public void setReferencedDocumentItem(ReferencedDocumentItem value) {
		this.referencedDocumentItem = value;
	}

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link Location }
	 * 
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link Location }
	 * 
	 */
	public void setLocation(Location value) {
		this.location = value;
	}

	public void postaviVrijednosti(Bcitemlst bctItem,
			VendorVeznaDAO vendorVeznaDAO, DocheadDAO docHeadDAO)
			throws Exception {
		amount = bctItem.getAmount();
		localCurrencyAmount = bctItem.getAmount();
		itemDueDate = PomocnaDatum.numDatumUXMLDatum(bctItem.getItduedat());
		budgetStructure = new BudgetStructure();
		budgetStructure.postaviVrijednosti(bctItem);
		if (StringUtils.isNotBlank(bctItem.getVendorid())) {
			VendorVezna vendorVezna = vendorVeznaDAO.getVendorVeznaByPK(bctItem
					.getVendorid());
			if (vendorVezna != null) {
				bufmisVendorId = StringUtils
						.trimToNull(vendorVezna.getF41ctr());
				masterVendorId = StringUtils
						.trimToNull(vendorVezna.getF41vid());
				sapVendorId = StringUtils.trimToNull(vendorVezna.getF41svi());
			}
		}
		if (bctItem.getRefdochead() != null) {
			referencedDocumentItem = new ReferencedDocumentItem();
			referencedDocumentItem.postaviVrijednosti(bctItem, docHeadDAO);
		}
		lineItemNumber = bctItem.getBcitemid();
		if (StringUtils.isNotBlank(bctItem.getLocationbc())) {
			location = new Location();
			location.setLocationName(StringUtils.trimToNull(bctItem
					.getLocationbc()));
		}
	}
}
