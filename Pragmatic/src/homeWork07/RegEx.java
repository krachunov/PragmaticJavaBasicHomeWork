package homeWork07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegEx {
	
	public static void toUpperCaseText(String regEx, String text) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(text);

		String[] splitedText = null;
		splitedText = text.split(regEx);
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for (String a : splitedText) {
			if (count == 0 || count % 2 == 0) {
				sb.append(a);
				count++;
			} else {
				sb.append(a.toUpperCase());
				count++;
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		String text = "The code between <upcase>a special tag</upcase> is always uppercase";
		String regex = "(</?\\w+>)";
		toUpperCaseText(regex, text);

	}
}
