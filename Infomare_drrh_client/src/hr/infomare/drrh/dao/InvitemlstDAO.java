package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Invitemlst;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class InvitemlstDAO extends AbstraktDAO {
	private Session session;

	public InvitemlstDAO() {

	}

	public InvitemlstDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getInvItemLst(Integer bcmsgid) {
		try {
			Criteria kriterij = session.createCriteria(Invitemlst.class);
			kriterij.add(Restrictions.eq("invmsgid", bcmsgid));			
			kriterij.addOrder(Order.asc("invitemid"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
