package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Payexec;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import org.apache.commons.lang.math.NumberUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class PayexecDAO extends AbstraktDAO {
	private Session session;

	public PayexecDAO() {

	}

	public PayexecDAO(Session session) {
		super.session = session;
		this.session = session;
	}
	
	public Payexec getPayexecByPK(String bufmisdoc) {
		try {
			Criteria kriterij = session.createCriteria(Payexec.class);
			kriterij.add(Restrictions.eq("bufmisdoc", NumberUtils.toInt(bufmisdoc)));						
			return (Payexec) kriterij.uniqueResult();
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}	
	
}