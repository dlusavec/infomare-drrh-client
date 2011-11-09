package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

public class ReqmsgDAO extends AbstraktDAO {
	private Session session;

	public ReqmsgDAO() {

	}

	public ReqmsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public Integer getIduciRbr() {
		try {
			Criteria kriterij = session.createCriteria(Reqmsg.class);
			kriterij.setProjection(Projections.max("reqmsgid"));
			Integer iduciRbr = (Integer) kriterij.uniqueResult();
			return iduciRbr == null ? 1 : ++iduciRbr;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}

	}
}
