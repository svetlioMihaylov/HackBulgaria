package hack.web.clawer;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;

public class EntryPoint {

	private static Log log = LogFactory.getLog(EntryPoint.class);

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		/*
		 * CloseableHttpClient httpclient = HttpClients.createDefault(); HttpGet
		 * httpget = new HttpGet("http://ebusiness.free.bg/index.html"); //
		 * CloseableHttpResponse response = httpclient.execute(httpget);
		 * HttpResponse response = httpclient.execute(httpget);
		 * ResponseHandler<String> handler = new BasicResponseHandler(); String
		 * body = handler.handleResponse(httpget); // System.out.println(body);
		 * response.getEntity().ge
		 */

		// System.out.println(asd);

		Clawer cl = new ClawerImpl("Револвираща");
		String string = cl.dodo("http://www.abv.bg/");
		log.info("SEARCHED URL :" + string);
	}
}
