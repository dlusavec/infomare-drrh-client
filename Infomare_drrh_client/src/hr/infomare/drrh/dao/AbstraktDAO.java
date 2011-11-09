package hr.infomare.drrh.dao;

import hr.infomare.drrh.hibernate.HibernatePomocna;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;

public class AbstraktDAO {

	protected Session session ;
	private Transaction tx;

	public AbstraktDAO() {
	}

	public AbstraktDAO(Session session) {
		this.session = session;
	}

	/*
	 * Insert sloga
	 */
	/*public void upis(Object object) throws Exception {
		try {
			tx = session.beginTransaction();
			session.save(object);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception(e.getMessage());
		} finally {
			session.clear();
		}
	}*/

	/*
	 * Update sloga
	 */
	/*public void izmjena(Object object) throws Exception {
		try {
			tx = session.beginTransaction();
			session.update(object);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception(e.getMessage());
		} finally {
			session.clear();
		}
	}*/

	/*
	 * Insert/Update sloga, prvo ide select ako select vrati null ide insert
	 */
	/*public void upisIliIzmjena(Object object) throws Exception {
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(object);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception(e.getMessage());
		} finally {
			session.clear();
		}
	}*/

	/*
	 * Delete sloga
	 */
/*	public void brisi(Object object) throws Exception {
		try {
			tx = session.beginTransaction();
			session.delete(object);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			session.clear();
			tx.rollback();
			throw new Exception(e.getMessage());
		}
	}*/

	/*
	 * Vrati jedan slog, PK je numeric
	 */
	/*public Object traziPoPK(Class theClass, int value) throws Exception {
		Object object = null;
		Query query = null;
		String column = HibernatePomocna.getIdKlase(theClass.getName());
		try {
			tx = session.beginTransaction();
			query = session.createQuery(" from " + theClass.getName()
					+ " as a where " + "a." + column + "=" + ":" + column);
			query.setParameter(column, value);
			object = query.uniqueResult();
			tx.commit();
			return object;
		} catch (Exception e) {
			session.clear();
			tx.rollback();
			throw new Exception(e.getMessage());
		}
	}*/

	/*
	 * MAX+1 numeric kolone
	 */
	/*public int getIduciId(Class theClass) throws Exception {
		int nextId = 0;
		Query query = null;
		String id = HibernatePomocna.getIdKlase(theClass.getName());
		try {
			tx = session.beginTransaction();
			query = session.createQuery("SELECT MAX" + "(" + id + ")"
					+ " FROM " + theClass.getName());
			nextId = Integer.parseInt((query.uniqueResult()).toString());
			tx.commit();
			return ++nextId;
		} catch (Exception e) {
			session.clear();
			tx.rollback();
			throw new Exception(e.getMessage());
		}
	}*/

	/*public Transaction otvoriTransakciju(Session session) {
		return session.beginTransaction();
	}

	public void zavrsiTransakciju(Session session, Transaction tx) {
		tx.commit();
		session.clear();
	}

	public void rollbackTransakcije(Session session, Transaction tx) {
		session.clear();
		tx.rollback();
	}*/
}
