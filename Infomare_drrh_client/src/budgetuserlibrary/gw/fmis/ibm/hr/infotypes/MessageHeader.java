
package budgetuserlibrary.gw.fmis.ibm.hr.infotypes;

import hr.infomare.drrh.pomocni.PomocnaDatum;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submitionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="responseMsgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "submitionTimestamp",
    "responseMsgId",
    "eventId"
})
public class MessageHeader {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitionTimestamp=PomocnaDatum.getTrenutniDatumXML();
    protected Long responseMsgId;  
    protected Long eventId;

    /**
     * Gets the value of the submitionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitionTimestamp() {
        return submitionTimestamp;
    }

    /**
     * Sets the value of the submitionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitionTimestamp(XMLGregorianCalendar value) {
        this.submitionTimestamp = value;
    }

    /**
     * Gets the value of the responseMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseMsgId() {
        return responseMsgId;
    }

    /**
     * Sets the value of the responseMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseMsgId(Long value) {
        this.responseMsgId = value;
    }

	/**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
	public Long getEventId() {
		return eventId;
	}

	/**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public void postaviVrijednostiRetrive() {
		this.submitionTimestamp = this.submitionTimestamp == null ? PomocnaDatum
				.getTrenutniDatumXML() : this.submitionTimestamp;
		this.eventId = this.eventId == null ? Long.valueOf(0) : this.eventId;

	}
}
