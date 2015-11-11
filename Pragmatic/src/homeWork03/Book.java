package homeWork03;

public class Book {
	String nameBook;
	double price;
	int numberOfBook;

	public Book() {

	}

	public Book(String name) {
		this.nameBook = name;
	}

	public Book(String name, double price) {
		this(name);
		this.price = price;
	}

	public Book(String name, double price, int number) {
		this(name, price);
		this.numberOfBook = number;
	}

	public String getBookName() {
		return this.nameBook;
	}

}
