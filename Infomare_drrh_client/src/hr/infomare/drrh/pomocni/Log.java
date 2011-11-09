package hr.infomare.drrh.pomocni;

import hr.infomare.drrh.postavke.Postavke;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

	private static LogManager logManager = LogManager.getLogManager();
	public static Logger loger;
	private static FileHandler logDatoteka;

	public Log() {		
		try {
			logDatoteka = new FileHandler(Postavke.LOG_DATOTEKA,true);
			logDatoteka.setFormatter(new SimpleFormatter());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		loger = Logger.getLogger("Loger");
		loger.setUseParentHandlers(false);
		loger.addHandler(logDatoteka);
		loger.setLevel(Level.FINEST);			
	}	
}