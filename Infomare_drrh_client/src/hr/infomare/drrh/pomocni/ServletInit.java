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
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice.ResponseMessageHandlerServiceClientImpl;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface.VendorManagementInterfaceClientImpl;

public class ServletInit implements ServletContextListener {
	Timer job = new Timer();
	ServletContext servletContext;

	public void contextDestroyed(ServletContextEvent arg0) {
		Log.loger.info("Aplikacija uga�ena.");
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
			job.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					razmjena();
				}
			}, NumberUtils.toInt(Postavke.WS_ODGODA) * 1000 * 60,
					NumberUtils.toInt(Postavke.WS_INTERVAL) * 1000 * 60);

		} catch (Exception e) {
			System.exit(0);
		}

	}

	public void razmjena() {
		if (!Postavke.JOB_RUNNING && Pomocna.isRadnoVrijeme()) {
			try {
				Log.loger.info("Pocetak razmjene");
				Postavke.JOB_RUNNING = true;
				if (StringUtils.isNotBlank(Postavke.WSDL_BANK)) {
					BankManagementInterfaceClientImpl bankManagement = new BankManagementInterfaceClientImpl();
					bankManagement.razmjenaBanaka();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_VENDOR)) {
					VendorManagementInterfaceClientImpl vendorManagement = new VendorManagementInterfaceClientImpl();
					vendorManagement.razmjenaPartnera();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_RESERVATION)) {
					ReservationManagementServiceClientImpl reservationManagement = new ReservationManagementServiceClientImpl();
					reservationManagement.razmjenaRezervacija();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_CONTRACT)) {
					ContractManagementServiceClientImpl contractManagement = new ContractManagementServiceClientImpl();
					contractManagement.razmjenaUgovora();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_PURCHASE_ORDER)) {
					PurchaseOrderManagementServiceClientImpl purchaseOrderMnagement = new PurchaseOrderManagementServiceClientImpl();
					purchaseOrderMnagement.razmjenaNarudzbenica();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_INVOICE)) {
					InvoiceManagementServiceClientImpl invoiceManagement = new InvoiceManagementServiceClientImpl();
					invoiceManagement.razmjenaFaktura();
				}
				// Spavaj nakon slanja
				Thread.sleep(NumberUtils.toInt(Postavke.JOB_SLEEP) * 60000);

				if (StringUtils.isNotBlank(Postavke.WSDL_RESPONSE)) {
					ResponseMessageHandlerServiceClientImpl responseManagement = new ResponseMessageHandlerServiceClientImpl();
					responseManagement.razmjenaOdgovora();
				}				
				if (StringUtils.isNotBlank(Postavke.WSDL_VENDOR)) {
					VendorManagementInterfaceClientImpl vendorManagementR = new VendorManagementInterfaceClientImpl();
					vendorManagementR.retrievePartnera();
				}
				if (StringUtils.isNotBlank(Postavke.WSDL_RESPONSE)) {
					ResponseMessageHandlerServiceClientImpl responseManagementPonavljanje = new ResponseMessageHandlerServiceClientImpl();
					responseManagementPonavljanje.razmjenaOdgovoraMessageId();
				}
				Log.loger.info("Zavrsetak razmjene");
			} catch (Exception e) {
				Log.loger.severe(PomocnaError.getErrorMessage(e));
			} finally {
				Postavke.JOB_RUNNING = false;
			}
		}

	}
}