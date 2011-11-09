package hr.infomare.drrh.hibernate;

import hr.infomare.drrh.pomocni.Log;
import hr.infomare.drrh.postavke.Postavke;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernatePomocna {

	private static SessionFactory sessionFactory;
	private static Properties hibernateProperties;
	private static AnnotationConfiguration config;

	public static void buildSessionFactory() {
		try {
			if (sessionFactory == null) {
				setConfiguration();
				setProperties();
				sessionFactory = config.setProperties(hibernateProperties)
						.buildSessionFactory();
				Log.loger.info("Hibernate pokrenut.");
			}
		} catch (Exception e) {
			Log.loger.severe("Greška kod pokretanja hibernata ! "
					+ e.getMessage());
			System.exit(0);
		}
	}

	private static void setProperties() {
		if (hibernateProperties == null) {
			hibernateProperties = new Properties();
		}
		hibernateProperties.setProperty("hibernate.dialect",
				"org.hibernate.dialect.DB2400Dialect");
		hibernateProperties.setProperty("hibernate.connection.driver_class",
				"com.ibm.as400.access.AS400JDBCDriver");
		hibernateProperties.setProperty("hibernate.connection.url",
				Postavke.DB_URL);
		hibernateProperties.setProperty("hibernate.connection.charSet",
				Postavke.DB_CHARSET);
		hibernateProperties.setProperty("hibernate.connection.username",
				Postavke.DB_USER);
		hibernateProperties.setProperty("hibernate.connection.password",
				Postavke.DB_PASSWORD);
		hibernateProperties.setProperty("hibernate.default_catalog",
				Postavke.DB_CATALOG);
		hibernateProperties.setProperty("hibernate.default_schema",
				Postavke.DB_SCHEMA);
		hibernateProperties.setProperty("hibernate.connection.pool_size",
				Postavke.HB_POOL_SIZE);
		hibernateProperties.setProperty("hibernate.connection.autocommit",
				Postavke.HB_AUTO_COMMIT);
		hibernateProperties.setProperty("hibernate.show_sql",
				Postavke.HB_SHOW_SQL);
		hibernateProperties.setProperty("hibernate.format_sql",
				Postavke.HB_FORMAT_SQL);
	}

	/*
	 * Load POJO mapping-a
	 */
	private static void setConfiguration() {
		if (config == null) {
			config = new AnnotationConfiguration();
		}
		// Pomocne
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Reqmsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Resmsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Errormsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Resxml.class);
		// Banke, partneri
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Bankmsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Vendormsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Venbanaccm.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.VendorVezna.class);
		// Rezervacije
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Budcommsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Budcom.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Bcitemlst.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Dochead.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Notifhead.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Statnotif.class);		
		// Fakture
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Invoicemsg.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Invoice.class);
		config.addAnnotatedClass(hr.infomare.drrh.pojo.Invitemlst.class);
	}

	/*
	 * Naziv PK tablice
	 */
	public static String getIdKlase(String theClass) {
		return sessionFactory.getClassMetadata(theClass)
				.getIdentifierPropertyName();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
