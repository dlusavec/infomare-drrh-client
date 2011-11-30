package hr.infomare.drrh.main;

import hr.infomare.drrh.hibernate.HibernatePomocna;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.postavke.Postavke;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface.BankManagementInterfaceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice.ContractManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.InvoiceManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice.PurchaseOrderManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice.ReservationManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface.VendorManagementInterfaceClientImpl;

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
		 BankManagementInterfaceClientImpl klijentB = new
		 BankManagementInterfaceClientImpl();
		 klijentB.razmjenaBanaka();
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
	}
}