package hr.infomare.drrh.main;

import hr.infomare.drrh.dao.ResxmlDAO;
import hr.infomare.drrh.hibernate.HibernatePomocna;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Resxml;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaDatum;
import hr.infomare.drrh.postavke.Postavke;

public class Start {

	public static void main(String[] args) {
		new Postavke();
		new Log();
		Log.loger.info("Aplikacija pokrenuta.");
		HibernatePomocna.buildSessionFactory();
		/*
		 * ********* POZIVI ZA TESTIRANJE *********
		 */
		// Banke
		/* BankManagementInterfaceClientImpl klijentB = new
		 BankManagementInterfaceClientImpl();
		 klijentB.razmjenaBanaka();*/
		// Partneri
		//VendorManagementInterfaceClientImpl klijentV = new VendorManagementInterfaceClientImpl();
		//klijentV.razmjenaPartnera();
		// Rezervacije
		/* ReservationManagementServiceClientImpl klijentR=new
		 ReservationManagementServiceClientImpl();
		 klijentR.razmjenaRezervacija();*/
		// Ugovori
	/*	 ContractManagementServiceClientImpl klijentC=new
		 ContractManagementServiceClientImpl();
		 klijentC.razmjenaUgovora();*/
		// Narudzbenice
	/*	 PurchaseOrderManagementServiceClientImpl klijentPO = new
		 PurchaseOrderManagementServiceClientImpl();
		klijentPO.razmjenaNarudzbenica();*/
		// Fakture
		// InvoiceManagementServiceClientImpl klijentI=new
		 //InvoiceManagementServiceClientImpl();
		 //klijentI.razmjenaFaktura();
	// Odgovori
	/*ResponseMessageHandlerServiceClientImpl klijentO= new ResponseMessageHandlerServiceClientImpl();
		klijentO.razmjenaOdgovora();*/
	/*	Resxml objekt= new Resxml();
		objekt.setResmsgid(Long.valueOf(5000));
		objekt.setResxml("test1");
		SessionPomocna sp= new SessionPomocna();
		ResxmlDAO.spremiResponse(Long.valueOf(5000),
				objekt, sp.getSession(), sp);*/
		//System.out.println(PomocnaDatum.XMLDatumUNumDatum(PomocnaDatum.getTrenutniDatumXML()));
	}
}