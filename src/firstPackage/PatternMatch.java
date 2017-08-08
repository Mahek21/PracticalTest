package firstPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternMatch {
	public static boolean patternMatch(String line, String pattern) {
		line.trim();
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
}