package hr.infomare.drrh.pojo;

// Generated 26.10.2011. 09:26:57 by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;
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

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.InvoiceStatusNotification;

@SuppressWarnings("serial")
@Entity
@Table(name = "INVOICEMSG")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Invoicemsg implements java.io.Serializable {

	private int invmsgid;

	private Reqmsg reqmsg;
	private String f17upr;
	private int f17god;
	private String f17vpr;
	private int f17rbr;
	private int f17dod;
	private byte opt;
	private Integer bufmisrev;
	private Integer refdocid;
	private String invststy;
	private int duedate;
	private BigDecimal amount;
	private BigDecimal invlcam;
	private String iscess;
	private String docbloc;
	private int cmbufmisid;
	private String bufmisven;
	private String albufmven;
	private String payref;
	private String paydesc;
	private String housebank;
	private String vendobank;
	private String instrkey;
	private String refdetail;
	private String venaccnum;
	private String debcreind;
	private int venitemid;
	private byte status;
	private String user;
	private int datetime;
	private Date datetimews;
	private Date timews;
	private String vendoiban;

	public Invoicemsg() {
	}

	@Id
	@Column(name = "INVMSGID", unique = true, nullable = false, precision = 9, scale = 0)
	public int getInvmsgid() {
		return this.invmsgid;
	}

	public void setInvmsgid(int invmsgid) {
		this.invmsgid = invmsgid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REQMSGID")
	public Reqmsg getReqmsg() {
		return this.reqmsg;
	}

	public void setReqmsg(Reqmsg reqmsg) {
		this.reqmsg = reqmsg;
	}

	@Column(name = "F17UPR", nullable = false, length = 4)
	public String getF17upr() {
		return this.f17upr;
	}

	public void setF17upr(String f17upr) {
		this.f17upr = f17upr;
	}

	@Column(name = "F17GOD", nullable = false, precision = 4, scale = 0)
	public int getF17god() {
		return this.f17god;
	}

	public void setF17god(int f17god) {
		this.f17god = f17god;
	}

	@Column(name = "F17VPR", nullable = false, length = 5)
	public String getF17vpr() {
		return this.f17vpr;
	}

	public void setF17vpr(String f17vpr) {
		this.f17vpr = f17vpr;
	}

	@Column(name = "F17RBR", nullable = false, precision = 7, scale = 0)
	public int getF17rbr() {
		return this.f17rbr;
	}

	public void setF17rbr(int f17rbr) {
		this.f17rbr = f17rbr;
	}

	@Column(name = "F17DOD", nullable = false, precision = 3, scale = 0)
	public int getF17dod() {
		return this.f17dod;
	}

	public void setF17dod(int f17dod) {
		this.f17dod = f17dod;
	}

	@Column(name = "OPT", nullable = false, precision = 2, scale = 0)
	public byte getOpt() {
		return this.opt;
	}

	public void setOpt(byte opt) {
		this.opt = opt;
	}

	@Column(name = "BUFMISREV", precision = 9, scale = 0)
	public Integer getBufmisrev() {
		return this.bufmisrev;
	}

	public void setBufmisrev(Integer bufmisrev) {
		this.bufmisrev = bufmisrev;
	}

	@Column(name = "REFDOCID", precision = 9, scale = 0)
	public Integer getRefdocid() {
		return refdocid;
	}

	public void setRefdocid(Integer refdocid) {
		this.refdocid = refdocid;
	}

	@Column(name = "INVSTSTY", length = 50)
	public String getInvststy() {
		return this.invststy;
	}

	public void setInvststy(String invststy) {
		this.invststy = invststy;
	}

	@Column(name = "DUEDATE", nullable = false, precision = 8, scale = 0)
	public int getDuedate() {
		return this.duedate;
	}

	public void setDuedate(int duedate) {
		this.duedate = duedate;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 15)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "INVLCAM", nullable = false, precision = 15)
	public BigDecimal getInvlcam() {
		return this.invlcam;
	}

	public void setInvlcam(BigDecimal invlcam) {
		this.invlcam = invlcam;
	}

	@Column(name = "ISCESS", nullable = false, length = 1)
	public String getIscess() {
		return this.iscess;
	}

	public void setIscess(String iscess) {
		this.iscess = iscess;
	}

	@Column(name = "DOCBLOC", nullable = false, length = 1)
	public String getDocbloc() {
		return this.docbloc;
	}

	public void setDocbloc(String docbloc) {
		this.docbloc = docbloc;
	}

	@Column(name = "CMBUFMISID", nullable = false, precision = 9, scale = 0)
	public int getCmbufmisid() {
		return this.cmbufmisid;
	}

	public void setCmbufmisid(int cmbufmisid) {
		this.cmbufmisid = cmbufmisid;
	}

	@Column(name = "BUFMISVEN", nullable = false, length = 7)
	public String getBufmisven() {
		return this.bufmisven;
	}

	public void setBufmisven(String bufmisven) {
		this.bufmisven = bufmisven;
	}

	@Column(name = "ALBUFMVEN", length = 7)
	public String getAlbufmven() {
		return this.albufmven;
	}

	public void setAlbufmven(String albufmven) {
		this.albufmven = albufmven;
	}

	@Column(name = "PAYREF", nullable = false, length = 50)
	public String getPayref() {
		return this.payref;
	}

	public void setPayref(String payref) {
		this.payref = payref;
	}

	@Column(name = "PAYDESC", nullable = false, length = 120)
	public String getPaydesc() {
		return this.paydesc;
	}

	public void setPaydesc(String paydesc) {
		this.paydesc = paydesc;
	}

	@Column(name = "HOUSEBANK", nullable = false, length = 120)
	public String getHousebank() {
		return this.housebank;
	}

	public void setHousebank(String housebank) {
		this.housebank = housebank;
	}

	@Column(name = "VENDOBANK", nullable = false, length = 20)
	public String getVendobank() {
		return this.vendobank;
	}

	public void setVendobank(String vendobank) {
		this.vendobank = vendobank;
	}

	@Column(name = "INSTRKEY", nullable = false, length = 50)
	public String getInstrkey() {
		return this.instrkey;
	}

	public void setInstrkey(String instrkey) {
		this.instrkey = instrkey;
	}

	@Column(name = "REFDETAIL", nullable = false, length = 50)
	public String getRefdetail() {
		return this.refdetail;
	}

	public void setRefdetail(String refdetail) {
		this.refdetail = refdetail;
	}

	@Column(name = "VENACCNUM", nullable = false, length = 50)
	public String getVenaccnum() {
		return this.venaccnum;
	}

	public void setVenaccnum(String venaccnum) {
		this.venaccnum = venaccnum;
	}

	@Column(name = "DEBCREIND", nullable = false, length = 1)
	public String getDebcreind() {
		return this.debcreind;
	}

	public void setDebcreind(String debcreind) {
		this.debcreind = debcreind;
	}

	@Column(name = "VENITEMID", nullable = false, precision = 9, scale = 0)
	public int getVenitemid() {
		return this.venitemid;
	}

	public void setVenitemid(int venitemid) {
		this.venitemid = venitemid;
	}

	@Column(name = "STATUS", nullable = false, precision = 2, scale = 0)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Column(name = "USER", nullable = false, length = 10)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "DATETIME", nullable = false, precision = 8, scale = 0)
	public int getDatetime() {
		return this.datetime;
	}

	public void setDatetime(int datetime) {
		this.datetime = datetime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATETIMEWS", length = 10)
	public Date getDatetimews() {
		return this.datetimews;
	}

	public void setDatetimews(Date datetimews) {
		this.datetimews = datetimews;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "TIMEWS", length = 8)
	public Date getTimews() {
		return this.timews;
	}

	public void setTimews(Date timews) {
		this.timews = timews;
	}

	@Column(name = "VENDOIBAN", nullable = true, length = 34)
	public String getVendoiban() {
		return this.vendoiban;
	}

	public void setVendoiban(String vendoiban) {
		this.vendoiban = vendoiban;
	}

	public void postaviVrijednosti(byte status, Reqmsg reqMsg, Date dateTimeWS,
			InvoiceStatusNotification notificationResponse) {
		this.status = status;
		this.reqmsg = reqMsg;
		this.datetimews = dateTimeWS;
		this.timews = dateTimeWS;
		// this.invststy = notificationResponse.getInvoiceStatus() != null ?
		// notificationResponse
		// .getInvoiceStatus().name() : null;
	}
}