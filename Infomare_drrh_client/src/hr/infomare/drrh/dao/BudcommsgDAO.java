package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Budcommsg;
import hr.infomare.drrh.pomocni.BudcommsgType;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class BudcommsgDAO extends AbstraktDAO {
	private Session session;

	public BudcommsgDAO() {

	}

	public BudcommsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getBudcommsg(BudcommsgType typeres, byte opcija) {
		try {
			Criteria kriterij = session.createCriteria(Budcommsg.class);			
			kriterij.add(Restrictions.eq("typeres", typeres.getValue()));			
			kriterij.add(Restrictions.eq("opt", opcija));
			kriterij.add(Restrictions.eq("status", (byte) 1));
			kriterij.addOrder(Order.asc("bcmsgid"));			
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
