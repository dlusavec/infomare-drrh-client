package hr.ibm.fmis.gw.comm.DistributionManagementLibrary.messages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyTypeList", propOrder = {
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
