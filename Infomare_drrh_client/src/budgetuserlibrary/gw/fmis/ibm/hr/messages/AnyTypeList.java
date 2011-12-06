
package budgetuserlibrary.gw.fmis.ibm.hr.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractResponseList", propOrder = {
    "AnyTypeElement"
})*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractResponseList", propOrder = {
    "AnyTypeElement"
})
public class AnyTypeList {

    @XmlElement(required = false)
    protected List AnyTypeElement;
   
    public List getAnyTypeElement() {
        if (AnyTypeElement == null) {
        	AnyTypeElement = new ArrayList();
        }
        return this.AnyTypeElement;
    }

}
