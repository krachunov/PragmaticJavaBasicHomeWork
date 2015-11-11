package homeWork03;

import java.util.ArrayList;

public class BookstoreDemo {

	public static void main(String[] args) {

		Date.showDate();
		System.out.println();
		BookStore knijarnica1 = new BookStore("Orange");
		BookStore knijarnica2 = new BookStore("Kniga");

		knijarnica1.addBookToStore("Света на диска", 12, 1);
		knijarnica1.addBookToStore("Света на диска", 15, 1);
		knijarnica1.addBookToStore("JAVA", 10);
		knijarnica1.addBookToStore("Лесни стъпки", 5, 10);
		knijarnica1.addBookToStore("Приказки", 7.85, 20);
		knijarnica1.addBookToStore("Готварска книга", 9.99, 3);
		System.out.println("-----------------------------");

		knijarnica1.showAllBook();
		System.out.println("-----------------------------");

		knijarnica2.showAllBook();
		System.out.println("-----------------------------");

		knijarnica1.sellBook("Света на диска");
		knijarnica1.sellBook("Света на диска");
		knijarnica1.sellBook("Света на диска");
		System.out.println("-----------------------------");

		knijarnica1.showAllBook();
		System.out.println("-----------------------------");

		knijarnica1.showBooksPrice("JAVA");
		knijarnica1.showBookNumber("JAVA");
		System.out.println("-----------------------------");

		knijarnica2.showBooksPrice("JAVA");
		knijarnica2.showBookNumber("JAVA");
		System.out.println("-----------------------------");

	}
}
