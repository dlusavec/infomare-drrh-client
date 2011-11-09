package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Statnotif;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

public class StatnotifDAO extends AbstraktDAO {
	private Session session;

	public StatnotifDAO() {

	}

	public StatnotifDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public Integer getIduciRbr() {
		try {
			Criteria kriterij = session.createCriteria(Statnotif.class);
			kriterij.setProjection(Projections.max("statnotid"));
			Integer iduciRbr = (Integer) kriterij.uniqueResult();
			return iduciRbr == null ? 1 : ++iduciRbr;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}

	}
}
