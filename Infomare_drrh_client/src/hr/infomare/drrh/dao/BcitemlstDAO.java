package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Bcitemlst;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class BcitemlstDAO extends AbstraktDAO {
	private Session session;

	public BcitemlstDAO() {

	}

	public BcitemlstDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getBcitemlst(Integer bcmsgid) {
		try {
			Criteria kriterij = session.createCriteria(Bcitemlst.class);
			kriterij.add(Restrictions.eq("bcmsgid", bcmsgid));			
			kriterij.addOrder(Order.asc("bcitemid"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
