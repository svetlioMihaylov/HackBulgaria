package hack.web.clawer;

import hack.web.clawer.utils.ValidationUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class ClawerImpl implements Clawer {

	private String content;
	private static final String HTTP = "http";

	public ClawerImpl(String pContent) {
		this.content = pContent;
	}

	private Log log = LogFactory.getLog(ClawerImpl.class);
	private List<String> visitedLinksList = new ArrayList<String>();

	@Override
	public String dodo(String url) throws ClientProtocolException, IOException {
		String arr[] = claw(url);

		List<String> newlyFoundLinksList = new ArrayList<String>();
		for (String line : arr) {
			if (line.contains(s)) {
				return url;
			}
			newlyFoundLinksList.addAll(getAllLinks(line));
		}
		for (String link : newlyFoundLinksList) {
			if (visitedLinksList.contains(link)) {

			} else {
				visitedLinksList.add(link);
				String temp = constructUrl(url, link);
				dodo(temp);
			}
		}
		return "ERORRRRRRRRRRRRRR";

	}

	@Override
	public String[] claw(String url) throws ClientProtocolException,
			IOException {
		ValidationUtils.notNull(url, "The URL to claw can not be null");
		log.info("Visiting URL :" + url);
		byte[] array = Request.Get(url).connectTimeout(1000).socketTimeout(1000)
				.execute().returnContent().asBytes();
		String temp = new String(array, "UTF-8");
		String bodyAsArray[] = temp.split("\n");

		System.out.println(bodyAsArray.length);
		return bodyAsArray;
	}

	private static List<String> getAllLinks(String content) {
		ArrayList<String> resultList = new ArrayList<>();
		String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			resultList.add(matcher.group(1));
		}
		return resultList;
	}

	private boolean checkIfUrlIsrelative(String path) {
		return path.startsWith(HTTP);
	}

	private String constructUrl(String url, String link)

	{
		if (checkIfUrlIsrelative(link)) {
			return link;
		} else {
			return url + "/" + link;
		}

	}

}
