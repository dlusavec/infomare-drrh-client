package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Vendormsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class VendormsgDAO extends AbstraktDAO {
	private Session session;

	public VendormsgDAO() {

	}

	public VendormsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getVendormsg(byte opcija) {
		try {
			Criteria kriterij = session.createCriteria(Vendormsg.class);
			kriterij.add(Restrictions.eq("opt", opcija));
			kriterij.add(Restrictions.eq("status", (byte) 1));
			//Za testiranja
			//kriterij.add(Restrictions.le("f41ctr", "1005500"));
			kriterij.addOrder(Order.asc("idVendorm"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
	
	public Vendormsg getVendorByPK(String vendorId) {
		try {
			Criteria kriterij = session.createCriteria(Vendormsg.class);
			kriterij.add(Restrictions.eq("f41ctr", StringUtils.trimToEmpty(vendorId)));
			kriterij.add(Restrictions.eq("status", (byte) 2));
			kriterij.addOrder(Order.desc("idVendorm"));
			List lista=kriterij.list();			
			Vendormsg vendorMsg = (Vendormsg) (lista != null ? lista.get(0) : null);
			return vendorMsg;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}