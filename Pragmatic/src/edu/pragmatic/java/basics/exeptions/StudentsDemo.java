package edu.pragmatic.java.basics.exeptions;

public class StudentsDemo {

	public static void main(String[] args) throws InvalidStudentData {
		a();
	}

	public static void a() throws InvalidStudentData {
		System.out.println("Before b()");
		b();
		System.out.println("After b()");
	}

	public static void b() throws InvalidStudentData {
		System.out.println("Before c()");
		c();
		System.out.println("After c()");
	}

	public static void c() throws InvalidStudentData {
		Student s1 = new Student("Hristo", "Krachunov", 29, false);
	}
}
