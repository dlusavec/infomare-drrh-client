package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice;

import hr.infomare.drrh.dao.BcitemlstDAO;
import hr.infomare.drrh.dao.BudcomDAO;
import hr.infomare.drrh.dao.BudcommsgDAO;
import hr.infomare.drrh.dao.DocheadDAO;
import hr.infomare.drrh.dao.NotifheadDAO;
import hr.infomare.drrh.dao.ReqmsgDAO;
import hr.infomare.drrh.dao.ResxmlDAO;
import hr.infomare.drrh.dao.StatnotifDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pojo.Budcom;
import hr.infomare.drrh.pojo.Budcommsg;
import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pojo.Notifhead;
import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pojo.Resmsg;
import hr.infomare.drrh.pojo.Statnotif;
import hr.infomare.drrh.pomocni.BudcommsgType;
import hr.infomare.drrh.pomocni.Debug;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.Pomocna;
import hr.infomare.drrh.pomocni.PomocnaDatum;
import hr.infomare.drrh.pomocni.PomocnaError;
import hr.infomare.drrh.postavke.Postavke;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import org.hibernate.Session;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.BudgetCommitment;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.purchaseordermanagementservice.binding.PoManagementPortExportPurchaseOrderManagementServiceHttpService;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderChangeRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderCloseRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderCreateRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.PurchaseOrderResponseMsg;

/**
 * This class was generated by Apache CXF 2.4.0 2011-10-18T09:28:46.521+02:00
 * Generated source version: 2.4.0
 * 
 */

public final class PurchaseOrderManagementServiceClientImpl {
	private QName serviceName;
	private URL wsdlURL = PoManagementPortExportPurchaseOrderManagementServiceHttpService.WSDL_LOCATION;
	private PoManagementPortExportPurchaseOrderManagementServiceHttpService servis;
	private PurchaseOrderManagementService port;
	private SessionPomocna sessionPomocna;
	private Session session;
	private BudcommsgDAO budcomMsgDAO;
	private BcitemlstDAO bctItemLstDAO;
	private DocheadDAO docHeadDAO;
	private ReqmsgDAO reqMsgDAO;
	private VendorVeznaDAO vendorVeznaDAO;
	private StatnotifDAO statusNotifDAO;
	private NotifheadDAO notifHeadDAO;
	private BudcomDAO budComDAO;
	private Debug debug = new Debug("PURCHASE_ORDER");

	public PurchaseOrderManagementServiceClientImpl() {
	}

	public void razmjenaNarudzbenica() {
		try {
			Log.loger.info("Po�etak razmjene naru�benica.");
			otvoriPortISesiju();
			createPurchaseOrder();
			changePurchaseOrder();
			closePurchaseOrder();
			Log.loger.info("Zavr�etak razmjene naru�benica.");
		} catch (Exception e) {
			Log.loger.severe("Gre�ka kod razmjene naru�benica "
					+ PomocnaError.getErrorMessage(e));
		}
	}

	private void otvoriPortISesiju() {
		serviceName = new QName(
				PoManagementPortExportPurchaseOrderManagementServiceHttpService.TARGET_NAMESPACE,
				PoManagementPortExportPurchaseOrderManagementServiceHttpService.SERVIS);
		wsdlURL = PoManagementPortExportPurchaseOrderManagementServiceHttpService.WSDL_LOCATION;
		servis = new PoManagementPortExportPurchaseOrderManagementServiceHttpService(
				wsdlURL, serviceName);
		port = servis
				.getPoManagementPortExportPurchaseOrderManagementServiceHttpPort();
		sessionPomocna = new SessionPomocna();
		session = sessionPomocna.getSession();
		budcomMsgDAO = new BudcommsgDAO(session);
		bctItemLstDAO = new BcitemlstDAO(session);
		docHeadDAO = new DocheadDAO(session);
		reqMsgDAO = new ReqmsgDAO(session);
		statusNotifDAO = new StatnotifDAO(session);
		notifHeadDAO = new NotifheadDAO(session);
		vendorVeznaDAO = new VendorVeznaDAO(session);
		budComDAO = new BudcomDAO(session);
	}

	private void createPurchaseOrder() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		PurchaseOrderCreateRequestMsg request = new PurchaseOrderCreateRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		PurchaseOrderResponseMsg response = null;
		BudgetCommitment budgetCommitment = null;
		Statnotif statNotif = null;
		//Budcom budCom = null;
		Notifhead notifHead = null;
		List narudzbenice = budcomMsgDAO.getBudcommsg(
				BudcommsgType.PURCHASE_ORDER, (byte) 1);
		List bctItems;
		Dochead docHead = null;
		Bcitemlst bctItemlst;
		for (Iterator iterator = narudzbenice.iterator(); iterator.hasNext();) {
			Budcommsg budComMsg = (Budcommsg) iterator.next();
			bctItems = bctItemLstDAO.getBcitemlst(budComMsg.getBcmsgid());
			docHead = docHeadDAO.getDocHeadByPK(budComMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				budgetCommitment = new BudgetCommitment();
				budgetCommitment.postaviVrijednosti(budComMsg, bctItems,
						docHead, vendorVeznaDAO, docHeadDAO);
				request.setMessageHeader(messageHeader);
				request.setBudgetCommitment(budgetCommitment);
				try {
					response = port.createPurchaseOrder(request);
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
				} catch (Exception e) {
					if (response == null) {
						response = new PurchaseOrderResponseMsg();
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
						response.setResponseMessageType(ResponseMessageType.ERROR);
						response.setErrorResponse(PomocnaError
								.getErrorResponse("Purchase_order", e));
					}
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				//budCom = new Budcom();
				notifHead = new Notifhead();
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"createPurchaseOrder",
						response.getResponseMessageType());
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "createPurchaseOrder");
				budComMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());
				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
				/*	statNotif.postaviVrijednosti(statNotId, resMsg,
							"createPurchaseOrder", response
									.getNotificationResponse()
									.getCommitmentStatus(), response
									.getMessageHeader());
					notifHead.postaviVrijednosti(notHeadId, statNotId, resMsg,
							response.getMessageHeader(), response
									.getNotificationResponse().getHeader(),
							response.getNotificationResponse());
					budCom.postaviVrijednosti(budComMsg, notHeadId, statNotId,
							response.getNotificationResponse().getHeader(),
							response.getNotificationResponse()
									.getCommitmentStatus(), resMsg);
					docHead.postaviVrijednosti(response
							.getNotificationResponse().getHeader(), response
							.getMessageHeader());*/
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(budComMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
				/*	session.save(statNotif);
					session.save(notifHead);
					session.saveOrUpdate(budCom);
					session.update(docHead);*/
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger
						.severe("Gre�ka kod kreiranja nove narudzbenice, poruka: "
								+ Integer.toString(budComMsg.getBcmsgid())
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
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(budComMsg, "Pojo_purchase_order_"
								+ Integer.toString(budComMsg.getBcmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
					/*	debug.ispisUXML(
								budCom,
								"Pojo_budcom_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));*/
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace upisa narudzbenice, poruka: "
									+ Integer.toString(budComMsg.getBcmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}

		}

	}

	private void changePurchaseOrder() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		PurchaseOrderChangeRequestMsg request = new PurchaseOrderChangeRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		PurchaseOrderResponseMsg response = null;
		BudgetCommitment budgetCommitment = null;
		Statnotif statNotif = null;
		//Budcom budCom = null;
		Notifhead notifHead = null;
		List ugovori = budcomMsgDAO.getBudcommsg(BudcommsgType.PURCHASE_ORDER,
				(byte) 2);
		List bctItems;
		Dochead docHead = null;
		Bcitemlst bctItemlst;
		for (Iterator iterator = ugovori.iterator(); iterator.hasNext();) {
			Budcommsg budComMsg = (Budcommsg) iterator.next();
			bctItems = bctItemLstDAO.getBcitemlst(budComMsg.getBcmsgid());
			docHead = docHeadDAO.getDocHeadByPK(budComMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				budgetCommitment = new BudgetCommitment();
				budgetCommitment.postaviVrijednosti(budComMsg, bctItems,
						docHead, vendorVeznaDAO, docHeadDAO);
				request.setMessageHeader(messageHeader);
				request.setBudgetCommitment(budgetCommitment);
				try {
					response = port.changePurchaseOrder(request);
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
				} catch (Exception e) {
					if (response == null) {
						response = new PurchaseOrderResponseMsg();
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
						response.setResponseMessageType(ResponseMessageType.ERROR);
						response.setErrorResponse(PomocnaError
								.getErrorResponse("Purchase_order", e));
					}
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				//budCom = new Budcom();
				notifHead = new Notifhead();
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"changePurchaseOrder",
						response.getResponseMessageType());
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "changePurchaseOrder");
				budComMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());
				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
				/*	statNotif.postaviVrijednosti(statNotId, resMsg,
							"changePurchaseOrder", response
									.getNotificationResponse()
									.getCommitmentStatus(), response
									.getMessageHeader());
					notifHead.postaviVrijednosti(notHeadId, statNotId, resMsg,
							response.getMessageHeader(), response
									.getNotificationResponse().getHeader(),
							response.getNotificationResponse());
					budCom = budComDAO.getBudcomByPK(budComMsg.getCurlib(),
							budComMsg.getR95upr(), budComMsg.getR95god(),
							budComMsg.getR95rbr());
					budCom.postaviVrijednosti(budComMsg, notHeadId, statNotId,
							response.getNotificationResponse().getHeader(),
							response.getNotificationResponse()
									.getCommitmentStatus(), resMsg);
					docHead.postaviVrijednosti(response
							.getNotificationResponse().getHeader(), response
							.getMessageHeader());*/
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(budComMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*session.save(statNotif);
					session.save(notifHead);
					session.saveOrUpdate(budCom);
					session.update(docHead);*/
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod izmjene narudzbenice, poruka: "
						+ Integer.toString(budComMsg.getBcmsgid())
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
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(budComMsg, "Pojo_purchase_order_"
								+ Integer.toString(budComMsg.getBcmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						/*debug.ispisUXML(
								budCom,
								"Pojo_budcom_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));*/
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace izmjene narudzbenice, poruka: "
									+ Integer.toString(budComMsg.getBcmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}

		}
	}

	private void closePurchaseOrder() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		Integer statNotId = statusNotifDAO.getIduciRbr();
		Integer notHeadId = notifHeadDAO.getIduciRbr();
		PurchaseOrderCloseRequestMsg request = new PurchaseOrderCloseRequestMsg();
		MessageHeader messageHeader;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		PurchaseOrderResponseMsg response = null;
		BudgetCommitment budgetCommitment = null;
		Statnotif statNotif = null;
		//Budcom budCom = null;
		Notifhead notifHead = null;
		List narudzbenice = budcomMsgDAO.getBudcommsg(
				BudcommsgType.PURCHASE_ORDER, (byte) 9);
		List bctItems;
		Dochead docHead = null;
		Bcitemlst bctItemlst;
		for (Iterator iterator = narudzbenice.iterator(); iterator.hasNext();) {
			Budcommsg budComMsg = (Budcommsg) iterator.next();
			bctItems = bctItemLstDAO.getBcitemlst(budComMsg.getBcmsgid());
			docHead = docHeadDAO.getDocHeadByPK(budComMsg.getRefdocid());
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				budgetCommitment = new BudgetCommitment();
				budgetCommitment.postaviVrijednosti(budComMsg, bctItems,
						docHead, vendorVeznaDAO, docHeadDAO);
				request.setMessageHeader(messageHeader);
				request.setBudgetCommitment(budgetCommitment);
				try {
					response = port.closePurchaseOrder(request);
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
				} catch (Exception e) {
					if (response == null) {
						response = new PurchaseOrderResponseMsg();
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
						response.setResponseMessageType(ResponseMessageType.ERROR);
						response.setErrorResponse(PomocnaError
								.getErrorResponse("Purchase_order", e));
					}
				}
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				statNotif = new Statnotif();
				//budCom = new Budcom();
				notifHead = new Notifhead();
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"closePurchaseOrder", response.getResponseMessageType());
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "closePurchaseOrder");
				budComMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), response
						.getNotificationResponse());
				// Samo ako response nema error-a
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
				/*	statNotif.postaviVrijednosti(statNotId, resMsg,
							"closePurchaseOrder", response
									.getNotificationResponse()
									.getCommitmentStatus(), response
									.getMessageHeader());
					notifHead.postaviVrijednosti(notHeadId, statNotId, resMsg,
							response.getMessageHeader(), response
									.getNotificationResponse().getHeader(),
							response.getNotificationResponse());
					budCom = budComDAO.getBudcomByPK(budComMsg.getCurlib(),
							budComMsg.getR95upr(), budComMsg.getR95god(),
							budComMsg.getR95rbr());
					budCom.postaviVrijednosti(budComMsg, notHeadId, statNotId,
							response.getNotificationResponse().getHeader(),
							response.getNotificationResponse()
									.getCommitmentStatus(), resMsg);
					docHead.postaviVrijednosti(response
							.getNotificationResponse().getHeader(), response
							.getMessageHeader());*/
				}

				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(budComMsg);
				if (response.getResponseMessageType().equals(
						ResponseMessageType.NOTIFICATION)) {
					/*session.save(statNotif);
					session.save(notifHead);
					session.saveOrUpdate(budCom);
					session.update(docHead);*/
				}
				sessionPomocna.commitTransakcije();
				++reqMsgId;
				++statNotId;
				++notHeadId;
			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod zatvaranja narudzbenice, poruka: "
						+ Integer.toString(budComMsg.getBcmsgid())
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
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(budComMsg, "Pojo_purchase_order_"
								+ Integer.toString(budComMsg.getBcmsgid()));
						debug.ispisUXML(
								statNotif,
								"Pojo_statnotif_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								notifHead,
								"Pojo_notifhead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
					/*	debug.ispisUXML(
								budCom,
								"Pojo_budcom_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								docHead,
								"Pojo_dochead_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));*/

					}
					if (Postavke.DEBUG_PORUKA) {
						debug.ispisUXML(
								request,
								"Message_request_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
						debug.ispisUXML(
								response,
								"Message_response_"
										+ Integer.toString(budComMsg
												.getBcmsgid()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace zatvaranja narudzbenice, poruka: "
									+ Integer.toString(budComMsg.getBcmsgid())
									+ " " + PomocnaError.getErrorMessage(e));
				}
			}

		}

	}
}
