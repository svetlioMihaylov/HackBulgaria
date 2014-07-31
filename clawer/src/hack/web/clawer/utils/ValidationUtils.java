package hack.web.clawer.utils;

public class ValidationUtils {

	public static void notNull(String string, String errorMessage) {
		if (string == null) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

}
