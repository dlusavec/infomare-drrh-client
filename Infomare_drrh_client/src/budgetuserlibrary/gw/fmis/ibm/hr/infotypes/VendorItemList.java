
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorItem" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/infotypes/}VendorItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorItemList", propOrder = {
    "vendorItem"
})
public class VendorItemList {

    protected List<VendorItem> vendorItem;

    /**
     * Gets the value of the vendorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorItem }
     * 
     * 
     */
    public List<VendorItem> getVendorItem() {
        if (vendorItem == null) {
            vendorItem = new ArrayList<VendorItem>();
        }
        return this.vendorItem;
    }

}
