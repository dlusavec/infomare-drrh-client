package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import hr.ibm.fmis.gw.comm.DistributionManagementLibrary.messages.AnyTypeList;
import hr.infomare.drrh.dao.BankmsgDAO;
import hr.infomare.drrh.dao.BudcomDAO;
import hr.infomare.drrh.dao.BudcommsgDAO;
import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.InvoiceDAO;
import hr.infomare.drrh.dao.InvoicemsgDAO;
import hr.infomare.drrh.dao.NotifheadDAO;
import hr.infomare.drrh.dao.PayexecDAO;
import hr.infomare.drrh.dao.ReqmsgDAO;
import hr.infomare.drrh.dao.ResxmlDAO;
import hr.infomare.drrh.dao.StatnotifDAO;
import hr.infomare.drrh.dao.VenbanaccmDAO;
import hr.infomare.drrh.dao.VendormsgDAO;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Bankmsg;
import hr.infomare.drrh.pojo.Budcom;
import hr.infomare.drrh.pojo.Budcommsg;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pojo.Notifhead;
import hr.infomare.drrh.pojo.Payexec;
import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pojo.Resmsg;
import hr.infomare.drrh.pojo.Statnotif;
import hr.infomare.drrh.pojo.Venbanaccm;
import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pojo.Vendormsg;
import hr.infomare.drrh.pomocni.Debug;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.Pomocna;
import hr.infomare.drrh.pomocni.PomocnaDatum;
import hr.infomare.drrh.pomocni.PomocnaError;
import hr.infomare.drrh.pomocni.PomocnaKlijent;
import hr.infomare.drrh.postavke.Postavke;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.BudgetCommitmentStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.InvoiceStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice.binding2.ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PaymentExecutionNotificationEventMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ReservationResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorResponseMsg;

/**
 * This class was generated by Apache CXF 2.4.0 2011-12-05T12:37:56.862+01:00
 * Generated source version: 2.4.0
 * 
 */
public class ResponseMessageHandlerServiceClientImpl {
	private QName serviceName;
	private URL wsdlURL = ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService.WSDL_LOCATION;
	private ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService servis;
	private ResponseMessageHandlerService port;
	private SessionPomocna sessionPomocna;
	private Session session;
	private BankmsgDAO bankMsgDAO;
	private BudcommsgDAO budcomMsgDAO;
	private InvoicemsgDAO invoiceMsgDAO;
	private InvoiceDAO invoiceDAO;
	private DocheadDAO docHeadDAO;
	private ReqmsgDAO reqMsgDAO;
	private StatnotifDAO statusNotifDAO;
	private NotifheadDAO notifHeadDAO;
	private BudcomDAO budComDAO;
	private VendormsgDAO vendorMsgDAO;
	private VenbanaccmDAO venBanAccMDAO;
	private PayexecDAO payExecDAO;
	private Debug debug = new Debug("RESPONSE");

	public ResponseMessageHandlerServiceClientImpl() {
	}

	public void razmjenaOdgovora() {
		try {
			otvoriPortISesiju();

			preuzmiBankResponse();
			preuzmiVendorResponse();
			preuzmiReservationResponse();
			preuzmiContractResponse();
			preuzmiPurchaseOrderResponse();
			preuzmiInvoiceResponse();
			preuzmiPayementExecutionResponse();
		} catch (Exception e) {
			Log.loger.severe("Gre�ka kod preuzimanja odgovora "
					+ PomocnaError.getErrorMessage(e));
		}
	}

	public void razmjenaOdgovoraMessageId() {
		try {
			otvoriPortISesiju();

			// preuzmiBankResponseMessageId();
			preuzmiVendorResponseMessageId();

			// preuzmiReservationResponseMessageId();
			// preuzmiContractResponseMessageId();
			// preuzmiPurchaseOrderResponseMessageId();

			// preuzmiInvoiceResponseMessageId();
			preuzmiPayementExecutionMessageId();
		} catch (Exception e) {
			Log.loger.severe("Gre�ka kod preuzimanja odgovora "
					+ PomocnaError.getErrorMessage(e));
		}
	}

	private void otvoriPortISesiju() {
		serviceName = new QName(
				ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService.TARGET_NAMESPACE,
				ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService.SERVIS);
		wsdlURL = ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService.WSDL_LOCATION;
		servis = new ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService(
				wsdlURL, serviceName);
		port = servis
				.getResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpPort();
		PomocnaKlijent.postavkeKlijenta(port);
		sessionPomocna = new SessionPomocna();
		session = sessionPomocna.getSession();
		bankMsgDAO = new BankmsgDAO(session);
		budcomMsgDAO = new BudcommsgDAO(session);
		docHeadDAO = new DocheadDAO(session);
		reqMsgDAO = new ReqmsgDAO(session);
		statusNotifDAO = new StatnotifDAO(session);
		notifHeadDAO = new NotifheadDAO(session);
		budComDAO = new BudcomDAO(session);
		invoiceMsgDAO = new InvoicemsgDAO(session);
		invoiceDAO = new InvoiceDAO(session);
		vendorMsgDAO = new VendormsgDAO(session);
		venBanAccMDAO = new VenbanaccmDAO(session);
		payExecDAO = new PayexecDAO(session);
	}

	public void preuzmiBankResponse() {
		obradaBankMsg(
				(AnyTypeList) port
						.getBankUpdatesList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrieveBankUpdates");
	}

	public void preuzmiBankResponseMessageId() {
		obradaBankMsg(
				(AnyTypeList) port.getBankUpdatesListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrieveBankUpdatesMessageId");
	}

	public void preuzmiVendorResponse() {
		obradaVendorMsg(
				(AnyTypeList) port
						.getVendorUpdatesList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrieveVendorChange");
	}

	public void preuzmiVendorResponseMessageId() {
		obradaVendorMsg(
				(AnyTypeList) port.getVendorUpdatesListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrieveVendorChangeMessageId");
	}

	public void preuzmiContractResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getContractResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrieveContract");
	}

	public void preuzmiReservationResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getReservationResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrieveReservation");
	}

	public void preuzmiReservationResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getReservationResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrieveReservationMessageId");
	}

	public void preuzmiContractResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getContractResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrieveContractMessageId");
	}

	public void preuzmiPurchaseOrderResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getPurchaseOrderResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrievePurchaseOrder");
	}

	public void preuzmiPurchaseOrderResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getPurchaseOrderResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrievePurchaseOrderMessageId");
	}

	public void preuzmiInvoiceResponse() {
		obradaInvoiceMsg(
				(AnyTypeList) port
						.getInvoiceResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrieveInvoice");
	}

	public void preuzmiInvoiceResponseMessageId() {
		obradaInvoiceMsg(
				(AnyTypeList) port.getInvoiceResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrieveInvoiceMessageId");
	}

	public void preuzmiPayementExecutionResponse() {
		obradaPaymentExecutionMsg(
				(AnyTypeList) port
						.getPaymentExecutionList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrievePayementExecution");
	}

	public void preuzmiPayementExecutionMessageId() {
		obradaPaymentExecutionMsg(
				(AnyTypeList) port.getPaymentExecutionListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrievePayementExecutionMessageId");
	}

	private void obradaBankMsg(AnyTypeList anyTypeLista, String messageName) {

		Bankmsg bankMsg = null;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		MessageHeader messageHeader = null;
		ResponseMessageType responseMessageType = null;
		ErrorResponse errorResponse = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			BankResponseMsg response = (BankResponseMsg) iterator.next();
			messageHeader = response.getMessageHeader();
			responseMessageType = response.getResponseMessageType();
			errorResponse = response.getErrorResponse();
			messageHeader.postaviVrijednostiRetrieve();
			try {
				bankMsg = bankMsgDAO
						.getBankByPK((response.getBank().getVbdi()));
				if (bankMsg != null) {
					sessionPomocna.otvoriTransakciju();
					reqMsg = reqMsgDAO.getReqMsgByPK(bankMsg.getReqmsg()
							.getReqmsgid());
					resMsg = new Resmsg();
					reqMsg.postaviVrijednosti(messageHeader);
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType, reqMsg);
					bankMsg.postaviVrijednosti(Pomocna
							.getStatusRetrieve(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()));

					session.save(resMsg);
					session.update(reqMsg);
					session.update(bankMsg);
					Pomocna.obradaGresaka(session, errorResponse, messageHeader);
					sessionPomocna.commitTransakcije();
				}
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod preuzimanja odgovora "
						+ messageName + " , poruka: " + bankMsg.getIdBankmsg()
						+ PomocnaError.getErrorMessage(e));
			}

		}
		obradaResponseXML(anyTypeLista, messageName);
	}

	private void obradaVendorMsg(AnyTypeList anyTypeLista, String messageName) {
		Vendormsg vendorMsg = null;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		MessageHeader messageHeader = null;
		ResponseMessageType responseMessageType = null;
		ErrorResponse errorResponse = null;
		VendorVezna vendorVezna = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		List vendorAccountsLista;
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			VendorResponseMsg response = (VendorResponseMsg) iterator.next();
			messageHeader = response.getMessageHeader();
			responseMessageType = response.getResponseMessageType();
			errorResponse = response.getErrorResponse();
			messageHeader.postaviVrijednostiRetrieve();
			try {
				vendorMsg = vendorMsgDAO.getVendorByPK(response.getVendor()
						.getLogicalSystemVendorID());
				// Prijava novog partnera
				if ((vendorMsg != null
						&& responseMessageType
								.equals(ResponseMessageType.NOTIFICATION) && StringUtils
						.isNotBlank(response.getVendor().getSapVendorId()))
						|| responseMessageType
								.equals(ResponseMessageType.ERROR)) {
					sessionPomocna.otvoriTransakciju();
					vendorAccountsLista = venBanAccMDAO
							.getVenBanAccMByVendorAndRequest(vendorMsg
									.getF41ctr(), vendorMsg.getReqmsg()
									.getReqmsgid());
					reqMsg = reqMsgDAO.getReqMsgByPK(vendorMsg.getReqmsg()
							.getReqmsgid());
					resMsg = new Resmsg();
					reqMsg.postaviVrijednosti(messageHeader);
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType, reqMsg);
					vendorMsg.postaviVrijednostiRetrieve(Pomocna
							.getStatusRetrieve(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()), response);
					session.save(resMsg);
					session.update(reqMsg);
					session.update(vendorMsg);
					if (vendorAccountsLista != null
							&& vendorAccountsLista.size() > 0) {
						for (Iterator iteratorVenBanAcc = vendorAccountsLista
								.iterator(); iteratorVenBanAcc.hasNext();) {
							Venbanaccm venBanAccM = (Venbanaccm) iteratorVenBanAcc
									.next();
							venBanAccM.postaviVrijednosti(Pomocna
									.getStatusRetrieve(responseMessageType),
									reqMsg, PomocnaDatum
											.XMLDatumUDate(messageHeader
													.getSubmitionTimestamp()));
							session.update(venBanAccM);
						}
					}
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						vendorVezna = new VendorVezna();
						vendorVezna.postaviVrijednosti(reqMsg, response);
						session.save(vendorVezna);
					}
					Pomocna.obradaGresaka(session, errorResponse, messageHeader);
					sessionPomocna.commitTransakcije();
				}

				// Ako je samo prijava zira, logika pretpostavljam da je dobra
				else if (vendorMsg == null) {
					vendorAccountsLista = venBanAccMDAO
							.getVenBanAccMByVendorAndRequest(response
									.getVendor().getLogicalSystemVendorID(),
									null);
					if (vendorAccountsLista != null
							&& vendorAccountsLista.size() > 0) {
						sessionPomocna.otvoriTransakciju();
						reqMsg = reqMsgDAO
								.getReqMsgByPK(((Venbanaccm) vendorAccountsLista
										.get(0)).getReqmsg().getReqmsgid());
						resMsg = new Resmsg();
						reqMsg.postaviVrijednosti(messageHeader);
						resMsg.postaviVrijednosti(messageHeader, messageName,
								responseMessageType, reqMsg);
						session.save(resMsg);
						session.update(reqMsg);
						for (Iterator iteratorVenBanAcc = vendorAccountsLista
								.iterator(); iteratorVenBanAcc.hasNext();) {
							Venbanaccm venBanAccM = (Venbanaccm) iteratorVenBanAcc
									.next();
							venBanAccM.postaviVrijednosti(Pomocna
									.getStatusRetrieve(responseMessageType),
									reqMsg, PomocnaDatum
											.XMLDatumUDate(messageHeader
													.getSubmitionTimestamp()));
							session.update(venBanAccM);
						}
						Pomocna.obradaGresaka(session, errorResponse,
								messageHeader);
						sessionPomocna.commitTransakcije();
					}
				}
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod preuzimanja odgovora "
						+ messageName + " , poruka: "
						+ vendorMsg.getIdVendorm()
						+ PomocnaError.getErrorMessage(e));
			}
		}
		obradaResponseXML(anyTypeLista, messageName);
	}

	private void obradaBudComMsg(AnyTypeList anyTypeLista, String messageName) {
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		Budcommsg budComMsg = null;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		Statnotif statNotif = null;
		Budcom budCom = null;
		Notifhead notifHead = null;
		Dochead docHead = null;
		MessageHeader messageHeader = null;
		ResponseMessageType responseMessageType = null;
		BudgetCommitmentStatusNotification budgetCommitmentStatusNotification = null;
		ErrorResponse errorResponse = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			Object object = iterator.next();

			if (object instanceof ContractResponseMsg) {
				ContractResponseMsg response = (ContractResponseMsg) object;
				messageHeader = response.getMessageHeader();
				responseMessageType = response.getResponseMessageType();
				budgetCommitmentStatusNotification = response
						.getNotificationResponse();
				errorResponse = response.getErrorResponse();
			}

			if (object instanceof ReservationResponseMsg) {
				ReservationResponseMsg response = (ReservationResponseMsg) object;
				messageHeader = response.getMessageHeader();
				responseMessageType = response.getResponseMessageType();
				budgetCommitmentStatusNotification = response
						.getNotificationResponse();
				errorResponse = response.getErrorResponse();
			}

			if (object instanceof PurchaseOrderResponseMsg) {
				PurchaseOrderResponseMsg response = (PurchaseOrderResponseMsg) object;
				messageHeader = response.getMessageHeader();
				responseMessageType = response.getResponseMessageType();
				budgetCommitmentStatusNotification = response
						.getNotificationResponse();
				errorResponse = response.getErrorResponse();
			}

			try {
				budComMsg = budcomMsgDAO
						.getBudcommsgByDocumentId(budgetCommitmentStatusNotification
								.getHeader().getOriginatingBuFmisDocumentID());
				if (budComMsg != null) {
					sessionPomocna.otvoriTransakciju();
					messageHeader.postaviVrijednostiRetrieve();
					reqMsg = reqMsgDAO.getReqMsgByPK(budComMsg.getReqmsg()
							.getReqmsgid());
					resMsg = new Resmsg();
					reqMsg.postaviVrijednosti(messageHeader);
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType, reqMsg);
					budComMsg.postaviVrijednosti(Pomocna
							.getStatusRetrieve(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()),
							budgetCommitmentStatusNotification);
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						docHead = docHeadDAO.getDocHeadByPK(budComMsg
								.getRefdocid());
						statNotif = new Statnotif();
						notifHead = new Notifhead();
						budComMsg
								.setStatnotty(budgetCommitmentStatusNotification
										.getCommitmentStatus() != null ? budgetCommitmentStatusNotification
										.getCommitmentStatus().name() : null);
						statNotif.postaviVrijednosti(statNotId, resMsg,
								messageName, budgetCommitmentStatusNotification
										.getCommitmentStatus(), messageHeader);
						notifHead.postaviVrijednosti(notHeadId, statNotId,
								resMsg, messageHeader,
								budgetCommitmentStatusNotification.getHeader(),
								budgetCommitmentStatusNotification);
						budCom = budComDAO.getBudcomByPK(budComMsg.getCurlib(),
								budComMsg.getR95upr(), budComMsg.getR95god(),
								budComMsg.getR95rbr());
						if (budCom == null) {
							budCom = new Budcom();
						}
						budCom.postaviVrijednosti(budComMsg, notHeadId,
								statNotId, budgetCommitmentStatusNotification
										.getHeader(),
								budgetCommitmentStatusNotification
										.getCommitmentStatus(), resMsg);
						docHead.postaviVrijednosti(
								budgetCommitmentStatusNotification.getHeader(),
								messageHeader);
					}
					session.save(resMsg);
					session.update(reqMsg);
					session.update(budComMsg);
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						session.save(statNotif);
						session.save(notifHead);
						session.saveOrUpdate(budCom);
						session.update(docHead);
					}
					Pomocna.obradaGresaka(session, errorResponse, messageHeader);
					sessionPomocna.commitTransakcije();
					++statNotId;
					++notHeadId;
				}
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod preuzimanja odgovora "
						+ messageName + " , poruka: "
						+ Integer.toString(budComMsg.getBcmsgid())
						+ PomocnaError.getErrorMessage(e));
			}
		}
		obradaResponseXML(anyTypeLista, messageName);
	}

	private void obradaInvoiceMsg(AnyTypeList anyTypeLista, String messageName) {
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		Invoicemsg invoiceMsg = null;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		Statnotif statNotif = null;
		hr.infomare.drrh.pojo.Invoice faktura = null;
		Notifhead notifHead = null;
		Dochead docHead = null;
		MessageHeader messageHeader = null;
		ResponseMessageType responseMessageType = null;
		InvoiceStatusNotification invoiceStatusNotification = null;
		ErrorResponse errorResponse = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			InvoiceResponseMsg response = (InvoiceResponseMsg) iterator.next();
			messageHeader = response.getMessageHeader();
			responseMessageType = response.getResponseMessageType();
			invoiceStatusNotification = response.getNotificationResponse();
			errorResponse = response.getErrorResponse();

			try {
				invoiceMsg = invoiceMsgDAO
						.getInvoicemsgByDocumentId(invoiceStatusNotification
								.getHeader().getOriginatingBuFmisDocumentID());
				if (invoiceMsg != null) {
					sessionPomocna.otvoriTransakciju();
					messageHeader.postaviVrijednostiRetrieve();
					reqMsg = reqMsgDAO.getReqMsgByPK(invoiceMsg.getReqmsg()
							.getReqmsgid());
					resMsg = new Resmsg();
					reqMsg.postaviVrijednosti(messageHeader);
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType, reqMsg);
					invoiceMsg.postaviVrijednosti(Pomocna
							.getStatusRetrieve(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()),
							invoiceStatusNotification);
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						docHead = docHeadDAO.getDocHeadByPK(invoiceMsg
								.getRefdocid());
						statNotif = new Statnotif();
						notifHead = new Notifhead();
						invoiceMsg
								.setInvststy(invoiceStatusNotification
										.getInvoiceStatus() != null ? invoiceStatusNotification
										.getInvoiceStatus().name() : null);

						statNotif.postaviVrijednosti(statNotId, resMsg,
								messageName,
								invoiceStatusNotification.getInvoiceStatus(),
								messageHeader);
						notifHead.postaviVrijednosti(notHeadId, statNotId,
								resMsg, messageHeader,
								invoiceStatusNotification.getHeader(),
								invoiceStatusNotification);

						faktura = invoiceDAO.getInvoiceByPK(
								invoiceMsg.getF17upr(), invoiceMsg.getF17god(),
								invoiceMsg.getF17vpr(), invoiceMsg.getF17rbr(),
								invoiceMsg.getF17dod());

						if (faktura == null) {
							faktura = new hr.infomare.drrh.pojo.Invoice();
						}
						faktura.postaviVrijednosti(invoiceMsg, notHeadId,
								statNotId,
								invoiceStatusNotification.getHeader(),
								invoiceStatusNotification.getInvoiceStatus(),
								resMsg);
						docHead.postaviVrijednosti(
								invoiceStatusNotification.getHeader(),
								messageHeader);
					}
					session.saveOrUpdate(resMsg);
					session.update(reqMsg);
					session.update(invoiceMsg);
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						session.save(statNotif);
						session.save(notifHead);
						session.saveOrUpdate(faktura);
						session.update(docHead);
					}
					Pomocna.obradaGresaka(session, errorResponse, messageHeader);
					sessionPomocna.commitTransakcije();
					++statNotId;
					++notHeadId;
				}
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod preuzimanja odgovora "
						+ messageName + " , poruka: "
						+ Integer.toString(invoiceMsg.getInvmsgid())
						+ PomocnaError.getErrorMessage(e));
			}

		}
		obradaResponseXML(anyTypeLista, messageName);
	}

	private void obradaPaymentExecutionMsg(AnyTypeList anyTypeLista,
			String messageName) {
		Payexec payExec = null;
		Resmsg resMsg = null;
		MessageHeader messageHeader = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			PaymentExecutionNotificationEventMsg response = (PaymentExecutionNotificationEventMsg) iterator
					.next();
			messageHeader = response.getMessageHeader();
			messageHeader.postaviVrijednostiRetrieve();
			try {

				if (response != null) {
					sessionPomocna.otvoriTransakciju();
					resMsg = new Resmsg();
					resMsg.postaviVrijednosti(messageHeader, messageName,
							ResponseMessageType.NOTIFICATION, null);
					payExec = payExecDAO.getPayexecByPK(response
							.getPaymentExecution()
							.getReferencedDocumentHeader()
							.getBuFmisDocumentId());
					if (payExec == null) {
						payExec = new Payexec();
					}
					payExec.postaviVrijednosti(response.getPaymentExecution(),
							messageHeader, resMsg);
					session.save(resMsg);
					session.saveOrUpdate(payExec);
					sessionPomocna.commitTransakcije();
				}
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod preuzimanja odgovora "
						+ messageName + " , poruka: "
						+ Integer.toString(payExec.getBufmisdoc())
						+ PomocnaError.getErrorMessage(e));
			}

		}
		obradaResponseXML(anyTypeLista, messageName);
	}

	private void obradaResponseXML(AnyTypeList anyTypeLista, String messageName) {
		MessageHeader messageHeader = null;
		List responseLista = anyTypeLista.getAnyTypeElement();
		for (Iterator iterator = responseLista.iterator(); iterator.hasNext();) {
			Object object = iterator.next();

			if (object instanceof BankResponseMsg) {
				BankResponseMsg response = (BankResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof VendorResponseMsg) {
				VendorResponseMsg response = (VendorResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof ReservationResponseMsg) {
				ReservationResponseMsg response = (ReservationResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof ContractResponseMsg) {
				ContractResponseMsg response = (ContractResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof PurchaseOrderResponseMsg) {
				PurchaseOrderResponseMsg response = (PurchaseOrderResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof InvoiceResponseMsg) {
				InvoiceResponseMsg response = (InvoiceResponseMsg) object;
				messageHeader = response.getMessageHeader();
			}

			if (object instanceof PaymentExecutionNotificationEventMsg) {
				PaymentExecutionNotificationEventMsg response = (PaymentExecutionNotificationEventMsg) object;
				messageHeader = response.getMessageHeader();
			}

			try {
				if (object != null) {
					sessionPomocna.otvoriTransakciju();
					ResxmlDAO.spremiResponse(messageHeader.getResponseMsgId(),
							object, session, sessionPomocna);
					sessionPomocna.commitTransakcije();
				}

			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger
						.severe("Gre�ka kod preuzimanja odgovora, ResXML obrada "
								+ messageName
								+ " ,poruka: "
								+ Long.toString(messageHeader
										.getResponseMsgId())
								+ PomocnaError.getErrorMessage(e));
			} finally {
				if (Postavke.DEBUG_PORUKA) {
					debug.ispisUXML(
							object,
							"Message_response_"
									+ Long.toString(messageHeader
											.getResponseMsgId()));
				}
			}
		}
	}
	// Nije implementirano
	/*
	 * 
	 * 
	 * { System.out.println("Invoking getAllResponseList..."); java.lang.String
	 * _getAllResponseList_logicalSystemName =
	 * "_getAllResponseList_logicalSystemName-972104159"; java.lang.Object
	 * _getAllResponseList__return =
	 * port.getAllResponseList(_getAllResponseList_logicalSystemName);
	 * System.out.println("getAllResponseList.result=" +
	 * _getAllResponseList__return);
	 * 
	 * 
	 * } {
	 * System.out.println("Invoking getAllResponseListStartingWithMessageId..."
	 * ); java.lang.String
	 * _getAllResponseListStartingWithMessageId_logicalSystemName =
	 * "_getAllResponseListStartingWithMessageId_logicalSystemName314994187";
	 * java.lang.Long _getAllResponseListStartingWithMessageId_messageId =
	 * Long.valueOf(-4192823889397524263l); java.lang.Object
	 * _getAllResponseListStartingWithMessageId__return =
	 * port.getAllResponseListStartingWithMessageId
	 * (_getAllResponseListStartingWithMessageId_logicalSystemName,
	 * _getAllResponseListStartingWithMessageId_messageId);
	 * System.out.println("getAllResponseListStartingWithMessageId.result=" +
	 * _getAllResponseListStartingWithMessageId__return);
	 * 
	 * 
	 * }
	 */

}
