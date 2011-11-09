
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ReservationCloseRequestMsg;


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
 *         &lt;element name="closeReservationParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationCloseRequestMsg"/>
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
    "closeReservationParamIn"
})
@XmlRootElement(name = "closeReservation")
public class CloseReservation {

    @XmlElement(required = true)
    protected ReservationCloseRequestMsg closeReservationParamIn;

    /**
     * Gets the value of the closeReservationParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationCloseRequestMsg }
     *     
     */
    public ReservationCloseRequestMsg getCloseReservationParamIn() {
        return closeReservationParamIn;
    }

    /**
     * Sets the value of the closeReservationParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationCloseRequestMsg }
     *     
     */
    public void setCloseReservationParamIn(ReservationCloseRequestMsg value) {
        this.closeReservationParamIn = value;
    }

}
