package hr.infomare.drrh.pomocni;

import hr.infomare.drrh.hibernate.HibernatePomocna;
import hr.infomare.drrh.postavke.Postavke;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.bankmanagementinterface.BankManagementInterfaceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.contractmanagementservice.ContractManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.InvoiceManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice.PurchaseOrderManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.reservationmanagementservice.ReservationManagementServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface.VendorManagementInterfaceClientImpl;

public class ServletInit implements ServletContextListener {
	Timer job = new Timer();
	ServletContext servletContext;

	public void contextDestroyed(ServletContextEvent arg0) {
		Log.loger.info("Aplikacija ugašena.");
		try {
			job.cancel();
			(Log.loger.getHandlers()[0]).close();
			HibernatePomocna.getSessionFactory().close();
		} catch (Exception e) {
		}
	}

	public void contextInitialized(ServletContextEvent arg0) {
		try {
			servletContext = arg0.getServletContext();
			Postavke.ucitajPostavke(servletContext);
			new Log();
			HibernatePomocna.buildSessionFactory();
			Log.loger.info("Aplikacija pokrenuta.");
			job.scheduleAtFixedRate(
					new TimerTask() {
						public void run() {
							Log.loger.info("Pocetak razmjene");
							if (StringUtils.isNotBlank(Postavke.WSDL_BANK)) {
								BankManagementInterfaceClientImpl bankManagement = new BankManagementInterfaceClientImpl();
								bankManagement.razmjenaBanaka();
								bankManagement = null;
							}
							if (StringUtils.isNotBlank(Postavke.WSDL_VENDOR)) {
								VendorManagementInterfaceClientImpl vendorManagement = new VendorManagementInterfaceClientImpl();
								vendorManagement.razmjenaPartnera();
								vendorManagement = null;
							}
							if (StringUtils
									.isNotBlank(Postavke.WSDL_RESERVATION)) {
								ReservationManagementServiceClientImpl reservationManagement = new ReservationManagementServiceClientImpl();
								reservationManagement.razmjenaRezervacija();
							}
							if (StringUtils.isNotBlank(Postavke.WSDL_CONTRACT)) {
								ContractManagementServiceClientImpl contractManagement = new ContractManagementServiceClientImpl();
								contractManagement.razmjenaUgovora();
							}
							if (StringUtils
									.isNotBlank(Postavke.WSDL_PURCHASE_ORDER)) {
								PurchaseOrderManagementServiceClientImpl purchaseOrderMnagement = new PurchaseOrderManagementServiceClientImpl();
								purchaseOrderMnagement.razmjenaNarudzbenica();
							}
							if (StringUtils
									.isNotBlank(Postavke.WSDL_INVOICE)) {
								InvoiceManagementServiceClientImpl invoiceManagement=new InvoiceManagementServiceClientImpl();
								invoiceManagement.razmjenaFaktura();
							}
							Log.loger.info("Zavrsetak razmjene");
						}
					}, NumberUtils.toInt(Postavke.WS_ODGODA) * 1000 * 60,
					NumberUtils.toInt(Postavke.WS_INTERVAL) * 1000 * 60);

		} catch (Exception e) {
			System.exit(0);
		}

	}
}