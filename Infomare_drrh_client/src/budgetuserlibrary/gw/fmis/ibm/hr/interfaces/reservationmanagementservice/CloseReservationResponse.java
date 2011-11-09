
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
 *         &lt;element name="closeReservationParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationResponseMsg"/>
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
    "closeReservationParamReturn"
})
@XmlRootElement(name = "closeReservationResponse")
public class CloseReservationResponse {

    @XmlElement(required = true)
    protected ReservationResponseMsg closeReservationParamReturn;

    /**
     * Gets the value of the closeReservationParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public ReservationResponseMsg getCloseReservationParamReturn() {
        return closeReservationParamReturn;
    }

    /**
     * Sets the value of the closeReservationParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public void setCloseReservationParamReturn(ReservationResponseMsg value) {
        this.closeReservationParamReturn = value;
    }

}
