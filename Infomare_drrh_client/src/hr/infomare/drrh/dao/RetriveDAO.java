package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Retrive;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class RetriveDAO extends AbstraktDAO {
	private Session session;

	public RetriveDAO() {

	}

	public RetriveDAO(Session session) {
		super.session = session;
		this.session = session;
	}
	
	public Retrive getRetrive() {
		try {
			Criteria kriterij = session.createCriteria(Retrive.class);			
			kriterij.addOrder(Order.desc("zero"));
			List lista=kriterij.list();			
			Retrive retrive = (lista.size()>0 ? (Retrive) lista.get(0) : null);
			return retrive;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}
