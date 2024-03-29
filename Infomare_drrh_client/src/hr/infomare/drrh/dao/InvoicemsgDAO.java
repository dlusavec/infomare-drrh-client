package hr.infomare.drrh.dao;

import hr.infomare.drrh.pojo.Invoicemsg;
import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.pomocni.PomocnaError;
import java.util.List;
import org.apache.commons.lang.math.NumberUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class InvoicemsgDAO extends AbstraktDAO {
	private Session session;

	public InvoicemsgDAO() {

	}

	public InvoicemsgDAO(Session session) {
		super.session = session;
		this.session = session;
	}

	public List getInvoicemsgDAO(byte opcija) {
		try {
			Criteria kriterij = session.createCriteria(Invoicemsg.class);
			kriterij.add(Restrictions.eq("opt", opcija));
			kriterij.add(Restrictions.eq("status", (byte) 1));
			kriterij.addOrder(Order.asc("invmsgid"));
			List lista = kriterij.list();
			return lista;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}

	public Invoicemsg getInvoicemsgByDocumentId(String refdocid) {
		try {
			Criteria kriterij = session.createCriteria(Invoicemsg.class);
			kriterij.add(Restrictions.eq("refdocid",
					NumberUtils.toInt(refdocid)));
			kriterij.add(Restrictions.eq("status", (byte) 2));
			kriterij.addOrder(Order.desc("invmsgid"));
			List lista = kriterij.list();
			Invoicemsg invoiceMsg = (lista != null && lista.size() > 0 ? (Invoicemsg) lista
					.get(0) : null);
			return invoiceMsg;
		} catch (HibernateException e) {
			Log.loger.severe(PomocnaError.getErrorMessage(e));
			return null;
		}
	}
}