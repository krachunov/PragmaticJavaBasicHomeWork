package edu.pragmatic.java.basics.loop;

import java.util.Scanner;

public class Exercise04v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		scan.close();
		int[] arr = new int[number];
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
			arr[i-1] = sum;
			count++;
		}
		System.out.println("The sum is: " + sum);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
