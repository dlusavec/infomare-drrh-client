package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Venbanaccm;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class VenbanaccmDAO extends AbstraktDAO {
	private Session session;

	public VenbanaccmDAO() {

	}

	public VenbanaccmDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getVenbanaccm(byte opcija, String f46f41) {
		try {
			Criteria kriterij = session.createCriteria(Venbanaccm.class);
			kriterij.add(Restrictions.eq("opt", opcija));
			kriterij.add(Restrictions.eq("status", (byte) 1));
			if (StringUtils.isNotBlank(f46f41)) {
				kriterij.add(Restrictions.eq("f46f41", f46f41));
			}
			kriterij.addOrder(Order.asc("idVebaacm"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}

	public List getVenBanAccMByVendorAndRequest(String vendorId,
			Integer reqMsgId) {
		try {
			Criteria kriterij = session.createCriteria(Venbanaccm.class);
			kriterij.add(Restrictions.eq("f46f41",
					StringUtils.trimToEmpty(vendorId)));
			if (reqMsgId != null) {
				kriterij.add(Restrictions.eq("reqmsg.reqmsgid", reqMsgId));
			}
			kriterij.add(Restrictions.eq("status", (byte) 2));
			kriterij.addOrder(Order.desc("idVebaacm"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}