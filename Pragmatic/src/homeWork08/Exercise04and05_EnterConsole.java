package homeWork08;

import java.util.Scanner;

public class Exercise04and05_EnterConsole {

	public static void enterText() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String stopText = "END OF TEXT";
		boolean stop = false;
		String tempLine = null;

		System.out.println("start enter the text");

		while (stop != true) {
			if (tempLine != null) {
				sb.append(tempLine);
				// sb.append(tempLine+"\n");
			}
			tempLine = scan.nextLine();
			stop = tempLine.equals(stopText);

		}
		System.out.println(sb);
		// reverse
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		enterText();

	}
}
