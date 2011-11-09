package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Invoice;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class InvoiceDAO extends AbstraktDAO {
	private Session session;

	public InvoiceDAO() {

	}

	public InvoiceDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getInvoice(String f17upr, int f17god, String f17vpr, int f17rbr, int f17dod) {
		try {
			Criteria kriterij = session.createCriteria(Invoice.class);
			kriterij.add(Restrictions.eq("f17upr", f17upr));
			kriterij.add(Restrictions.eq("f17god", f17god));
			kriterij.add(Restrictions.eq("f17vpr", f17vpr));
			kriterij.add(Restrictions.eq("f17rbr", f17rbr));
			kriterij.add(Restrictions.eq("f17dod", f17dod));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}

	public Invoice getInvoiceByPK(String f17upr, int f17god, String f17vpr, int f17rbr, int f17dod) {
		try {
			Criteria kriterij = session.createCriteria(Invoice.class);
			kriterij.add(Restrictions.eq("f17upr", f17upr));
			kriterij.add(Restrictions.eq("f17god", f17god));
			kriterij.add(Restrictions.eq("f17vpr", f17vpr));
			kriterij.add(Restrictions.eq("f17rbr", f17rbr));
			kriterij.add(Restrictions.eq("f17dod", f17dod));		
			return (Invoice) kriterij.uniqueResult();
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}	
	
}