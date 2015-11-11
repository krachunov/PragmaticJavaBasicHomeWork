package homeWork08;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise03_SameLetters {

	public static void removeSameLetters(String string) {
		TreeSet symbol = new TreeSet();

		for (int i = 0; i < string.length(); i++) {
			symbol.add(string.charAt(i));
		}
		Iterator iterator = symbol.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}

	public static void main(String[] args) {
		String text = "This is an example";
		removeSameLetters(text);

	}
}
