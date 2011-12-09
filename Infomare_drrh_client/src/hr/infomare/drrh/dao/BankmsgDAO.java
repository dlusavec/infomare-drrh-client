package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Bankmsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class BankmsgDAO extends AbstraktDAO {
	private Session session;

	public BankmsgDAO() {

	}

	public BankmsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getBankmsg(byte opcija) {
		try {
			Criteria kriterij = session.createCriteria(Bankmsg.class);
			kriterij.add(Restrictions.eq("opt", opcija));
			kriterij.add(Restrictions.eq("status", (byte) 1));
			kriterij.addOrder(Order.asc("idBankmsg"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
	public Bankmsg getBankByPK(String vbdi) {
		try {
			Criteria kriterij = session.createCriteria(Bankmsg.class);
			kriterij.add(Restrictions.eq("vbdi", StringUtils.trimToEmpty(vbdi)));
			kriterij.add(Restrictions.eq("status", (byte) 2));
			kriterij.addOrder(Order.desc("idBankmsg"));
			List lista=kriterij.list();			
			Bankmsg bankMsg = (Bankmsg) (lista != null ? lista.get(0) : null);
			return bankMsg;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
