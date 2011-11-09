
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
 *         &lt;element name="createReservationParamReturn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationResponseMsg"/>
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
    "createReservationParamReturn"
})
@XmlRootElement(name = "createReservationResponse")
public class CreateReservationResponse {

    @XmlElement(required = true)
    protected ReservationResponseMsg createReservationParamReturn;

    /**
     * Gets the value of the createReservationParamReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public ReservationResponseMsg getCreateReservationParamReturn() {
        return createReservationParamReturn;
    }

    /**
     * Sets the value of the createReservationParamReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationResponseMsg }
     *     
     */
    public void setCreateReservationParamReturn(ReservationResponseMsg value) {
        this.createReservationParamReturn = value;
    }

}
