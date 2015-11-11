package homeWork06;

public class InvalidStudentData extends Exception {

	public InvalidStudentData() {
		super();
	}

	public InvalidStudentData(String message) {
		super(message);
	}

	public InvalidStudentData(String message, Throwable throwable) {
		super(message, throwable);
	}
}
