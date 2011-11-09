package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invitemlst;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InvoiceItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetStructure" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetStructure" minOccurs="0"/>
 *         &lt;element name="glAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityUnit" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}QuantityUnitType" minOccurs="0"/>
 *         &lt;element name="referencedDocumentItem" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}ReferencedDocumentItem" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Location" minOccurs="0"/>
 *         &lt;element name="localCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="debitCreditIndicator" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}DebitCreditIndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItem", propOrder = { "budgetStructure", "glAccount",
		"amount", "description", "lineItemNumber", "quantity", "quantityUnit",
		"referencedDocumentItem", "location", "localCurrencyAmount",
		"debitCreditIndicator" })
public class InvoiceItem {

	protected BudgetStructure budgetStructure;
	protected String glAccount;
	protected BigDecimal amount;
	protected String description;
	protected Long lineItemNumber;
	protected BigDecimal quantity;
	protected QuantityUnitType quantityUnit;
	protected ReferencedDocumentItem referencedDocumentItem;
	protected Location location;
	protected BigDecimal localCurrencyAmount;
	protected DebitCreditIndicatorType debitCreditIndicator;

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
	 * Gets the value of the glAccount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGlAccount() {
		return glAccount;
	}

	/**
	 * Sets the value of the glAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGlAccount(String value) {
		this.glAccount = value;
	}

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
	 * Gets the value of the lineItemNumber property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLineItemNumber() {
		return lineItemNumber;
	}

	/**
	 * Sets the value of the lineItemNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLineItemNumber(Long value) {
		this.lineItemNumber = value;
	}

	/**
	 * Gets the value of the quantity property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the quantity property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setQuantity(BigDecimal value) {
		this.quantity = value;
	}

	/**
	 * Gets the value of the quantityUnit property.
	 * 
	 * @return possible object is {@link QuantityUnitType }
	 * 
	 */
	public QuantityUnitType getQuantityUnit() {
		return quantityUnit;
	}

	/**
	 * Sets the value of the quantityUnit property.
	 * 
	 * @param value
	 *            allowed object is {@link QuantityUnitType }
	 * 
	 */
	public void setQuantityUnit(QuantityUnitType value) {
		this.quantityUnit = value;
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

	public void postaviVrijednosti(Invitemlst invItem,
			VendorVeznaDAO vendorVeznaDAO, DocheadDAO docHeadDAO)
			throws Exception {
		budgetStructure = new BudgetStructure();
		budgetStructure.postaviVrijednosti(invItem);
		glAccount = invItem.getGlaccount();
		amount = invItem.getAmountini();
		description = invItem.getDescrt();
		lineItemNumber = invItem.getInvitemid();
		quantity = invItem.getQty();
		// Jmj kolicine, enumeracija koja nije definirana sa njihove strane
		// quantityUnit=invItemLst.getQtyunit();

		// Vezni dokument
		if (invItem.getRefdochead() != null && invItem.getRefdochead() > 0) {
			referencedDocumentItem = new ReferencedDocumentItem();
			referencedDocumentItem.postaviVrijednosti(invItem, docHeadDAO);
		}
		location = new Location();
		location.setLocationName(invItem.getLocation());
		localCurrencyAmount = invItem.getLcuramou();
		try {
			debitCreditIndicator = DebitCreditIndicatorType.valueOf(invItem
					.getDebcreind());
		} catch (Exception e) {
			Log.loger.severe("Greška kod razmjene faktura "
					+ PomocnaError.getErrorMessage(e));

		}

	}

}
