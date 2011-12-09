package hr.infomare.drrh.pomocni;

import hr.infomare.drrh.dao.ResmsgDAO;
import hr.infomare.drrh.pojo.Errormsg;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;

import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.Error;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ErrorResponse;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.MessageHeader;
import budgetuserlibrary.gw.fmis.ibm.hr.infotypes.ResponseMessageType;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Pomocna {

	public static byte getStatus(ResponseMessageType responseMessageType) {		
		return (byte) (responseMessageType
				.equals(ResponseMessageType.NOTIFICATION) ? 2 : 9);
	}
	
	public static byte getStatusRetrieve(ResponseMessageType responseMessageType) {		
		return (byte) (responseMessageType
				.equals(ResponseMessageType.NOTIFICATION) ? 3 : 9);
	}

	public static void obradaGresaka(Session session,
			ErrorResponse errorResponse, MessageHeader messageHeader) {
		if (errorResponse != null && errorResponse.getError().size() > 0) {
			Integer errorId = 0;
			List lista = errorResponse.getError();
			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				Error error = (Error) iterator.next();
					// TEHNIKA_JE_ZAKAZALA je nasa greska obradjuje se drugdje			
					Errormsg errorRes = new Errormsg();
					errorRes.setResmesid(messageHeader.getResponseMsgId());
					errorRes.setErrorid(++errorId);
					errorRes.setTarget(StringUtils.left(StringUtils.trimToNull(error.getTarget()),500));
					errorRes.setValue(StringUtils.left(StringUtils.defaultString(error.getValue()),500));
					errorRes.setErrorcode(StringUtils.leftPad(StringUtils.trimToNull(error.getErrorCode()),120));
					errorRes.setDescriptio(StringUtils.trimToNull(error.getDescription()));
					errorRes.setSubmdati(PomocnaDatum
							.XMLDatumUDate(messageHeader
									.getSubmitionTimestamp()));
					session.save(errorRes);
				}			
		}
	}

	public static String objektUXMLString(Object objekt) {
		XStream xStream = new XStream(new DomDriver());
		return xStream.toXML(objekt);
	}

	/*
	 * Koristi se samo ako se desi greska pri razmjeni poruka bez povratne
	 * poruke
	 */
	public static MessageHeader getNewMessageHeader(Session session) {
		ResmsgDAO resMsgDAO = new ResmsgDAO(session);
		Long resMsgid = resMsgDAO.getIduciRbrNegativni();
		MessageHeader messageHeader = new MessageHeader();		
		messageHeader.setResponseMsgId(resMsgid);		
		return messageHeader;
	}
}
