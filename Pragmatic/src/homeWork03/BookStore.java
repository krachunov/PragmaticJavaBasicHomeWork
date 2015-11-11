package homeWork03;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BookStore {
	String nameOfBookStore;
	ArrayList<Book> bookList;

	public BookStore(String nameOfBookStore) {
		this.nameOfBookStore = nameOfBookStore;
		bookList = new ArrayList<Book>();
	}

	// ����� ������� �� ��� Book � ����� ���������� �������
	public Book searchBookElement(String name) {
		int tempIndex = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getBookName() == name) {
				tempIndex = i;
			}
		}
		return bookList.get(tempIndex);
	}

	/*
	 * ������ ���� �����. ��������� ���� ���������� ������ � ����� (booklist),
	 * ��� ��, ������� ��. ���� ���� ��������� ���� ���������� �����������
	 * �����. ��� ���������� ������� ���� ������ ���� � ����������. ��� ��
	 * ���������� � ������ ��� ����������� ����
	 */
	public void addBookToStore(String bookName, double priceBook, int number) {
		// ���� IF �� ������� ������ �� ���� �� ������� ��� ������
		// "searchBookElement" �� �� �� ����� NullPointerException :(
		if (bookList.size() <= 0) {
			Book book = new Book();
			;
			bookList.add(book);
		}
		if (searchBookElement(bookName).getBookName() == bookName) {
			searchBookElement(bookName).numberOfBook += number;
			searchBookElement(bookName).price = priceBook;
			System.out.println("The book \""
					+ searchBookElement(bookName).nameBook + "\" exists"
					+ " new price is " + searchBookElement(bookName).price
					+ " new quantity is: "
					+ searchBookElement(bookName).numberOfBook);
		} else {
			Book books = new Book(bookName, priceBook, number);
			bookList.add(books);
			System.out.println("The book \"" + bookName
					+ "\" was successfully added. Quantity: " + number);
		}

	}

	// ����� �� �������� ���� �� ����� � ����, ��� ����������
	public void addBookToStore(String bookName, double priceBook) {
		addBookToStore(bookName, priceBook, 0);
	}

	// �������� ������ �� ������� �� �������, ���� ����� ����� ����� ��
	// �������� �����
	public String showBookName(String name) {
		String temSearchingBookName = null;
		temSearchingBookName = searchBookElement(name).getBookName();
		return temSearchingBookName;
	}

	/*
	 * ������ ������� ������� (Book) � ����� �������� ���� ��� ������� ������
	 * (numberOfBook>0) ��� ��� ������� ������ ������� 1 �� ���� ������� ����� �
	 * ������� ��������� �� ������� ��������.� �������� ������ ����� ���������
	 * �� ������������ ���������
	 */
	public void sellBook(String name) {
		if (searchBookElement(name).numberOfBook > 0) {
			searchBookElement(name).numberOfBook--;
			System.out.println("The book: "
					+ searchBookElement(name).getBookName()
					+ " sold successfully");
		} else {
			System.out.println("Insufficient quantity");
		}
	}

	public void showBooksPrice(String name) throws IndexOutOfBoundsException {
		try {
			System.out.println("������ �� " + searchBookElement(name).nameBook
					+ " e " + searchBookElement(name).price);
		} catch (IndexOutOfBoundsException oobe) {
			System.out.println("���� �������� �����");
		}
	}

	public void showBookNumber(String name) {
		try {
			System.out.println("������� ���������� �� "
					+ searchBookElement(name).nameBook + " e "
					+ searchBookElement(name).numberOfBook);
		} catch (IndexOutOfBoundsException oobe) {
			System.out.println("���� �������� �����");
		}

	}

	/*
	 * ������� ����� ������ � ����� � ���������� �� ��������� ���, ���� � ����
	 * ����� �� ������ ����������
	 */
	public void showAllBook() {
		for (int i = 0; i < bookList.size(); i++) {
			Book tempBookElement = bookList.get(i);
			String tempNameBook = tempBookElement.getBookName();
			double tempPriceBook = tempBookElement.price;
			int tempQuantityBook = tempBookElement.numberOfBook;
			if (tempNameBook == null) {
				continue;
			} else {
				System.out.println("Book: |\"" + tempNameBook
						+ "\"| The price: " + tempPriceBook + "| quantity: |"
						+ tempQuantityBook);
			}
		}
		if (bookList.size() <= 0) {
			System.out.println("The store \"" + this.nameOfBookStore
					+ "\" is empty!");
		}
	}
}
