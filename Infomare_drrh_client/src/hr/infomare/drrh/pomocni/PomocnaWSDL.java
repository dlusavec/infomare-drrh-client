package hr.infomare.drrh.pomocni;

import java.util.Iterator;
import java.util.Set;

import javax.wsdl.Definition;
import javax.wsdl.Service;
import javax.wsdl.WSDLException;
import javax.xml.namespace.QName;

import org.apache.commons.lang.StringUtils;

import com.ibm.wsdl.xml.WSDLReaderImpl;

public class PomocnaWSDL {
	public static String TARGET_NAMESPACE;
	public static String SERVIS;
	public static String PORT;

	public PomocnaWSDL() {
	}

	public static void locirajWebServis(String wsdl) {
		WSDLReaderImpl citacWSDL = new WSDLReaderImpl();
		Definition definicijaWSDL;
		try {
			definicijaWSDL = citacWSDL.readWSDL(wsdl);
			TARGET_NAMESPACE = definicijaWSDL.getTargetNamespace();
			Set servisi = definicijaWSDL.getServices().keySet();
			for (Iterator iterator = servisi.iterator(); iterator.hasNext();) {
				Object oServis = iterator.next();
				SERVIS = oServis.toString();
				SERVIS = StringUtils.replace(SERVIS, "{" + TARGET_NAMESPACE
						+ "}", "");
			}
			QName qName = new QName(TARGET_NAMESPACE, SERVIS);
			Service service = definicijaWSDL.getService(qName);
			Set portovi = service.getPorts().keySet();
			for (Iterator iterator = portovi.iterator(); iterator.hasNext();) {
				Object port = (Object) iterator.next();
				PORT = port.toString();
			}
		} catch (WSDLException e) {			
			Log.loger.severe("Greška kod èitanja wsdl datoteke " + wsdl
					+ PomocnaError.getErrorMessage(e));
		}
	}
}