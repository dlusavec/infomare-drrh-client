
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorAccountDataList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorAccountDataList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorAccountData" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes}VendorAccountData" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorAccountDataList", propOrder = {
    "vendorAccountData"
})
public class VendorAccountDataList {

    @XmlElement(required = true)
    protected List<VendorAccountData> vendorAccountData;

    /**
     * Gets the value of the vendorAccountData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorAccountData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorAccountData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorAccountData }
     * 
     * 
     */
    public List<VendorAccountData> getVendorAccountData() {
        if (vendorAccountData == null) {
            vendorAccountData = new ArrayList<VendorAccountData>();
        }
        return this.vendorAccountData;
    }

}
