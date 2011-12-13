package hr.infomare.drrh.pomocni;

import hr.infomare.drrh.postavke.Postavke;

import org.apache.commons.lang.math.NumberUtils;
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
		httpClientPolicy.setConnectionTimeout(NumberUtils.toInt(Postavke.WS_TIMEOUT));
		httpClientPolicy.setReceiveTimeout(NumberUtils.toInt(Postavke.WS_TIMEOUT));
		http.setClient(httpClientPolicy);	
		klijent.getInInterceptors().add(new LoggingInInterceptor());
		klijent.getOutInterceptors().add(new LoggingOutInterceptor());
	}
}