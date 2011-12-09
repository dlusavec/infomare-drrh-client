package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import hr.ibm.fmis.gw.comm.DistributionManagementLibrary.messages.AnyTypeList;
import hr.infomare.drrh.dao.BudcomDAO;
import hr.infomare.drrh.dao.BudcommsgDAO;
import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.InvoiceDAO;
import hr.infomare.drrh.dao.InvoicemsgDAO;
import hr.infomare.drrh.dao.NotifheadDAO;
import hr.infomare.drrh.dao.ReqmsgDAO;
import hr.infomare.drrh.dao.StatnotifDAO;
import hr.infomare.drrh.dao.VenbanaccmDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.dao.VendormsgDAO;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Budcom;
import hr.infomare.drrh.pojo.Budcommsg;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pojo.Notifhead;
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

import org.hibernate.Session;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.BudgetCommitmentStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.InvoiceStatusNotification;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.responsemessagehandlerservice.binding2.ResponseMessageHandlerServiceExportResponseMessageHandlerServiceHttpService;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.ContractResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg;
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
	private BudcommsgDAO budcomMsgDAO;
	private InvoicemsgDAO invoiceMsgDAO;
	private InvoiceDAO invoiceDAO;
	private DocheadDAO docHeadDAO;
	private ReqmsgDAO reqMsgDAO;
	private VendorVeznaDAO vendorVeznaDAO;
	private StatnotifDAO statusNotifDAO;
	private NotifheadDAO notifHeadDAO;
	private BudcomDAO budComDAO;
	private VendormsgDAO vendorMsgDAO;
	private VenbanaccmDAO venBanAccMDAO;
	private Debug debug = new Debug("Response");

	public ResponseMessageHandlerServiceClientImpl() {
	}

	public void razmjenaOdgovora() {
		try {
			otvoriPortISesiju();
			// preuzmiContractResponseMessageId();
			// preuzmiReservationResponseMessageId();
			// preuzmiPurchaseOrderResponseMessageId();
			// preuzmiInvoiceResponseMessageId();

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
		budcomMsgDAO = new BudcommsgDAO(session);
		docHeadDAO = new DocheadDAO(session);
		reqMsgDAO = new ReqmsgDAO(session);
		statusNotifDAO = new StatnotifDAO(session);
		notifHeadDAO = new NotifheadDAO(session);
		vendorVeznaDAO = new VendorVeznaDAO(session);
		budComDAO = new BudcomDAO(session);
		invoiceMsgDAO = new InvoicemsgDAO(session);
		invoiceDAO = new InvoiceDAO(session);
		vendorMsgDAO = new VendormsgDAO(session);
		venBanAccMDAO = new VenbanaccmDAO(session);
	}

	private void obradaVendorMsg(AnyTypeList anyTypeLista, String messageName) {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
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
			try {
				vendorMsg = vendorMsgDAO.getVendorByPK(response.getVendor()
						.getLogicalSystemVendorID());
				// Prijava novog partnera
				if (vendorMsg != null) {
					sessionPomocna.otvoriTransakciju();
					vendorAccountsLista = venBanAccMDAO
							.getVenBanAccMByVendorAndRequest(vendorMsg
									.getF41ctr(), vendorMsg.getReqmsg()
									.getReqmsgid());
					messageHeader.postaviVrijednosti();
					reqMsg = new Reqmsg();
					resMsg = new Resmsg();
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType);
					reqMsg.postaviVrijednosti(messageHeader, reqMsgId,
							messageName);
					vendorMsg.postaviVrijednostiRetrive(Pomocna
							.getStatusRetrive(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()), response);

					session.save(resMsg);
					session.save(reqMsg);
					session.update(vendorMsg);
					for (Iterator iteratorVenBanAcc = vendorAccountsLista
							.iterator(); iteratorVenBanAcc.hasNext();) {
						Venbanaccm venBanAccM = (Venbanaccm) iteratorVenBanAcc
								.next();
						venBanAccM.postaviVrijednosti(Pomocna
								.getStatusRetrive(responseMessageType), reqMsg,
								PomocnaDatum.XMLDatumUDate(messageHeader
										.getSubmitionTimestamp()));
						session.update(venBanAccM);
					}
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						vendorVezna = new VendorVezna();
						vendorVezna.postaviVrijednosti(reqMsg, response);
						session.save(vendorVezna);
					}
					Pomocna.obradaGresaka(session, errorResponse, messageHeader);
					sessionPomocna.commitTransakcije();
					++reqMsgId;
				}

				// Ako je samo prijava zira, logika pretpostavljam da je dobra
				else {
					vendorAccountsLista = venBanAccMDAO
							.getVenBanAccMByVendorAndRequest(response
									.getVendor().getLogicalSystemVendorID(),
									null);
					if (vendorAccountsLista != null) {
						sessionPomocna.otvoriTransakciju();
						messageHeader.postaviVrijednosti();
						reqMsg = new Reqmsg();
						resMsg = new Resmsg();
						resMsg.postaviVrijednosti(messageHeader, messageName,
								responseMessageType);
						reqMsg.postaviVrijednosti(messageHeader, reqMsgId,
								messageName);

						session.save(resMsg);
						session.save(reqMsg);
						for (Iterator iteratorVenBanAcc = vendorAccountsLista
								.iterator(); iteratorVenBanAcc.hasNext();) {
							Venbanaccm venBanAccM = (Venbanaccm) iteratorVenBanAcc
									.next();
							venBanAccM.postaviVrijednosti(Pomocna
									.getStatusRetrive(responseMessageType),
									reqMsg, PomocnaDatum
											.XMLDatumUDate(messageHeader
													.getSubmitionTimestamp()));
							session.update(venBanAccM);
						}
						Pomocna.obradaGresaka(session, errorResponse,
								messageHeader);
						sessionPomocna.commitTransakcije();
						++reqMsgId;
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

	}

	private void obradaBudComMsg(AnyTypeList anyTypeLista, String messageName) {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
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
					messageHeader.postaviVrijednosti();
					reqMsg = new Reqmsg();
					resMsg = new Resmsg();
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType);
					reqMsg.postaviVrijednosti(messageHeader, reqMsgId,
							messageName);
					budComMsg.postaviVrijednosti(Pomocna
							.getStatusRetrive(responseMessageType), reqMsg,
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
										.getCommitmentStatus().name());
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
					session.save(reqMsg);
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
					++reqMsgId;
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

	}

	private void obradaInvoiceMsg(AnyTypeList anyTypeLista, String messageName) {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
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
					messageHeader.postaviVrijednosti();
					reqMsg = new Reqmsg();
					resMsg = new Resmsg();
					resMsg.postaviVrijednosti(messageHeader, messageName,
							responseMessageType);
					reqMsg.postaviVrijednosti(messageHeader, reqMsgId,
							messageName);
					invoiceMsg.postaviVrijednosti(Pomocna
							.getStatusRetrive(responseMessageType), reqMsg,
							PomocnaDatum.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()),
							invoiceStatusNotification);
					if (responseMessageType
							.equals(ResponseMessageType.NOTIFICATION)) {
						docHead = docHeadDAO.getDocHeadByPK(invoiceMsg
								.getRefdocid());
						statNotif = new Statnotif();
						notifHead = new Notifhead();
						invoiceMsg.setInvststy(invoiceStatusNotification
								.getInvoiceStatus().name());
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
					session.save(resMsg);
					session.save(reqMsg);
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
					++reqMsgId;
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

	}

	public void preuzmiVendorResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getVendorUpdatesList(Postavke.LOGICAL_SYSTEM_NAME),
				"retriveVendor");
	}

	public void preuzmiVendorResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getVendorUpdatesListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retriveVendorMessageId");
	}

	public void preuzmiContractResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getContractResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retriveContract");
	}

	public void preuzmiReservationResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getReservationResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retriveResponse");
	}

	public void preuzmiReservationResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getReservationResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retriveResponseMessageId");
	}

	public void preuzmiContractResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getContractResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retriveContractMessageId");
	}

	public void preuzmiPurchaseOrderResponse() {
		obradaBudComMsg(
				(AnyTypeList) port
						.getPurchaseOrderResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retrivePurchaseOrder");
	}

	public void preuzmiPurchaseOrderResponseMessageId() {
		obradaBudComMsg(
				(AnyTypeList) port.getPurchaseOrderResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retrivePurchaseOrderMessageId");
	}

	public void preuzmiInvoiceResponse() {
		obradaInvoiceMsg(
				(AnyTypeList) port
						.getInvoiceResponseList(Postavke.LOGICAL_SYSTEM_NAME),
				"retriveInvoice");
	}

	public void preuzmiInvoiceResponseMessageId() {
		obradaInvoiceMsg(
				(AnyTypeList) port.getInvoiceResponseListStartingWithMessageId(
						Postavke.LOGICAL_SYSTEM_NAME, Long.valueOf(0)),
				"retriveInvoiceMessageId");
	}

	/*
	 * 
	 * 
	 * {
	 * System.out.println("Invoking getPaymentExecutionListStartingWithMessageId..."
	 * ); java.lang.String
	 * _getPaymentExecutionListStartingWithMessageId_logicalSystemName =
	 * "_getPaymentExecutionListStartingWithMessageId_logicalSystemName848007126"
	 * ; java.lang.Long _getPaymentExecutionListStartingWithMessageId_messageId
	 * = Long.valueOf(2259185400731745442l); java.lang.Object
	 * _getPaymentExecutionListStartingWithMessageId__return =
	 * port.getPaymentExecutionListStartingWithMessageId
	 * (_getPaymentExecutionListStartingWithMessageId_logicalSystemName,
	 * _getPaymentExecutionListStartingWithMessageId_messageId);
	 * System.out.println("getPaymentExecutionListStartingWithMessageId.result="
	 * + _getPaymentExecutionListStartingWithMessageId__return);
	 * 
	 * 
	 * } { System.out.println("Invoking getBankUpdatesList...");
	 * java.lang.String _getBankUpdatesList_logicalSystemName =
	 * "_getBankUpdatesList_logicalSystemName1390253176"; java.lang.Object
	 * _getBankUpdatesList__return =
	 * port.getBankUpdatesList(_getBankUpdatesList_logicalSystemName);
	 * System.out.println("getBankUpdatesList.result=" +
	 * _getBankUpdatesList__return);
	 * 
	 * 
	 * } {
	 * System.out.println("Invoking getBankUpdatesListStartingWithMessageId..."
	 * ); java.lang.String
	 * _getBankUpdatesListStartingWithMessageId_logicalSystemName =
	 * "_getBankUpdatesListStartingWithMessageId_logicalSystemName-809029705";
	 * java.lang.Long _getBankUpdatesListStartingWithMessageId_messageId =
	 * Long.valueOf(7976208711176604334l); java.lang.Object
	 * _getBankUpdatesListStartingWithMessageId__return =
	 * port.getBankUpdatesListStartingWithMessageId
	 * (_getBankUpdatesListStartingWithMessageId_logicalSystemName,
	 * _getBankUpdatesListStartingWithMessageId_messageId);
	 * System.out.println("getBankUpdatesListStartingWithMessageId.result=" +
	 * _getBankUpdatesListStartingWithMessageId__return);
	 * 
	 * 
	 * }{ System.out.println("Invoking getAllResponseList..."); java.lang.String
	 * _getAllResponseList_logicalSystemName =
	 * "_getAllResponseList_logicalSystemName-972104159"; java.lang.Object
	 * _getAllResponseList__return =
	 * port.getAllResponseList(_getAllResponseList_logicalSystemName);
	 * System.out.println("getAllResponseList.result=" +
	 * _getAllResponseList__return);
	 * 
	 * 
	 * } { System.out.println("Invoking getPaymentExecutionList...");
	 * java.lang.String _getPaymentExecutionList_logicalSystemName =
	 * "_getPaymentExecutionList_logicalSystemName-743724591"; java.lang.Object
	 * _getPaymentExecutionList__return =
	 * port.getPaymentExecutionList(_getPaymentExecutionList_logicalSystemName);
	 * System.out.println("getPaymentExecutionList.result=" +
	 * _getPaymentExecutionList__return);
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
