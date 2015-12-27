package edu.pragmatic.java.basics.streamAndLambda;

public class Person {
	private String name;
	private double height;

	public Person(String name) {
		setName(name);
	}

	public Person(String name, double height) {
		setName(name);
		setHeight(height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
