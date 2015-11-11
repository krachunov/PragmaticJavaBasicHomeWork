package homeWork01;

import java.util.Scanner;

public class Exercise04 {
	static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int k = i + 1; k < array.length - 1; k++) {
				if (array[k] < array[index]) {
					index = k;
				}
			}
			swap(array, i, index);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {5,3,4,7,1,9,2};
		for(int x:arr){
			System.out.print(" "+x);
		}
		sort(arr);
		System.out.println();
		for(int x:arr){
			System.out.print(" "+x);
		}
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the hour: ");
//		int hour = scan.nextInt();
//		System.out.println("Enter the money");
//		float sumMoney = scan.nextFloat();
//		System.out.print("Am I healthy? (true or false)");
//		boolean isHealth = scan.nextBoolean();
//
//		if (isHealth) {
//			if (sumMoney >= 1 && sumMoney <= 10) {
//				System.out.println("Will go to the coffee");
//			} else if (sumMoney > 10) {
//				System.out.println("Party all night");
//			} else {
//				System.out.println("I will stay at home and tush games");
//			}
//		} else {
//			if (sumMoney > 0) {
//				System.out.println("I will buy drugs");
//			} else {
//				System.out.println("I will stay at home and drink tea");
//			}
//		}
	}

}
