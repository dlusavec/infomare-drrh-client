
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Vendor;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.VendorAccountData;


/**
 * <p>Java class for BankAccountDeactivateRequestMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountDeactivateRequestMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}MessageHeader" minOccurs="0"/>
 *         &lt;element name="vendorAccountData" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}VendorAccountData" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}Vendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountDeactivateRequestMsg", propOrder = {
    "messageHeader",
    "vendorAccountData",
    "vendor"
})
public class BankAccountDeactivateRequestMsg {

    protected MessageHeader messageHeader;
    protected VendorAccountData vendorAccountData;
    protected Vendor vendor;

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
     * Gets the value of the vendorAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAccountData }
     *     
     */
    public VendorAccountData getVendorAccountData() {
        return vendorAccountData;
    }

    /**
     * Sets the value of the vendorAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAccountData }
     *     
     */
    public void setVendorAccountData(VendorAccountData value) {
        this.vendorAccountData = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

}
