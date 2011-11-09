package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invitemlst;
import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pomocni.PomocnaDatum;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;

/**
 * <p>
 * Java class for Invoice complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceStatus" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}InvoiceStatusType" minOccurs="0"/>
 *         &lt;element name="documentHeader" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader" minOccurs="0"/>
 *         &lt;element name="invoiceItemList" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}IncoiceItemList" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vendorItemList" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}VendorItemList" minOccurs="0"/>
 *         &lt;element name="isCession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="documentBlock" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creditMemoBuFmisDocumentId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = { "invoiceStatus", "documentHeader",
		"invoiceItemList", "dueDate", "amount", "localCurrencyAmount",
		"vendorItemList", "isCession", "documentBlock",
		"creditMemoBuFmisDocumentId" })
public class Invoice {

	protected InvoiceStatusType invoiceStatus;
	protected DocumentHeader documentHeader;
	protected IncoiceItemList invoiceItemList;
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dueDate;
	protected BigDecimal amount;
	protected BigDecimal localCurrencyAmount;
	protected VendorItemList vendorItemList;
	protected Boolean isCession;
	protected String documentBlock;
	protected String creditMemoBuFmisDocumentId;

	/**
	 * Gets the value of the invoiceStatus property.
	 * 
	 * @return possible object is {@link InvoiceStatusType }
	 * 
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	/**
	 * Sets the value of the invoiceStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link InvoiceStatusType }
	 * 
	 */
	public void setInvoiceStatus(InvoiceStatusType value) {
		this.invoiceStatus = value;
	}

	/**
	 * Gets the value of the documentHeader property.
	 * 
	 * @return possible object is {@link DocumentHeader }
	 * 
	 */
	public DocumentHeader getDocumentHeader() {
		return documentHeader;
	}

	/**
	 * Sets the value of the documentHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link DocumentHeader }
	 * 
	 */
	public void setDocumentHeader(DocumentHeader value) {
		this.documentHeader = value;
	}

	/**
	 * Gets the value of the invoiceItemList property.
	 * 
	 * @return possible object is {@link IncoiceItemList }
	 * 
	 */
	public IncoiceItemList getInvoiceItemList() {
		return invoiceItemList;
	}

	/**
	 * Sets the value of the invoiceItemList property.
	 * 
	 * @param value
	 *            allowed object is {@link IncoiceItemList }
	 * 
	 */
	public void setInvoiceItemList(IncoiceItemList value) {
		this.invoiceItemList = value;
	}

	/**
	 * Gets the value of the dueDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the value of the dueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDueDate(XMLGregorianCalendar value) {
		this.dueDate = value;
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
	 * Gets the value of the vendorItemList property.
	 * 
	 * @return possible object is {@link VendorItemList }
	 * 
	 */
	public VendorItemList getVendorItemList() {
		return vendorItemList;
	}

	/**
	 * Sets the value of the vendorItemList property.
	 * 
	 * @param value
	 *            allowed object is {@link VendorItemList }
	 * 
	 */
	public void setVendorItemList(VendorItemList value) {
		this.vendorItemList = value;
	}

	/**
	 * Gets the value of the isCession property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsCession() {
		return isCession;
	}

	/**
	 * Sets the value of the isCession property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsCession(Boolean value) {
		this.isCession = value;
	}

	/**
	 * Gets the value of the documentBlock property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocumentBlock() {
		return documentBlock;
	}

	/**
	 * Sets the value of the documentBlock property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocumentBlock(String value) {
		this.documentBlock = value;
	}

	/**
	 * Gets the value of the creditMemoBuFmisDocumentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreditMemoBuFmisDocumentId() {
		return creditMemoBuFmisDocumentId;
	}

	/**
	 * Sets the value of the creditMemoBuFmisDocumentId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreditMemoBuFmisDocumentId(String value) {
		this.creditMemoBuFmisDocumentId = value;
	}

	public void postaviVrijednosti(Invoicemsg invoiceMsg, List invItemLst,
			Dochead docHead, DocheadDAO docHeadDAO,
			VendorVeznaDAO vendorVeznaDAO) throws Exception {
		dueDate = PomocnaDatum.numDatumUXMLDatum(invoiceMsg.getDuedate());
		// Podaci iz BCTITEMLST
		if (invItemLst != null) {
			invoiceItemList = new IncoiceItemList();
			List<InvoiceItem> invoiceItems = invoiceItemList.getInvoiceItem();
			for (Iterator iterator = invoiceItems.iterator(); iterator
					.hasNext();) {
				Invitemlst invItem = (Invitemlst) iterator.next();
				InvoiceItem invoiceItem = new InvoiceItem();
				invoiceItem.postaviVrijednosti(invItem, vendorVeznaDAO,
						docHeadDAO);
				invoiceItems.add(invoiceItem);
			}
		}
		documentHeader = new DocumentHeader();
		documentHeader.postaviVrijednosti(docHead);
		amount = invoiceMsg.getAmount();
		localCurrencyAmount = invoiceMsg.getInvlcam();
		vendorItemList = new VendorItemList();
		List<VendorItem> vendorItems = vendorItemList.getVendorItem();
		VendorItem vendorItem = new VendorItem();
		vendorItem.postaviVrijednosti(invoiceMsg, vendorVeznaDAO);
		vendorItems.add(vendorItem);
		isCession = invoiceMsg.getIscess().equals("1");
		documentBlock = StringUtils.trimToNull(invoiceMsg.getDocbloc());
		creditMemoBuFmisDocumentId = invoiceMsg.getCmbufmisid() == 0 ? null
				: Integer.toString(invoiceMsg.getCmbufmisid());
	}
}