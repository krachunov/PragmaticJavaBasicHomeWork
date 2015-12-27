package edu.pragmatic.java.basics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegEx_V2 {

	public static void toUpperCaseText(String regEx, String text) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(text);
/**
 * @param start - beginning of the text you want to increase
 * @param end - end of the text you want to increase
 */
		int start = Integer.MAX_VALUE;
		int end = Integer.MIN_VALUE;
		while (matcher.find()) {
			int tempStart = matcher.end();
			int tempEnd = matcher.start();
			System.out.println("start: " + tempStart);
			System.out.println("end: " + tempEnd);
			start = Math.min(start, tempStart);
			end = Math.max(end, tempEnd);

		}
		String match = text.substring(start, end);
		String textWithUpper = text.replaceAll(match, match.toUpperCase());
		System.out.println(textWithUpper);
	}

	public static void main(String[] args) {
		String text = "The code between <upcase>a special tag</upcase> is always uppercase";
		String regex = "(</?\\w+>)";

		toUpperCaseText(regex, text);

	}
}
