package edu.pragmatic.java.basics.exeptions;

import edu.pragmatic.java.basics.exeptions.InvalidStudentData;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private boolean isWoman;

	public Student(String firstName, String lastName, int age, boolean isWoman)
			throws InvalidStudentData {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setWoman(isWoman);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws InvalidStudentData {
		if (firstName.length() > 12) {
			throw new InvalidStudentData("The name must be 12 characters");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws InvalidStudentData {
		if (lastName.length() > 20) {
			throw new IllegalArgumentException(
					"the last name must be 20 characters");
		}
		this.lastName = lastName;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidStudentData {
		if (age < 7 || age > 18) {
			throw new InvalidStudentData("Age must be between 7 and 18");
		}
		this.age = age;

	}

	public boolean isWoman() {
		return isWoman;
	}

	public void setWoman(boolean isWoman) {
		this.isWoman = isWoman;
	}

}
