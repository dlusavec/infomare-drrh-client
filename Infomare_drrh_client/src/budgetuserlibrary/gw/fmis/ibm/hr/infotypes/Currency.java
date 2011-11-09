
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pojo.Dochead;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "name",
    "code",
    "codeNum"
})
public class Currency {

	protected String name;
	protected String code;
	protected String codeNum;

	/**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getName() {
		return name;
	}

	/**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setName(String value) {
		this.name = value;
	}

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
     * Gets the value of the codeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getCodeNum() {
		return codeNum;
	}

	/**
     * Sets the value of the codeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setCodeNum(String value) {
		this.codeNum = value;
	}

	public void postaviVrijednosti(Dochead docHead) {
		name = docHead.getCurrname();
		code = docHead.getCurrcode();
		codeNum = docHead.getCurrnum();
	}
}
