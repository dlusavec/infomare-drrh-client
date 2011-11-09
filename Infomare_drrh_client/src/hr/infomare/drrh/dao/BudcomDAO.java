package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Budcom;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class BudcomDAO extends AbstraktDAO {
	private Session session;

	public BudcomDAO() {

	}

	public BudcomDAO(Session session) {
		super.session = session;
		this.session = session;
	}
	// Ne koristi se 
	public List getBudcom(String curlib, String r95upr, int r95god, int r95rbr) {
		try {
			Criteria kriterij = session.createCriteria(Budcom.class);
			kriterij.add(Restrictions.eq("curlib", curlib));
			kriterij.add(Restrictions.eq("r95upr", r95upr));
			kriterij.add(Restrictions.eq("r95god", r95god));
			kriterij.add(Restrictions.eq("r95rbr", r95rbr));						
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
	
	public Budcom getBudcomByPK(String curlib, String r95upr, int r95god, int r95rbr) {
		try {
			Criteria kriterij = session.createCriteria(Budcom.class);
			kriterij.add(Restrictions.eq("curlib", curlib));
			kriterij.add(Restrictions.eq("r95upr", r95upr));
			kriterij.add(Restrictions.eq("r95god", r95god));
			kriterij.add(Restrictions.eq("r95rbr", r95rbr));									
			return  (Budcom) kriterij.uniqueResult();
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}	
}