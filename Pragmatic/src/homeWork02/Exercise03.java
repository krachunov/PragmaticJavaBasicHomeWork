package homeWork02;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firsNumber = scan.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scan.nextInt();
		scan.close();

		if (firsNumber < secondNumber) {
			for (int x = firsNumber; x <= secondNumber; x++) {
				System.out.println(x);
			}
		} else {
			for (int y = secondNumber; y <= firsNumber; y++) {
				System.out.println(y);
			}
		}
	}
}
