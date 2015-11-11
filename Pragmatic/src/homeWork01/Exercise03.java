package homeWork01;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = scan.nextInt();
		int sumTwoNumbers = firstNumber + secondNumber;

		if (sumTwoNumbers % 2 == 0) {
			System.out.println(sumTwoNumbers + " is even number");
		} else {
			System.out.println(sumTwoNumbers + " is odd  number");
		}

	}

}
