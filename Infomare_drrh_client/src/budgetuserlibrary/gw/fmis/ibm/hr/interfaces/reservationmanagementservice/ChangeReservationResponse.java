
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ReservationResponseMsg;


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
 *         &lt;element name="changeReservationParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationResponseMsg"/>
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
    "changeReservationParamReturn"
})
@XmlRootElement(name = "changeReservationResponse")
public class ChangeReservationResponse {

    @XmlElement(required = true)
    protected ReservationResponseMsg changeReservationParamReturn;

    /**
     * Gets the value of the changeReservationParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public ReservationResponseMsg getChangeReservationParamReturn() {
        return changeReservationParamReturn;
    }

    /**
     * Sets the value of the changeReservationParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public void setChangeReservationParamReturn(ReservationResponseMsg value) {
        this.changeReservationParamReturn = value;
    }

}
