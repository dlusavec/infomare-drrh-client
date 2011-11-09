
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.Invitemlst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 * <p>Java class for CommitmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}CommitmentItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentItem", propOrder = {
    "code",
    "year",
    "description",
    "type"
})
public class CommitmentItem {

	protected String code;
	protected String year;
	protected String description;
	protected CommitmentItemType type;

	/**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getCode() {
		return code;
	}

	/**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setCode(String value) {
		this.code = value;
	}

	/**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getYear() {
		return year;
	}

	/**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setYear(String value) {
		this.year = value;
	}

	/**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getDescription() {
		return description;
	}

	/**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentItemType }
     *     
     */
	public CommitmentItemType getType() {
		return type;
	}

	/**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentItemType }
     *     
     */
	public void setType(CommitmentItemType value) {
		this.type = value;
	}

	public void postaviVrijednosti(Bcitemlst bctItem) {
		code = bctItem.getCode();
		year = bctItem.getYearci();
		description = bctItem.getDescrt();
		if (StringUtils.isNotBlank(bctItem.getType())) {
			type = new CommitmentItemType();
			type.setName(bctItem.getType());
		}
	}
	public void postaviVrijednosti(Invitemlst invItemlst) {
		code = invItemlst.getCode();
		year = invItemlst.getYearci();
		description = invItemlst.getDescrt();
		if (StringUtils.isNotBlank(invItemlst.getType())) {
			type = new CommitmentItemType();
			type.setName(invItemlst.getType());
		}
	}
}
