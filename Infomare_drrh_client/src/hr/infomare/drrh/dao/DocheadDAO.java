package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Dochead;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DocheadDAO extends AbstraktDAO {
	private Session session;

	public DocheadDAO() {

	}

	public DocheadDAO(Session session) {
		super.session = session;
		this.session = session;
	}
	// Ne koristi se
	public List getDocHead(Integer bufmisdoc) {
		try {
			Criteria kriterij = session.createCriteria(Dochead.class);
			kriterij.add(Restrictions.eq("bufmisdoc", bufmisdoc));						
			List lista = kriterij.list();			
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
	public Dochead getDocHeadByPK(Integer bufMisDoc) {
		try {
			Criteria kriterij = session.createCriteria(Dochead.class);
			kriterij.add(Restrictions.eq("bufmisdoc", bufMisDoc));											
			return (Dochead) kriterij.uniqueResult();
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
