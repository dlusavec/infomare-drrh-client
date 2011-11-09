package hr.infomare.drrh.pojo;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.StringUtils;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.InvoiceStatusType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.NotificationHeader;

/**
 * Invoice generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="INVOICE")
@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
public class Invoice implements java.io.Serializable{

	 private String f17upr;
     private int f17god;
     private String f17vpr;
     private int f17rbr;
     private int f17dod;
     
     private int notheadid;
     private Long resmsgid;
     private int bcstatid;
     private int bufmisdoc;
     private String fmisgwnid;
     private String orsapdocid;
     private String orbufmisid;     
     private String bcstattype;
     private Date datetimews;

    public Invoice() {
    }
	          
    @Id
    @Column(name="F17UPR", nullable=false, length=4)
    public String getF17upr() {
        return this.f17upr;
    }
    
    public void setF17upr(String f17upr) {
        this.f17upr = f17upr;
    }
    @Id
    @Column(name="F17GOD", nullable=false, precision=4, scale=0)
    public int getF17god() {
        return this.f17god;
    }
    
    public void setF17god(int f17god) {
        this.f17god = f17god;
    }
    @Id
    @Column(name="F17VPR", nullable=false, length=5)
    public String getF17vpr() {
        return this.f17vpr;
    }
    
    public void setF17vpr(String f17vpr) {
        this.f17vpr = f17vpr;
    }
    @Id
    @Column(name="F17RBR", nullable=false, precision=7, scale=0)
    public int getF17rbr() {
        return this.f17rbr;
    }
    
    public void setF17rbr(int f17rbr) {
        this.f17rbr = f17rbr;
    }
    @Id
    @Column(name="F17DOD", nullable=false, precision=3, scale=0)
    public int getF17dod() {
        return this.f17dod;
    }
    
    public void setF17dod(int f17dod) {
        this.f17dod = f17dod;
    }
      
    @Column(name="NOTHEADID", nullable=false, precision=9, scale=0)
    public int getNotheadid() {
        return this.notheadid;
    }
    
    public void setNotheadid(int notheadid) {
        this.notheadid = notheadid;
    }
    
    @Column(name="RESMSGID", nullable=false, precision=9, scale=0)
    public Long getResmsgid() {
        return this.resmsgid;
    }
    
    public void setResmsgid(Long resmsgid) {
        this.resmsgid = resmsgid;
    }
    
    @Column(name="BCSTATID", nullable=false, precision=9, scale=0)
    public int getBcstatid() {
        return this.bcstatid;
    }
    
    public void setBcstatid(int bcstatid) {
        this.bcstatid = bcstatid;
    }
    
    @Column(name="BUFMISDOC", nullable=false, precision=9, scale=0)
    public int getBufmisdoc() {
        return this.bufmisdoc;
    }
    
    public void setBufmisdoc(int bufmisdoc) {
        this.bufmisdoc = bufmisdoc;
    }
    
    @Column(name="FMISGWNID", nullable=false, length=50)
    public String getFmisgwnid() {
        return this.fmisgwnid;
    }
    
    public void setFmisgwnid(String fmisgwnid) {
        this.fmisgwnid = fmisgwnid;
    }
    
    @Column(name="ORSAPDOCID", nullable=false, length=50)
    public String getOrsapdocid() {
        return this.orsapdocid;
    }
    
    public void setOrsapdocid(String orsapdocid) {
        this.orsapdocid = orsapdocid;
    }
    
    @Column(name="ORBUFMISID", length=50)
    public String getOrbufmisid() {
        return this.orbufmisid;
    }
    
    public void setOrbufmisid(String orbufmisid) {
        this.orbufmisid = orbufmisid;
    }
           
    @Column(name="BCSTATTYPE", nullable=false, length=50)
    public String getBcstattype() {
        return this.bcstattype;
    }
    
    public void setBcstattype(String bcstattype) {
        this.bcstattype = bcstattype;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DATETIMEWS", nullable=false, length=10)
    public Date getDatetimews() {
        return this.datetimews;
    }
    
    public void setDatetimews(Date datetimews) {
        this.datetimews = datetimews;
    }
	public void postaviVrijednosti(Invoicemsg invoiceMsg, Integer notHeadId,
			Integer statNotId, NotificationHeader notificationHeader,
			InvoiceStatusType invoiceStatusType, Resmsg resMsg) {		
		f17upr = invoiceMsg.getF17upr();
		f17god = invoiceMsg.getF17god();
		f17vpr=invoiceMsg.getF17vpr();
		f17rbr = invoiceMsg.getF17rbr();
		f17dod=invoiceMsg.getF17dod();
		notheadid = notHeadId;
		resmsgid = resMsg.getResmsgid();
		bcstatid = statNotId;
		bufmisdoc = invoiceMsg.getInvmsgid();
		fmisgwnid = notificationHeader.getFmisGwNotificationId();
		/*orsapdocid = 
				 notificationHeader.getSapDocumentId();
		orbufmisid = 
				 notificationHeader.getOriginatingBuFmisDocumentID();*/
		orsapdocid = StringUtils.isBlank(notificationHeader.getSapDocumentId()) ? orsapdocid
				: notificationHeader.getSapDocumentId();
		orbufmisid = StringUtils.isBlank(notificationHeader
				.getOriginatingBuFmisDocumentID()) ? orbufmisid
				: notificationHeader.getOriginatingBuFmisDocumentID();
		bcstattype = invoiceStatusType.name();
		datetimews = resMsg.getSubmdati();
	}
}