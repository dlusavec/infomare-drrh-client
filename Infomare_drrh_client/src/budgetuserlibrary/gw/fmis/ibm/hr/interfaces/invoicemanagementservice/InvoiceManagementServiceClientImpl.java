package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.InvitemlstDAO;
import hr.infomare.drrh.dao.InvoiceDAO;
import hr.infomare.drrh.dao.InvoicemsgDAO;
import hr.infomare.drrh.dao.NotifheadDAO;
import hr.infomare.drrh.dao.ReqmsgDAO;
import hr.infomare.drrh.dao.ResxmlDAO;
import hr.infomare.drrh.dao.StatnotifDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pojo.Notifhead;
import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pojo.Resmsg;
import hr.infomare.drrh.pojo.Statnotif;
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

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.invoicemanagementservice.binding.ManageInvoiceExportInvoiceManagementServiceHttpService;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceChangeRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceCreateRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.InvoiceReverseRequestMsg;
import bufmisbudgetexecution.gw.fmis.ibm.hr.infotypes.DocumentHeader;

/**
 * This class was generated by Apache CXF 2.4.0 2011-10-26T15:54:41.650+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class InvoiceManagementServiceClientImpl {
	private QName serviceName;
	private URL wsdlURL = ManageInvoiceExportInvoiceManagementServiceHttpService.WSDL_LOCATION;
	private ManageInvoiceExportInvoiceManagementServiceHttpService servis;
	private InvoiceManagementService port;
	private SessionPomocna sessionPomocna;
	private Session session;
	private InvoicemsgDAO invoiceMsgDAO;
	private InvitemlstDAO invItemLstDAO;
	private ReqmsgDAO reqMsgDAO;
	private VendorVeznaDAO vendorVeznaDAO;
	private StatnotifDAO statusNotifDAO;
	private NotifheadDAO notifHeadDAO;
	private DocheadDAO docheadDAO;
	private InvoiceDAO invoiceDAO;
	private Debug debug = new Debug("Invoice");

	public InvoiceManagementServiceClientImpl() {
	}

	public void razmjenaFaktura() {
		try {
			otvoriPortISesiju();
			createInvoice();
			changeInvoice();
			reverseInvoice();
		} catch (Exception e) {
			Log.loger.severe("Gre�ka kod razmjene faktura "
					+ PomocnaError.getErrorMessage(e));
		}
	}

	private void otvoriPortISesiju() {
		serviceName = new QName(
				ManageInvoiceExportInvoiceManagementServiceHttpService.TARGET_NAMESPACE,
				ManageInvoiceExportInvoiceManagementServiceHttpService.SERVIS);
		wsdlURL = ManageInvoiceExportInvoiceManagementServiceHttpService.WSDL_LOCATION;
		servis = new ManageInvoiceExportInvoiceManagementServiceHttpService(
				wsdlURL, serviceName);
		port = servis.getManageInvoiceExportInvoiceManagementServiceHttpPort();
		PomocnaKlijent.postavkeKlijenta(port);
		sessionPomocna = new SessionPomocna();
		session = sessionPomocna.getSession();
		invoiceMsgDAO = new InvoicemsgDAO(session);
		invItemLstDAO = new InvitemlstDAO(session);
		reqMsgDAO = new ReqmsgDAO(session);
		statusNotifDAO = new StatnotifDAO(session);
		notifHeadDAO = new NotifheadDAO(session);
		vendorVeznaDAO = new VendorVeznaDAO(session);
		docheadDAO = new DocheadDAO(session);
		invoiceDAO = new InvoiceDAO(session);
	}

	private void createInvoice() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		InvoiceCreateRequestMsg request = new InvoiceCreateRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		InvoiceResponseMsg response = null;
		budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Invoice invoice = null;
		Statnotif statNotif = null;
		Notifhead notifHead = null;
		// hr.infomare.drrh.pojo.Invoice faktura = null;
		List fakture = invoiceMsgDAO.getInvoicemsgDAO((byte) 1);
		List invItemLst;
		Dochead docHead = null;
		for (Iterator iterator = fakture.iterator(); iterator.hasNext();) {
			Invoicemsg invoiceMsg = (Invoicemsg) iterator.next();
			invItemLst = invItemLstDAO.getInvItemLst(invoiceMsg.getInvmsgid());
			docHead = docheadDAO.getDocHeadByPK(invoiceMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				invoice = new budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Invoice();
				invoice.postaviVrijednosti(invoiceMsg, invItemLst, docHead,
						docheadDAO, vendorVeznaDAO);
				request.setMessageHeader(messageHeader);
				request.setInvoice(invoice);
				try {
					response = port.createInvoice(request);
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
				} catch (Exception e) {
					response = new InvoiceResponseMsg();
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
					response.setResponseMessageType(ResponseMessageType.ERROR);
					response.setErrorResponse(PomocnaError.getErrorResponse(
							"Invoice", e));
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				// faktura = new hr.infomare.drrh.pojo.Invoice();
				notifHead = new Notifhead();
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "createInvoice");
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"createInvoice", response.getResponseMessageType(),
						reqMsg);
				invoiceMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());

				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					// statNotif.postaviVrijednosti(statNotId, resMsg,
					// "createInvoice", response.getNotificationResponse()
					// .getInvoiceStatus(), response
					// .getMessageHeader());
					// notifHead.postaviVrijednosti(notHeadId, statNotId,
					// resMsg,
					// response.getMessageHeader(), response
					// .getNotificationResponse().getHeader(),
					// response.getNotificationResponse());

					// faktura.postaviVrijednosti(invoiceMsg, notHeadId,
					// statNotId, response.getNotificationResponse()
					// .getHeader(), response
					// .getNotificationResponse()
					// .getInvoiceStatus(), resMsg);
					// docHead.postaviVrijednosti(response
					// .getNotificationResponse().getHeader(), response
					// .getMessageHeader());
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(invoiceMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					// session.save(statNotif);
					// session.save(notifHead);
					// session.saveOrUpdate(faktura);
					// session.update(docHead);
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod kreiranja nove fakture, poruka: "
						+ Integer.toString(invoiceMsg.getInvmsgid())
						+ PomocnaError.getErrorMessage(e));
			}

			finally {
				try {
					ResxmlDAO.spremiResponse(response.getMessageHeader()
							.getResponseMsgId(), response, session,
							sessionPomocna);
					if (Postavke.DEBUG_POJO) {
						debug.ispisUXML(
								resMsg,
								"Pojo_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(invoiceMsg, "Pojo_invoicemsg_"
								+ Integer.toString(invoiceMsg.getInvmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						/*
						 * debug.ispisUXML( faktura, "Pojo_invoice_" +
						 * Integer.toString(invoiceMsg .getInvmsgid()));
						 */
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace upisa fakture, poruka: "
									+ Integer.toString(invoiceMsg.getInvmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}
		}

	}

	private void changeInvoice() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		InvoiceChangeRequestMsg request = new InvoiceChangeRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		InvoiceResponseMsg response = null;
		budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Invoice invoice = null;
		Statnotif statNotif = null;
		Notifhead notifHead = null;
		// hr.infomare.drrh.pojo.Invoice faktura = null;
		List fakture = invoiceMsgDAO.getInvoicemsgDAO((byte) 2);
		List invItemLst;
		Dochead docHead = null;
		for (Iterator iterator = fakture.iterator(); iterator.hasNext();) {
			Invoicemsg invoiceMsg = (Invoicemsg) iterator.next();
			invItemLst = invItemLstDAO.getInvItemLst(invoiceMsg.getInvmsgid());
			docHead = docheadDAO.getDocHeadByPK(invoiceMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				invoice = new budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Invoice();
				invoice.postaviVrijednosti(invoiceMsg, invItemLst, docHead,
						docheadDAO, vendorVeznaDAO);
				request.setMessageHeader(messageHeader);
				request.setInvoice(invoice);
				try {
					response = port.changeInvoice(request);
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
				} catch (Exception e) {
					response = new InvoiceResponseMsg();
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
					response.setResponseMessageType(ResponseMessageType.ERROR);
					response.setErrorResponse(PomocnaError.getErrorResponse(
							"Invoice", e));
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				// faktura = new hr.infomare.drrh.pojo.Invoice();
				notifHead = new Notifhead();
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "changeInvoice");
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"changeInvoice", response.getResponseMessageType(),
						reqMsg);
				invoiceMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());

				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*
					 * statNotif.postaviVrijednosti(statNotId, resMsg,
					 * "changeInvoice", response.getNotificationResponse()
					 * .getInvoiceStatus(), response .getMessageHeader());
					 * notifHead.postaviVrijednosti(notHeadId, statNotId,
					 * resMsg, response.getMessageHeader(), response
					 * .getNotificationResponse().getHeader(),
					 * response.getNotificationResponse()); faktura =
					 * invoiceDAO.getInvoiceByPK(invoiceMsg.getF17upr(),
					 * invoiceMsg.getF17god(), invoiceMsg.getF17vpr(),
					 * invoiceMsg.getF17rbr(), invoiceMsg.getF17dod());
					 * faktura.postaviVrijednosti(invoiceMsg, notHeadId,
					 * statNotId, response.getNotificationResponse()
					 * .getHeader(), response .getNotificationResponse()
					 * .getInvoiceStatus(), resMsg);
					 * docHead.postaviVrijednosti(response
					 * .getNotificationResponse().getHeader(), response
					 * .getMessageHeader());
					 */
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(invoiceMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*
					 * session.save(statNotif); session.save(notifHead);
					 * session.saveOrUpdate(faktura); session.update(docHead);
					 */
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod izmjene fakture, poruka: "
						+ Integer.toString(invoiceMsg.getInvmsgid())
						+ PomocnaError.getErrorMessage(e));
			}

			finally {
				try {
					ResxmlDAO.spremiResponse(response.getMessageHeader()
							.getResponseMsgId(), response, session,
							sessionPomocna);
					if (Postavke.DEBUG_POJO) {
						debug.ispisUXML(
								resMsg,
								"Pojo_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(invoiceMsg, "Pojo_invoicemsg_"
								+ Integer.toString(invoiceMsg.getInvmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						/*
						 * debug.ispisUXML( faktura, "Pojo_invoice_" +
						 * Integer.toString(invoiceMsg .getInvmsgid()));
						 */
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace izmjene fakture, poruka: "
									+ Integer.toString(invoiceMsg.getInvmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}
		}

	}

	private void reverseInvoice() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		InvoiceReverseRequestMsg request = new InvoiceReverseRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		InvoiceResponseMsg response = null;
		DocumentHeader documentHeader = null;
		Statnotif statNotif = null;
		Notifhead notifHead = null;
		// hr.infomare.drrh.pojo.Invoice faktura = null;
		List fakture = invoiceMsgDAO.getInvoicemsgDAO((byte) 9);
		Dochead docHead = null;
		for (Iterator iterator = fakture.iterator(); iterator.hasNext();) {
			Invoicemsg invoiceMsg = (Invoicemsg) iterator.next();
			docHead = docheadDAO.getDocHeadByPK(invoiceMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				documentHeader = new DocumentHeader();
				documentHeader.postaviVrijednosti(docHead);

				request.setMessageHeader(messageHeader);
				request.setInvoice(documentHeader);
				request.setBuFmisDocumentIdToReverse(invoiceMsg.getBufmisrev()
						.toString());
				try {
					response = port.reverseInvoice(request);
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
				} catch (Exception e) {
					response = new InvoiceResponseMsg();
					response.setMessageHeader(Pomocna
							.getNewMessageHeader(session));
					response.setResponseMessageType(ResponseMessageType.ERROR);
					response.setErrorResponse(PomocnaError.getErrorResponse(
							"Invoice", e));
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				// faktura = new hr.infomare.drrh.pojo.Invoice();
				notifHead = new Notifhead();
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "reverseInvoice");
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"reverseInvoice", response.getResponseMessageType(),
						reqMsg);
				invoiceMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());

				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*
					 * statNotif.postaviVrijednosti(statNotId, resMsg,
					 * "reverseInvoice", response .getNotificationResponse()
					 * .getInvoiceStatus(), response .getMessageHeader());
					 * notifHead.postaviVrijednosti(notHeadId, statNotId,
					 * resMsg, response.getMessageHeader(), response
					 * .getNotificationResponse().getHeader(),
					 * response.getNotificationResponse()); faktura =
					 * invoiceDAO.getInvoiceByPK(invoiceMsg.getF17upr(),
					 * invoiceMsg.getF17god(), invoiceMsg.getF17vpr(),
					 * invoiceMsg.getF17rbr(), invoiceMsg.getF17dod());
					 * faktura.postaviVrijednosti(invoiceMsg, notHeadId,
					 * statNotId, response.getNotificationResponse()
					 * .getHeader(), response .getNotificationResponse()
					 * .getInvoiceStatus(), resMsg);
					 * docHead.postaviVrijednosti(response
					 * .getNotificationResponse().getHeader(), response
					 * .getMessageHeader());
					 */
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(invoiceMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*
					 * session.save(statNotif); session.save(notifHead);
					 * session.saveOrUpdate(faktura); session.update(docHead);
					 */
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod storna fakture, poruka: "
						+ Integer.toString(invoiceMsg.getInvmsgid())
						+ PomocnaError.getErrorMessage(e));
			}

			finally {
				try {
					ResxmlDAO.spremiResponse(response.getMessageHeader()
							.getResponseMsgId(), response, session,
							sessionPomocna);
					if (Postavke.DEBUG_POJO) {
						debug.ispisUXML(
								resMsg,
								"Pojo_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(invoiceMsg, "Pojo_invoicemsg_"
								+ Integer.toString(invoiceMsg.getInvmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						/*
						 * debug.ispisUXML( faktura, "Pojo_invoice_" +
						 * Integer.toString(invoiceMsg .getInvmsgid()));
						 */
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(invoiceMsg
												.getInvmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace storna fakture, poruka: "
									+ Integer.toString(invoiceMsg.getInvmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}
		}

	}
}