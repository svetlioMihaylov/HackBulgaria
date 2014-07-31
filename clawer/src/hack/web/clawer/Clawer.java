package hack.web.clawer;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface Clawer {

	/**
	 * Claws the url and returns the body as array of Strings, each line is
	 * separated in new String
	 */
	public String[] claw(String url) throws ClientProtocolException,
			IOException;

	public String dodo(String url) throws ClientProtocolException, IOException;

}
