package budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import hr.infomare.drrh.dao.ReqmsgDAO;
import hr.infomare.drrh.dao.ResxmlDAO;
import hr.infomare.drrh.dao.VenbanaccmDAO;
import hr.infomare.drrh.dao.VendorVeznaDAO;
import hr.infomare.drrh.dao.VendormsgDAO;
import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pojo.Resmsg;
import hr.infomare.drrh.pojo.Venbanaccm;
import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pojo.Vendormsg;
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

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.hibernate.Session;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Vendor;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.VendorAccountData;
import budgetuserlibrary.gw.fmis.ibm.hr.interfaces.vendormanagementinterface.binding.VendorManagementInterfaceExportVendorManagementInterfaceHttpService;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountCreationRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountResponseMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorChangeRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorCreationRequestMsg;
import budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorResponseMsg;

/**
 * This class was generated by Apache CXF 2.4.0 2011-06-20T14:59:33.296+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class VendorManagementInterfaceClientImpl {

	private QName SERVICE_NAME;
	private URL wsdlURL;
	private VendorManagementInterfaceExportVendorManagementInterfaceHttpService servis;
	private VendorManagementInterface port;
	private SessionPomocna sessionPomocna;
	private Session session;
	private VendormsgDAO vendorMsgDAO;
	private VenbanaccmDAO venBanAccMDAO;
	private ReqmsgDAO reqMsgDAO;
	private VendorVeznaDAO vendorVeznaDAO;
	private Debug debugVendor = new Debug("Vendor");
	private Debug debugVenBanAcc = new Debug("VEN_ACC");

	public VendorManagementInterfaceClientImpl() {
	}

	public void razmjenaPartnera() {
		try {
			Log.loger.info("Po�etak razmjene partnera.");
			SERVICE_NAME = new QName(
					VendorManagementInterfaceExportVendorManagementInterfaceHttpService.TARGET_NAMESPACE,
					VendorManagementInterfaceExportVendorManagementInterfaceHttpService.SERVIS);
			otvoriPortISesiju();
			createVendor();
			// changeVendor();
			// addNewBankAccount();
			Log.loger.info("Zavr�etak razmjene partnera.");
		} catch (Exception e) {
			Log.loger.severe("Gre�ka kod razmjene partnera "
					+ PomocnaError.getErrorMessage(e));
		}
	}

	private void otvoriPortISesiju() {
		wsdlURL = VendorManagementInterfaceExportVendorManagementInterfaceHttpService.WSDL_LOCATION;
		servis = new VendorManagementInterfaceExportVendorManagementInterfaceHttpService(
				wsdlURL, SERVICE_NAME);
		port = servis
				.getVendorManagementInterfaceExportVendorManagementInterfaceHttpPort();
		sessionPomocna = new SessionPomocna();
		session = sessionPomocna.getSession();
		vendorMsgDAO = new VendormsgDAO(session);
		venBanAccMDAO = new VenbanaccmDAO(session);
		reqMsgDAO = new ReqmsgDAO(session);
		vendorVeznaDAO = new VendorVeznaDAO(session);

	}

	private void createVendor() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		VendorCreationRequestMsg request = new VendorCreationRequestMsg();
		MessageHeader messageHeader;
		Vendor vendor;
		VendorVezna vendorVezna;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		VendorResponseMsg response = null;
		Venbanaccm venBanAccM;
		List vendori = vendorMsgDAO.getVendormsg((byte) 1);
		List<Venbanaccm> venBanAccounti = null;
		for (Iterator iterator = vendori.iterator(); iterator.hasNext();) {
			Vendormsg vendorMsg = (Vendormsg) iterator.next();
			try {
				venBanAccounti = venBanAccMDAO.getVenbanaccm((byte) 1,
						vendorMsg.getF41ctr());
				// Partneri bez ziro racuna se ne salju
				if (venBanAccounti != null && venBanAccounti.size() > 0) {
					sessionPomocna.otvoriTransakciju();
					// Request
					messageHeader = new MessageHeader();
					vendor = new Vendor();
					vendor.postaviVrijednosti(vendorMsg, venBanAccounti, null);
					request.setMessageHeader(messageHeader);
					request.setVendor(vendor);
					// Response
					resMsg = new Resmsg();
					reqMsg = new Reqmsg();
					vendorVezna = new VendorVezna();

					/*Client client = ClientProxy.getClient(port);
					client.getInInterceptors().add(new LoggingInInterceptor());
					client.getOutInterceptors()
							.add(new LoggingOutInterceptor());
					Thread.sleep(5000);*/

					try {
						response = port.createVendor(request);
						if (response.getResponseMessageType().equals(
								ResponseMessageType.ERROR)) {
							response.setMessageHeader(Pomocna
									.getNewMessageHeader(session));
						}
					} catch (Exception e) {
						if (response == null) {
							response = new VendorResponseMsg();
							response.setMessageHeader(Pomocna
									.getNewMessageHeader(session));
							response.setResponseMessageType(ResponseMessageType.ERROR);
							response.setErrorResponse(PomocnaError
									.getErrorResponse("Vendor", e));
						}
					}
					resMsg.postaviVrijednosti(response.getMessageHeader(),
							"createVendor", response.getResponseMessageType());
					reqMsg.postaviVrijednosti(response.getMessageHeader(),
							reqMsgId, "createVendor");
					vendorMsg.postaviVrijednosti(Pomocna.getStatus(response
							.getResponseMessageType()), reqMsg, PomocnaDatum
							.XMLDatumUDate(response.getMessageHeader()
									.getSubmitionTimestamp()), response);

					// Upis u bazu
					if (response.getResponseMessageType().equals(
							ResponseMessageType.NOTIFICATION)) {
						vendorVezna.postaviVrijednosti(reqMsg, PomocnaDatum
								.XMLDatumUDate(response.getMessageHeader()
										.getSubmitionTimestamp()), response
								.getVendor(), vendorMsg);
						session.save(vendorVezna);
					}
					session.save(resMsg);
					Pomocna.obradaGresaka(session, response.getErrorResponse(),
							response.getMessageHeader());
					session.save(reqMsg);
					session.update(vendorMsg);
					for (Iterator iteratorAccounti = venBanAccounti.iterator(); iteratorAccounti
							.hasNext();) {
						venBanAccM = (Venbanaccm) iteratorAccounti.next();
						venBanAccM.postaviVrijednosti(Pomocna
								.getStatus(response.getResponseMessageType()),
								reqMsg, PomocnaDatum.XMLDatumUDate(response
										.getMessageHeader()
										.getSubmitionTimestamp()));
						session.update(venBanAccM);
					}
					sessionPomocna.commitTransakcije();
					++reqMsgId;
				}

			} catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger
						.severe("Gre�ka kod kreiranja novog partnera, poruka: "
								+ Integer.toString(vendorMsg.getIdVendorm())
								+ PomocnaError.getErrorMessage(e));
			} finally {
				if (venBanAccounti != null && venBanAccounti.size() > 0) {
					try {
						ResxmlDAO.spremiResponse(response.getMessageHeader()
								.getResponseMsgId(), response, session,
								sessionPomocna);
						if (Postavke.DEBUG_POJO) {
							debugVendor.ispisUXML(
									resMsg,
									"Pojo_response_"
											+ Integer.toString(vendorMsg
													.getIdVendorm()));
							debugVendor.ispisUXML(
									reqMsg,
									"Pojo_request_"
											+ Integer.toString(vendorMsg
													.getIdVendorm()));
							debugVendor.ispisUXML(
									vendorMsg,
									"Pojo_vendor_"
											+ Integer.toString(vendorMsg
													.getIdVendorm()));
						}
						if (Postavke.DEBUG_PORUKA) {
							debugVendor.ispisUXML(
									request,
									"Message_request_"
											+ Integer.toString(vendorMsg
													.getIdVendorm()));
							debugVendor.ispisUXML(
									response,
									"Message_response_"
											+ Integer.toString(vendorMsg
													.getIdVendorm()));
						}
					} catch (Exception e) {
						Log.loger
								.severe("Gre�ka kod xml trace novog partnera, poruka: "
										+ Integer.toString(vendorMsg
												.getIdVendorm())
										+ PomocnaError.getErrorMessage(e));

					}
				}

			}
		}
	}

	private void changeVendor() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		VendorChangeRequestMsg request = new VendorChangeRequestMsg();
		MessageHeader messageHeader;
		Vendor vendor;
		VendorVezna vendorVezna;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		VendorResponseMsg response = null;
		List vendori = vendorMsgDAO.getVendormsg((byte) 2);
		for (Iterator iterator = vendori.iterator(); iterator.hasNext();) {
			Vendormsg vendorMsg = (Vendormsg) iterator.next();
			try {
				sessionPomocna.otvoriTransakciju();
				// Request
				messageHeader = new MessageHeader();
				vendor = new Vendor();
				vendorVezna = vendorVeznaDAO.getVendorVeznaByPK(vendorMsg
						.getF41ctr());
				vendor.postaviVrijednosti(vendorMsg, null, vendorVezna);
				request.setMessageHeader(messageHeader);
				request.setVendor(vendor);
				// Response
				resMsg = new Resmsg();
				reqMsg = new Reqmsg();
				try {
					response = port.changeVendor(request);
					if (response.getResponseMessageType().equals(
							ResponseMessageType.ERROR)) {
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
					}
				} catch (Exception e) {
					if (response == null) {
						response = new VendorResponseMsg();
						response.setMessageHeader(Pomocna
								.getNewMessageHeader(session));
						response.setResponseMessageType(ResponseMessageType.ERROR);
						response.setErrorResponse(PomocnaError
								.getErrorResponse("Vendor", e));
					}
				}
				resMsg.postaviVrijednosti(response.getMessageHeader(),
						"changeVendor", response.getResponseMessageType());
				reqMsg.postaviVrijednosti(response.getMessageHeader(),
						reqMsgId, "changeVendor");
				vendorMsg.postaviVrijednosti(Pomocna.getStatus(response
						.getResponseMessageType()), reqMsg, PomocnaDatum
						.XMLDatumUDate(response.getMessageHeader()
								.getSubmitionTimestamp()), null);
				// Upis u bazu
				session.save(resMsg);
				Pomocna.obradaGresaka(session, response.getErrorResponse(),
						response.getMessageHeader());
				session.save(reqMsg);
				session.update(vendorMsg);
				sessionPomocna.commitTransakcije();
				++reqMsgId;
			}

			catch (Exception e) {
				sessionPomocna.rollbackTransakcije();
				Log.loger.severe("Gre�ka kod izmjene partnera, poruka: "
						+ Integer.toString(vendorMsg.getIdVendorm())
						+ PomocnaError.getErrorMessage(e));

			} finally {
				try {
					ResxmlDAO.spremiResponse(response.getMessageHeader()
							.getResponseMsgId(), response, session,
							sessionPomocna);
					if (Postavke.DEBUG_POJO) {
						debugVendor.ispisUXML(resMsg, "Pojo_response_"
								+ Integer.toString(vendorMsg.getIdVendorm()));
						debugVendor.ispisUXML(
								reqMsg,
								"Pojo_request_"
										+ Integer.toString(vendorMsg
												.getIdVendorm()));
						debugVendor.ispisUXML(vendorMsg, "Pojo_vendor_"
								+ Integer.toString(vendorMsg.getIdVendorm()));
					}
					if (Postavke.DEBUG_PORUKA) {
						debugVendor.ispisUXML(request, "Message_request_"
								+ Integer.toString(vendorMsg.getIdVendorm()));
						debugVendor.ispisUXML(response, "Message_response_"
								+ Integer.toString(vendorMsg.getIdVendorm()));
					}
				} catch (Exception e) {
					Log.loger
							.severe("Gre�ka kod xml trace izmjene partnera, poruka: "
									+ Integer.toString(vendorMsg.getIdVendorm())
									+ PomocnaError.getErrorMessage(e));
				}
			}

		}

	}

	/*
	 * Ne koristi se private void deactivateVendor() { Integer reqMsgId =
	 * reqMsgDAO.getIduciRbr(); VendorDeactivationRequestMsg request = new
	 * VendorDeactivationRequestMsg(); MessageHeader messageHeader; Vendor
	 * vendor; Reqmsg reqMsg; Resmsg resMsg; List vendori =
	 * vendorMsgDAO.getVendormsg((byte) 9); for (Iterator iterator =
	 * vendori.iterator(); iterator.hasNext();) { Vendormsg vendorMsg =
	 * (Vendormsg) iterator.next(); try { sessionPomocna.otvoriTransakciju(); //
	 * Request messageHeader = new MessageHeader(); vendor = new Vendor();
	 * vendor.postaviVrijednosti(vendorMsg, null, null);
	 * request.setMessageHeader(messageHeader); request.setVendor(vendor); //
	 * Response resMsg = new Resmsg(); reqMsg = new Reqmsg(); VendorResponseMsg
	 * response = port.deactivateVendor(request);
	 * resMsg.postaviVrijednosti(response.getMessageHeader(),
	 * "deactivateVendor", response.getResponseMessageType());
	 * reqMsg.postaviVrijednosti(response.getMessageHeader(), reqMsgId,
	 * "deactivateVendor");
	 * vendorMsg.postaviVrijednosti(Pomocna.getStatus(response
	 * .getResponseMessageType()), reqMsg, DatumPomocna
	 * .XMLDatumUDate(response.getMessageHeader() .getSubmitionTimestamp()),
	 * null); // Upis u bazu session.save(resMsg);
	 * Pomocna.obradaGresaka(session, response.getErrorResponse(),
	 * response.getMessageHeader()); session.save(reqMsg);
	 * session.update(vendorMsg); sessionPomocna.commitTransakcije();
	 * ++reqMsgId; }
	 * 
	 * catch (Exception e) { sessionPomocna.rollbackTransakcije();
	 * Log.loger.severe("Gre�ka kod deaktivacije partnera, poruka: " +
	 * Integer.toString(vendorMsg.getIdVendorm()) + " " + e.getMessage());
	 * 
	 * } }
	 * 
	 * }
	 */

	// Nije implementirano
	/*
	 * private void retriveVendor() {
	 * budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorRetrieveRequestMsg
	 * _retrieveVendor_vendorRetrieveRequestMsg = null;
	 * budgetuserlibrary.gw.fmis.ibm.hr.messages.VendorRetrieveResponseMsg
	 * _retrieveVendor__return = port
	 * .retrieveVendor(_retrieveVendor_vendorRetrieveRequestMsg);
	 * 
	 * }
	 */

	private void addNewBankAccount() {
		Integer reqMsgId = reqMsgDAO.getIduciRbr();
		BankAccountCreationRequestMsg request = new BankAccountCreationRequestMsg();
		MessageHeader messageHeader;
		Vendor vendor;
		VendorVezna vendorVezna;
		Reqmsg reqMsg = null;
		Resmsg resMsg = null;
		BankAccountResponseMsg response = null;
		VendorAccountData vendorAccountData;
		List accounti = venBanAccMDAO.getVenbanaccm((byte) 1, null);
		for (Iterator iterator = accounti.iterator(); iterator.hasNext();) {
			Venbanaccm venBanAccM = (Venbanaccm) iterator.next();
			vendorVezna = vendorVeznaDAO.getVendorVeznaByPK(venBanAccM
					.getF46f41());
			if (vendorVezna != null
					&& StringUtils.isNotBlank(vendorVezna.getF41svi())) {
				try {
					sessionPomocna.otvoriTransakciju();
					// Request
					messageHeader = new MessageHeader();
					vendor = new Vendor();
					vendorAccountData = new VendorAccountData();
					vendor.setLogicalSystemName(Postavke.LOGICAL_SYSTEM_NAME);
					vendor.setLogicalSystemVendorID(venBanAccM.getF46f41());
					vendorAccountData.postaviVrijednosti(venBanAccM);
					request.setMessageHeader(messageHeader);
					request.setVendorAccountData(vendorAccountData);
					request.setVendor(vendor);
					// Response
					resMsg = new Resmsg();
					reqMsg = new Reqmsg();
					try {
						response = port.addNewBankAccount(request);
						if (response.getResponseMessageType().equals(
								ResponseMessageType.ERROR)) {
							response.setMessageHeader(Pomocna
									.getNewMessageHeader(session));
						}
					} catch (Exception e) {
						if (response == null) {
							response = new BankAccountResponseMsg();
							response.setMessageHeader(Pomocna
									.getNewMessageHeader(session));
							response.setResponseMessageType(ResponseMessageType.ERROR);
							response.setErrorResponse(PomocnaError
									.getErrorResponse("VEN_BANK_ACC", e));
						}
					}
					resMsg.postaviVrijednosti(response.getMessageHeader(),
							"addNewBankAccount",
							response.getResponseMessageType());
					reqMsg.postaviVrijednosti(response.getMessageHeader(),
							reqMsgId, "addNewBankAccount");
					venBanAccM.postaviVrijednosti(Pomocna.getStatus(response
							.getResponseMessageType()), reqMsg, PomocnaDatum
							.XMLDatumUDate(response.getMessageHeader()
									.getSubmitionTimestamp()));
					// Upis u bazu
					session.save(resMsg);
					Pomocna.obradaGresaka(session, response.getErrorResponse(),
							response.getMessageHeader());
					session.save(reqMsg);
					session.update(venBanAccM);
					sessionPomocna.commitTransakcije();

					++reqMsgId;
				}

				catch (Exception e) {
					sessionPomocna.rollbackTransakcije();
					Log.loger.severe("Gre�ka kod upis �iro-ra�una, poruka: "
							+ Integer.toString(venBanAccM.getIdVebaacm()) + " "
							+ PomocnaError.getErrorMessage(e));

				} finally {
					try {
						ResxmlDAO.spremiResponse(response.getMessageHeader()
								.getResponseMsgId(), response, session,
								sessionPomocna);
						if (Postavke.DEBUG_POJO) {
							debugVenBanAcc.ispisUXML(
									resMsg,
									"Pojo_response_"
											+ Integer.toString(venBanAccM
													.getIdVebaacm()));
							debugVenBanAcc.ispisUXML(
									reqMsg,
									"Pojo_request_"
											+ Integer.toString(venBanAccM
													.getIdVebaacm()));
							debugVenBanAcc.ispisUXML(
									venBanAccM,
									"Pojo_vendor_account_"
											+ Integer.toString(venBanAccM
													.getIdVebaacm()));
						}
						if (Postavke.DEBUG_PORUKA) {
							debugVenBanAcc.ispisUXML(
									request,
									"Message_request_"
											+ Integer.toString(venBanAccM
													.getIdVebaacm()));
							debugVenBanAcc.ispisUXML(
									response,
									"Message_response_"
											+ Integer.toString(venBanAccM
													.getIdVebaacm()));
						}
					} catch (Exception e) {
						Log.loger
								.severe("Gre�ka kod xml trace upisa �iro-ra�una, poruka: "
										+ Integer.toString(venBanAccM
												.getIdVebaacm())
										+ " "
										+ PomocnaError.getErrorMessage(e));
					}
				}
			}
		}

	}

	/*
	 * Nije implementirano private void deactivateBankAccount() {
	 * budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountDeactivateRequestMsg
	 * _deactivateBankAccount_bankAccountDeactivateRequestMsg = null;
	 * budgetuserlibrary.gw.fmis.ibm.hr.messages.BankAccountResponseMsg
	 * _deactivateBankAccount__return = port
	 * .deactivateBankAccount(_deactivateBankAccount_bankAccountDeactivateRequestMsg
	 * );
	 * 
	 * }
	 */

}
