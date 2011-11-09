
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invitemlst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;

/**
 * <p>Java class for ReferencedDocumentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedDocumentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencedDocumentHeader" type="{http://hr.ibm.fmis.gw.BUFMISBudgetExecution/infotypes/}DocumentHeader" minOccurs="0"/>
 *         &lt;element name="referencedLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedDocumentItem", propOrder = {
    "referencedDocumentHeader",
    "referencedLineItemNumber"
})
public class ReferencedDocumentItem {

	protected DocumentHeader referencedDocumentHeader;
	protected Long referencedLineItemNumber;

	/**
     * Gets the value of the referencedDocumentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
	public DocumentHeader getReferencedDocumentHeader() {
		return referencedDocumentHeader;
	}

	/**
     * Sets the value of the referencedDocumentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
	public void setReferencedDocumentHeader(DocumentHeader value) {
		this.referencedDocumentHeader = value;
	}

	/**
     * Gets the value of the referencedLineItemNumber property.
     * 
     */
	public long getReferencedLineItemNumber() {
		return referencedLineItemNumber;
	}

	/**
     * Sets the value of the referencedLineItemNumber property.
     * 
     */
    public void setReferencedLineItemNumber(long value) {
        this.referencedLineItemNumber = value;
    }

	/**
	 * Sets the value of the referencedLineItemNumber property.
	 * 
	 */
	public void setReferencedLineItemNumber(Long value) {
		this.referencedLineItemNumber = value;
	}

	public void postaviVrijednosti(Bcitemlst bctItem, DocheadDAO docHeadDAO) {
		Dochead docHead=docHeadDAO.getDocHeadByPK(bctItem.getRefdochead());
		referencedDocumentHeader= new DocumentHeader();
		referencedDocumentHeader.postaviVrijednosti(docHead);		
		referencedLineItemNumber= StringUtils.isNotBlank(bctItem.getRefitemnum()) ? Long.parseLong(bctItem.getRefitemnum()): null;		
	}
	public void postaviVrijednosti(Invitemlst invItem, DocheadDAO docHeadDAO) {
		Dochead docHead=docHeadDAO.getDocHeadByPK(invItem.getRefdochead());
		referencedDocumentHeader= new DocumentHeader();
		referencedDocumentHeader.postaviVrijednosti(docHead);		
		referencedLineItemNumber= invItem.getLineitnum();		
	}
}
