package homeWork02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = 0;
		int tempNumber = 0;

		System.out.println("Enter 15 digits");
		for (int i = 1; i <= 15; i++) {
			System.out.print("Enter the " + i + " number:");
			tempNumber = scan.nextInt();
			if (maxNumber < tempNumber) {
				maxNumber = tempNumber;
			}
			if (minNumber > tempNumber) {
				minNumber = tempNumber;
			}
		}
		scan.close();
		System.out.println("The max value: " + maxNumber);
		System.out.println("The min value: " + minNumber);
	}

}
