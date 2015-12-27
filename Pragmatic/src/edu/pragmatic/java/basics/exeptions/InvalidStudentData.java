package edu.pragmatic.java.basics.exeptions;

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
