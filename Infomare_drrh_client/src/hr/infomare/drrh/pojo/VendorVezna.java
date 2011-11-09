package hr.infomare.drrh.pojo;

/*
 * Generirano ruèno
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Vendor;

@SuppressWarnings("serial")
@Entity
@Table(name = "VENDOR")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class VendorVezna implements java.io.Serializable {

	private String f41ctr;
	private String f41vid;
	private String f41svi;
	private Reqmsg reqmsg;
	private Date datetimews;

	public VendorVezna() {
	}

	@Id
	@Column(name = "F41CTR", unique = true, nullable = false, length = 7)
	public String getF41ctr() {
		return this.f41ctr;
	}

	public void setF41ctr(String f41ctr) {
		this.f41ctr = f41ctr;
	}

	@Column(name = "F41VID", nullable = false, length = 50)
	public String getF41vid() {
		return this.f41vid;
	}

	public void setF41vid(String f41vid) {
		this.f41vid = f41vid;
	}

	@Column(name = "F41SVI", nullable = false, length = 50)
	public String getF41svi() {
		return this.f41svi;
	}

	public void setF41svi(String f41svi) {
		this.f41svi = f41svi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REQMSGID")
	public Reqmsg getReqmsg() {
		return this.reqmsg;
	}

	public void setReqmsg(Reqmsg reqmsg) {
		this.reqmsg = reqmsg;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATETIMEWS", length = 10)
	public Date getDatetimews() {
		return this.datetimews;
	}

	public void setDatetimews(Date datetimews) {
		this.datetimews = datetimews;
	}

	public void postaviVrijednosti(Reqmsg reqMsg, Date dateTimeWS,
			Vendor vendor, Vendormsg vendorMsg) {
		this.f41ctr = vendorMsg.getF41ctr();
		this.reqmsg = reqMsg;
		this.datetimews = dateTimeWS;
		if (vendor != null) {
			this.f41svi = vendor.getSapVendorId();
			this.f41vid = Long.toString(vendor.getVendorId());
		}
	}
}
