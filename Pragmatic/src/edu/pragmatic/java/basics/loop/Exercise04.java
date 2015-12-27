package edu.pragmatic.java.basics.loop;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		scan.close();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);
	}

}
