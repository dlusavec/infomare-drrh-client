package hr.infomare.drrh.pomocni;

import hr.infomare.drrh.postavke.Postavke;

import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Debug {
	private String mapa;

	public Debug(String mapa) {
		this.mapa = Postavke.DEBUG_MAPA + mapa + "/";
	};

	public void ispisUXML(Object objekt, String datoteka) {
		try {
			FileOutputStream fos = null;
			fos = new FileOutputStream(mapa + datoteka + ".xml");
			XStream xStream = new XStream(new DomDriver());
			xStream.toXML(objekt, fos);			
			fos.flush();
			fos.close();
		} catch (Exception e) {
			Log.loger.severe("Greška kod kreiranja debug datoteke"
					+ e.getMessage());
		}
	}
}