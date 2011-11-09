package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Resmsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import org.apache.commons.lang.math.NumberUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ResmsgDAO extends AbstraktDAO {
	private Session session;

	public ResmsgDAO() {

	}

	public ResmsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public Long getIduciRbrNegativni() {
		try {
			Criteria kriterij = session.createCriteria(Resmsg.class);
			kriterij.setProjection(Projections.min("resmsgid"));
			kriterij.add(Restrictions.le("resmsgid", (long) 0));
			Long iduciRbr = (Long) kriterij.uniqueResult();
			return iduciRbr == null ? -1 : --iduciRbr;

		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}

	}
}