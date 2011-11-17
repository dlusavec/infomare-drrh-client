package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.Invitemlst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for BudgetStructure complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="functionalArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commitmentItem" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}CommitmentItem" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetStructure", namespace = "http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/", propOrder = {
		"fund", "year", "functionalArea", "commitmentItem", "activity",
		"budgetUser" })
public class BudgetStructure {

	protected String fund;
	@XmlElement(required = true)
	protected String year;
	protected String functionalArea;
	protected CommitmentItem commitmentItem;
	protected String activity;
	protected String budgetUser;

	/**
	 * Gets the value of the fund property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFund() {
		return fund;
	}

	/**
	 * Sets the value of the fund property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFund(String value) {
		this.fund = value;
	}

	/**
	 * Gets the value of the year property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Sets the value of the year property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setYear(String value) {
		this.year = value;
	}

	/**
	 * Gets the value of the functionalArea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFunctionalArea() {
		return functionalArea;
	}

	/**
	 * Sets the value of the functionalArea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFunctionalArea(String value) {
		this.functionalArea = value;
	}

	/**
	 * Gets the value of the commitmentItem property.
	 * 
	 * @return possible object is {@link CommitmentItem }
	 * 
	 */
	public CommitmentItem getCommitmentItem() {
		return commitmentItem;
	}

	/**
	 * Sets the value of the commitmentItem property.
	 * 
	 * @param value
	 *            allowed object is {@link CommitmentItem }
	 * 
	 */
	public void setCommitmentItem(CommitmentItem value) {
		this.commitmentItem = value;
	}

	/**
	 * Gets the value of the activity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * Sets the value of the activity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActivity(String value) {
		this.activity = value;
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

	public void postaviVrijednosti(Bcitemlst bctItem) {
		fund = StringUtils.trimToNull(bctItem.getFund());
		year = StringUtils.trimToNull(bctItem.getYearbs());
		functionalArea = StringUtils.trimToNull(bctItem.getFuncarea());
		commitmentItem = new CommitmentItem();
		commitmentItem.postaviVrijednosti(bctItem);
		activity = StringUtils.trimToNull(bctItem.getActivity());
		budgetUser=StringUtils.trimToNull(bctItem.getBuduserbs());
	};

	public void postaviVrijednosti(Invitemlst invItemLst) {
		fund = StringUtils.trimToNull(invItemLst.getFund());
		year = StringUtils.trimToNull(invItemLst.getYearbs());
		functionalArea = StringUtils.trimToNull(invItemLst.getFuncarea());
		commitmentItem = new CommitmentItem();
		commitmentItem.postaviVrijednosti(invItemLst);
		activity = StringUtils.trimToNull(invItemLst.getActivity());
		budgetUser=StringUtils.trimToNull(invItemLst.getBuduserbs());
	};
}
