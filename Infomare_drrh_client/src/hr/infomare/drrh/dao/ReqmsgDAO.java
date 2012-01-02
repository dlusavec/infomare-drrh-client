package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Reqmsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
	
	public Reqmsg getReqMsgByPK(Integer reqmsgid) {
		try {
			Criteria kriterij = session.createCriteria(Reqmsg.class);
			kriterij.add(Restrictions.eq("reqmsgid", reqmsgid));						
			List lista=kriterij.list();			
			Reqmsg reqMsg = (lista != null && lista.size()>0 ? (Reqmsg) lista.get(0) : null);
			return reqMsg;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
