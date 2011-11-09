package hr.infomare.drrh.pojo;

// Generated 17.10.2011. 13:20:02 by Hibernate Tools 3.2.1.GA

import hr.infomare.drrh.pomocni.Pomocna;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Resxml generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "RESXML")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Resxml implements java.io.Serializable {

	private Long resmsgid;
	private String resxml;

	public Resxml() {
	}	

	@Id
	@Column(name = "RESMSGID", unique = true, nullable = false, precision = 9, scale = 0)
	public long getResmsgid() {
		return this.resmsgid;
	}

	public void setResmsgid(Long resmsgid) {
		this.resmsgid = resmsgid;
	}
	
	@Column(name = "RESXML")
	public String getResxml() {
		return this.resxml;
	}

	public void setResxml(String resxml) {
		this.resxml = resxml;
	}

	public void postaviVrijednosti(Long resMsgId, Object objekt) {
		resmsgid = resMsgId;								
		resxml = Pomocna.objektUXMLString(objekt);		
	}
}
