
package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ReservationCreateRequestMsg;


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
 *         &lt;element name="createReservationParamIn" type="{http://hr.ibm.fmis.gw.BudgetUserLibrary/messages}ReservationCreateRequestMsg"/>
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
    "createReservationParamIn"
})
@XmlRootElement(name = "createReservation")
public class CreateReservation {

    @XmlElement(required = true)
    protected ReservationCreateRequestMsg createReservationParamIn;

    /**
     * Gets the value of the createReservationParamIn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationCreateRequestMsg }
     *     
     */
    public ReservationCreateRequestMsg getCreateReservationParamIn() {
        return createReservationParamIn;
    }

    /**
     * Sets the value of the createReservationParamIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationCreateRequestMsg }
     *     
     */
    public void setCreateReservationParamIn(ReservationCreateRequestMsg value) {
        this.createReservationParamIn = value;
    }

}
