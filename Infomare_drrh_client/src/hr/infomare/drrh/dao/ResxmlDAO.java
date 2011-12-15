package hr.infomare.drrh.dao;

import hr.infomare.drrh.hibernate.SessionPomocna;
import hr.infomare.drrh.pojo.Resxml;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ResxmlDAO {

	public ResxmlDAO() {

	}

	public static void spremiResponse(Long resMsgId, Object objekt,
			Session session, SessionPomocna sessionPomocna) {
		if (objekt != null && resMsgId != null && resMsgId > 0) {
			try {
				sessionPomocna.otvoriTransakciju();
				Resxml resXML = new Resxml();
				resXML.postaviVrijednosti(resMsgId, objekt);
				session.saveOrUpdate(resXML);
				sessionPomocna.commitTransakcije();
			} catch (HibernateException e) {
				Log.loger.severe(PomocnaError.getErrorMessage(e));
				sessionPomocna.rollbackTransakcije();
			} catch (Exception e) {
				Log.loger.severe(PomocnaError.getErrorMessage(e));
				sessionPomocna.rollbackTransakcije();
			}
		}
	}
}