package hr.infomare.drrh.postavke;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;

public class Postavke {

	// RAZNO
	public static String KONFIG_DATOTEKA = "C:/Konfiguracija.properties";
	public static Properties postavke = new Properties();
	public static String LOGICAL_SYSTEM_NAME;
	public static String LOG_DATOTEKA;
	public static String DEBUG_MAPA;
	public static boolean DEBUG_POJO;
	public static boolean DEBUG_PORUKA;

	// RDBMS i HIBERNATE
	public static String DB_USER;
	public static String DB_PASSWORD;
	public static String DB_CATALOG;
	public static String DB_SCHEMA;
	public static String DB_CHARSET;
	public static String DB_URL;
	public static String HB_POOL_SIZE;
	public static String HB_AUTO_COMMIT;
	public static String HB_SHOW_SQL;
	public static String HB_FORMAT_SQL;

	// WS i JOB
	public static String WS_ODGODA;
	public static String WS_INTERVAL;
	public static String WS_TIMEOUT;	
	public static boolean JOB_RUNNING = false;
	public static String JOB_SLEEP;

	// WSDL lokacije
	public static String WSDL_BANK;
	public static String WSDL_VENDOR;
	public static String WSDL_RESERVATION;
	public static String WSDL_CONTRACT;
	public static String WSDL_PURCHASE_ORDER;
	public static String WSDL_INVOICE;
	public static String WSDL_RESPONSE;

	public Postavke() {
		try {
			postavke.load(new FileInputStream(KONFIG_DATOTEKA));
			LOGICAL_SYSTEM_NAME = postavke.getProperty("LOGICAL_SYSTEM_NAME");
			LOG_DATOTEKA = postavke.getProperty("LOG_DATOTEKA");
			DEBUG_MAPA = postavke.getProperty("DEBUG_MAPA");
			DEBUG_POJO = postavke.getProperty("DEBUG_POJO").equals("1");
			DEBUG_PORUKA = postavke.getProperty("DEBUG_PORUKA").equals("1");
			kreirajDebugMape();
			DB_USER = postavke.getProperty("DB_USER");
			DB_PASSWORD = postavke.getProperty("DB_PASSWORD");
			DB_CATALOG = postavke.getProperty("DB_CATALOG");
			DB_SCHEMA = postavke.getProperty("DB_SCHEMA");
			DB_CHARSET = postavke.getProperty("DB_CHARSET");
			DB_URL = postavke.getProperty("DB_URL");
			HB_POOL_SIZE = postavke.getProperty("HB_POOL_SIZE");
			HB_AUTO_COMMIT = postavke.getProperty("HB_AUTO_COMMIT");
			HB_SHOW_SQL = postavke.getProperty("HB_SHOW_SQL");
			HB_FORMAT_SQL = postavke.getProperty("HB_FORMAT_SQL");
			WS_ODGODA = postavke.getProperty("WS_ODGODA");
			WS_INTERVAL = postavke.getProperty("WS_INTERVAL");
			WS_TIMEOUT = postavke.getProperty("WS_TIMEOUT");
			JOB_SLEEP = postavke.getProperty("JOB_SLEEP");			
			WSDL_BANK = postavke.getProperty("WSDL_BANK");
			WSDL_VENDOR = postavke.getProperty("WSDL_VENDOR");
			WSDL_RESERVATION = postavke.getProperty("WSDL_RESERVATION");
			WSDL_CONTRACT = postavke.getProperty("WSDL_CONTRACT");
			WSDL_PURCHASE_ORDER = postavke.getProperty("WSDL_PURCHASE_ORDER");
			WSDL_INVOICE = postavke.getProperty("WSDL_INVOICE");
			WSDL_RESPONSE = postavke.getProperty("WSDL_RESPONSE");
		} catch (IOException e) {
			System.err.println(e.getMessage());

		}
	}

	public static void ucitajPostavke(ServletContext servletContext) {
		KONFIG_DATOTEKA = servletContext.getInitParameter("konfig_datoteka");
		try {
			postavke.load(new FileInputStream(KONFIG_DATOTEKA));
			LOGICAL_SYSTEM_NAME = postavke.getProperty("LOGICAL_SYSTEM_NAME");
			LOG_DATOTEKA = postavke.getProperty("LOG_DATOTEKA");
			DEBUG_MAPA = postavke.getProperty("DEBUG_MAPA");
			DEBUG_POJO = postavke.getProperty("DEBUG_POJO").equals("1");
			DEBUG_PORUKA = postavke.getProperty("DEBUG_PORUKA").equals("1");
			kreirajDebugMape();
			DB_USER = postavke.getProperty("DB_USER");
			DB_PASSWORD = postavke.getProperty("DB_PASSWORD");
			DB_CATALOG = postavke.getProperty("DB_CATALOG");
			DB_SCHEMA = postavke.getProperty("DB_SCHEMA");
			DB_CHARSET = postavke.getProperty("DB_CHARSET");
			DB_URL = postavke.getProperty("DB_URL");
			HB_POOL_SIZE = postavke.getProperty("HB_POOL_SIZE");
			HB_AUTO_COMMIT = postavke.getProperty("HB_AUTO_COMMIT");
			HB_SHOW_SQL = postavke.getProperty("HB_SHOW_SQL");
			HB_FORMAT_SQL = postavke.getProperty("HB_FORMAT_SQL");
			WS_ODGODA = postavke.getProperty("WS_ODGODA");
			WS_INTERVAL = postavke.getProperty("WS_INTERVAL");
			WS_TIMEOUT = postavke.getProperty("WS_TIMEOUT");
			JOB_SLEEP = postavke.getProperty("JOB_SLEEP");
			WSDL_BANK = postavke.getProperty("WSDL_BANK");
			WSDL_VENDOR = postavke.getProperty("WSDL_VENDOR");
			WSDL_RESERVATION = postavke.getProperty("WSDL_RESERVATION");
			WSDL_CONTRACT = postavke.getProperty("WSDL_CONTRACT");
			WSDL_PURCHASE_ORDER = postavke.getProperty("WSDL_PURCHASE_ORDER");
			WSDL_INVOICE = postavke.getProperty("WSDL_INVOICE");
			WSDL_RESPONSE = postavke.getProperty("WSDL_RESPONSE");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void kreirajDebugMape() {
		File rootDebug = new File(DEBUG_MAPA);
		if (!rootDebug.exists()) {
			new File(DEBUG_MAPA).mkdir();
			new File(DEBUG_MAPA + "BANK").mkdir();
			new File(DEBUG_MAPA + "VENDOR").mkdir();
			new File(DEBUG_MAPA + "VEN_ACC").mkdir();
			new File(DEBUG_MAPA + "RESERVATION").mkdir();
			new File(DEBUG_MAPA + "CONTRACT").mkdir();
			new File(DEBUG_MAPA + "PURCHASE_ORDER").mkdir();
			new File(DEBUG_MAPA + "INVOICE").mkdir();
			new File(DEBUG_MAPA + "RESPONSE").mkdir();
		}
	}
}