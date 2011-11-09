
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import hr.infomare.drrh.postavke.Postavke;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Bank;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;

/**
 * <p>Java class for BankChangeRequestMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankChangeRequestMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="bank" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Bank" minOccurs="0"/>
 *         &lt;element name="logicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankChangeRequestMsg", propOrder = {
    "messageHeader",
    "bank",
    "logicalSystemName"
})
public class BankChangeRequestMsg {

	protected MessageHeader messageHeader;
	protected Bank bank;
	protected String logicalSystemName = Postavke.LOGICAL_SYSTEM_NAME;

	/**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
	public void setMessageHeader(MessageHeader value) {
		this.messageHeader = value;
	}

	/**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link Bank }
     *     
     */
	public Bank getBank() {
		return bank;
	}

	/**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bank }
     *     
     */
	public void setBank(Bank value) {
		this.bank = value;
	}

	/**
     * Gets the value of the logicalSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getLogicalSystemName() {
		return logicalSystemName;
	}

	/**
     * Sets the value of the logicalSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setLogicalSystemName(String value) {
		this.logicalSystemName = value;
	}

}
