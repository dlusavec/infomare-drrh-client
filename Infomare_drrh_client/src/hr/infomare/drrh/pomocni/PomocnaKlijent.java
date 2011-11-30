package hr.infomare.drrh.pomocni;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public class PomocnaKlijent {

	public PomocnaKlijent() {
	}

	public static void postavkeKlijenta(Object port) {
		Client klijent = ClientProxy.getClient(port);
		HTTPConduit http = (HTTPConduit) klijent.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		/*
		 * Send/recive timeout u milisekundama preporuka postaviti 5 minuta
		 * Setiranje na 0 ceka beskonacno
		 */
		httpClientPolicy.setConnectionTimeout(0);
		httpClientPolicy.setReceiveTimeout(0);
		http.setClient(httpClientPolicy);	
		klijent.getInInterceptors().add(new LoggingInInterceptor());
		klijent.getOutInterceptors().add(new LoggingOutInterceptor());
	}
}