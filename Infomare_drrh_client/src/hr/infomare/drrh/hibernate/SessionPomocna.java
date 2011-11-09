package hr.infomare.drrh.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionPomocna {
	private Session session;

	public SessionPomocna() {
		otvoriSession();
	}

	public void otvoriSession() {
		session = HibernatePomocna.getSessionFactory().openSession();
	}

	public void zatvoriSession(Session session) {
		if (session != null) {
			session.close();
			session = null;
		}
	}

	public Session getSession() {
		return session;
	}

	public Transaction otvoriTransakciju() {
		return session.beginTransaction();
	}

	public void commitTransakcije() throws Exception {
		if (session.getTransaction().isActive()) {
			try {
				session.flush();
				session.getTransaction().commit();
			} catch (HibernateException e) {
				throw e;
			} finally {
				session.clear();
			}
		}
	}

	public void rollbackTransakcije() {
		session.clear();
		if (session.getTransaction().isActive()) {
			try {
				session.getTransaction().rollback();
			} catch (HibernateException e) {

			}
		}
	}

}
