package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.Budcommsg;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pomocni.PomocnaDatum;

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;

/**
 * <p>
 * Java class for BudgetCommitment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetCommitment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="budgetCommitmentItemList" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}BudgetCommitmentItemList" minOccurs="0"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="budgetCommitmentStatus" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}BudgetCommitmentStatusType"/>
 *         &lt;element name="documentHeader" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetCommitment", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/", propOrder = {
		"dueDate", "budgetCommitmentItemList", "completed",
		"budgetCommitmentStatus", "documentHeader" })
public class BudgetCommitment {

	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar dueDate;
	protected BudgetCommitmentItemList budgetCommitmentItemList;
	@XmlElement(required = true)
	protected BudgetCommitmentStatusType budgetCommitmentStatus;
	// @XmlElement(required = true)
	protected boolean completed = false;
	@XmlElement(required = true)
	protected DocumentHeader documentHeader;

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
	 * Gets the value of the budgetCommitmentItemList property.
	 * 
	 * @return possible object is {@link BudgetCommitmentItemList }
	 * 
	 */
	public BudgetCommitmentItemList getBudgetCommitmentItemList() {
		return budgetCommitmentItemList;
	}

	/**
	 * Sets the value of the budgetCommitmentItemList property.
	 * 
	 * @param value
	 *            allowed object is {@link BudgetCommitmentItemList }
	 * 
	 */
	public void setBudgetCommitmentItemList(BudgetCommitmentItemList value) {
		this.budgetCommitmentItemList = value;
	}

	/**
	 * Gets the value of the budgetCommitmentStatus property.
	 * 
	 * @return possible object is {@link BudgetCommitmentStatusType }
	 * 
	 */
	public BudgetCommitmentStatusType getBudgetCommitmentStatus() {
		return budgetCommitmentStatus;
	}

	/**
	 * Sets the value of the budgetCommitmentStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link BudgetCommitmentStatusType }
	 * 
	 */
	public void setBudgetCommitmentStatus(BudgetCommitmentStatusType value) {
		this.budgetCommitmentStatus = value;
	}

	/**
	 * Gets the value of the completed property.
	 * 
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * Sets the value of the completed property.
	 * 
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
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

	public void postaviVrijednosti(Budcommsg budComMsg, List bctItems,
			Dochead docHead, VendorVeznaDAO vendorVeznaDAO,
			DocheadDAO docHeadDAO) throws Exception {
		dueDate = PomocnaDatum.numDatumUXMLDatum(budComMsg.getDuedate());
		// Podaci iz BCTITEMLST
		if (bctItems != null) {
			budgetCommitmentItemList = new BudgetCommitmentItemList();
			List<BudgetCommitmentItem> budgetCommitmentItems = budgetCommitmentItemList
					.getBudgetCommitmentItem();
			for (Iterator iterator = bctItems.iterator(); iterator.hasNext();) {
				Bcitemlst bctItem = (Bcitemlst) iterator.next();
				BudgetCommitmentItem budgetCommitmentItem = new BudgetCommitmentItem();
				budgetCommitmentItem.postaviVrijednosti(bctItem,
						vendorVeznaDAO, docHeadDAO);

				budgetCommitmentItems.add(budgetCommitmentItem);
			}
		}
		completed = budComMsg.getCompleted().equals("1");
		documentHeader = new DocumentHeader();
		documentHeader.postaviVrijednosti(docHead);
	};
}
