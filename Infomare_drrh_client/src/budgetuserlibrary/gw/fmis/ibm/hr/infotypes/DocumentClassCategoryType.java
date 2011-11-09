package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * Java class for DocumentClassCategoryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentClassCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentClass" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}DocumentClassType"/>
 *         &lt;element name="documentCategory" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}DocumentCategoryType"/>
 *         &lt;element name="documentType" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}DocumentTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentClassCategoryType", propOrder = { "documentClass",
		"documentCategory", "documentType" })
public class DocumentClassCategoryType {

	@XmlElement(required = true)
	protected DocumentClassType documentClass;
	@XmlElement(required = true)
	protected DocumentCategoryType documentCategory;
	@XmlElement(required = true)
	protected String documentType;

	/**
	 * Gets the value of the documentClass property.
	 * 
	 * @return possible object is {@link DocumentClassType }
	 * 
	 */
	public DocumentClassType getDocumentClass() {
		return documentClass;
	}

	/**
	 * Sets the value of the documentClass property.
	 * 
	 * @param value
	 *            allowed object is {@link DocumentClassType }
	 * 
	 */
	public void setDocumentClass(DocumentClassType value) {
		this.documentClass = value;
	}

	/**
	 * Gets the value of the documentCategory property.
	 * 
	 * @return possible object is {@link DocumentCategoryType }
	 * 
	 */
	public DocumentCategoryType getDocumentCategory() {
		return documentCategory;
	}

	/**
	 * Sets the value of the documentCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link DocumentCategoryType }
	 * 
	 */
	public void setDocumentCategory(DocumentCategoryType value) {
		this.documentCategory = value;
	}

	/**
	 * Gets the value of the documentType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the value of the documentType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocumentType(String value) {
		this.documentType = value;
	}

	public void postaviVrijednosti(Dochead docHead) {
		if (StringUtils.isNotBlank(docHead.getDocclass())
				&& StringUtils.isNotBlank(docHead.getDoccateg())) {
			try {
				documentClass = DocumentClassType.valueOf(docHead.getDocclass()
						.trim());
			} catch (Exception e) {
				Log.loger.severe(PomocnaError.getErrorMessage(e));
			}
			try {
				documentCategory = DocumentCategoryType.valueOf(docHead
						.getDoccateg().trim());
			} catch (Exception e) {
				Log.loger.severe(PomocnaError.getErrorMessage(e));
			}
			documentType = StringUtils.trimToNull(docHead.getDoctype());
		}
	}
}
