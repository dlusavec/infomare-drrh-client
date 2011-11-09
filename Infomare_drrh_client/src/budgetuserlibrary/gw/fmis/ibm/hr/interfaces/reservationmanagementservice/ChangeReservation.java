
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ReservationChangeRequestMsg;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeReservationParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationChangeRequestMsg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeReservationParamIn"
})
@XmlRootElement(name = "changeReservation")
public class ChangeReservation {

    @XmlElement(required = true)
    protected ReservationChangeRequestMsg changeReservationParamIn;

    /**
     * Gets the value of the changeReservationParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationChangeRequestMsg }
     *     
     */
    public ReservationChangeRequestMsg getChangeReservationParamIn() {
        return changeReservationParamIn;
    }

    /**
     * Sets the value of the changeReservationParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationChangeRequestMsg }
     *     
     */
    public void setChangeReservationParamIn(ReservationChangeRequestMsg value) {
        this.changeReservationParamIn = value;
    }

}
