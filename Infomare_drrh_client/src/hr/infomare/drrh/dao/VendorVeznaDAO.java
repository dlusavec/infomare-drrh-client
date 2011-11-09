package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.VendorVezna;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class VendorVeznaDAO extends AbstraktDAO {
	private Session session;

	public VendorVeznaDAO() {

	}

	public VendorVeznaDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public VendorVezna getVendorVeznaByPK(String f41ctr) {
		try {
			Criteria kriterij = session.createCriteria(VendorVezna.class);
			kriterij.add(Restrictions.eq("f41ctr", f41ctr));
			return (VendorVezna) kriterij.uniqueResult();
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}

	}
}