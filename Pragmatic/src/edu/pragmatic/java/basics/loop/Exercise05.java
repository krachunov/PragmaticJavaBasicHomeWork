package edu.pragmatic.java.basics.loop;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		scan.close();

		for (int i = 3; i <= number; i++) {
			if (i == 3) {
				System.out.print(i);
			}
			if (i > 3 && i % 3 == 0) {
				System.out.print("," + i);
			}
		}
	}

}
