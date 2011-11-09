package hr.infomare.drrh.pomocni;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class PomocnaDatum {
	private static SimpleDateFormat simpleDateFormatBroj = new SimpleDateFormat(
			"yyyyMMDD");

	public PomocnaDatum() {
	}

	public static XMLGregorianCalendar getTrenutniDatumXML() {
		GregorianCalendar gregorian = new GregorianCalendar();
		gregorian.setTime(new Date(System.currentTimeMillis()));
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gregorian);
		} catch (DatatypeConfigurationException e) {
			Log.loger.severe("Greška kod konverzije u XML datum ! "
					+ e.getMessage());
			return null;
		}

	}

	public static XMLGregorianCalendar numDatumUXMLDatum(int datum) {
		GregorianCalendar gregorian = new GregorianCalendar();
		try {
			gregorian.setTime(simpleDateFormatBroj.parse(Integer
					.toString(datum)));
		} catch (ParseException e) {
			Log.loger.severe("Greška kod konverzije broja u XML datum ! "
					+ e.getMessage());
			return null;
		}
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gregorian);
		} catch (DatatypeConfigurationException e) {
			Log.loger.severe("Greška kod konverzije u XML datum ! "
					+ e.getMessage());
			return null;
		}

	}

	public static Date XMLDatumUDate(XMLGregorianCalendar xmlDatum) {
		if (xmlDatum != null) {
			return xmlDatum.toGregorianCalendar().getTime();
		} else {
			return null;
		}

	}

}
