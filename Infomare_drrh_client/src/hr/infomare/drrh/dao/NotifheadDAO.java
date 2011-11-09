package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Notifhead;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class NotifheadDAO extends AbstraktDAO {
	private Session session;

	public NotifheadDAO() {

	}

	public NotifheadDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getNotifhead(int notheadid) {
		try {
			Criteria kriterij = session.createCriteria(Notifhead.class);
			kriterij.add(Restrictions.eq("notheadid", notheadid));					
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
	public Integer getIduciRbr() {
		try {
			Criteria kriterij = session.createCriteria(Notifhead.class);
			kriterij.setProjection(Projections.max("notheadid"));
			Integer iduciRbr = (Integer) kriterij.uniqueResult();
			return iduciRbr == null ? 1 : ++iduciRbr;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}

	}
}
