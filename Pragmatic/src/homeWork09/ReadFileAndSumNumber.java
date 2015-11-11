package homeWork09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class ReadFileAndSumNumber {

	public static int readAndSum(String sorce) throws IOException {
		try (BufferedReader inputFile = new BufferedReader(
				new FileReader(sorce));) {

			char allcharacter[] = new char[100000];
			List<Integer> onlyNumber = new ArrayList<>();
			inputFile.read(allcharacter);
			int sum = 0;

			for (Character c : allcharacter) {
				if (c == 0) {
					break;
				}
				if (c.isDigit(c)) {
					onlyNumber.add(c.getNumericValue(c));
				}
			}
			for (Integer i : onlyNumber) {
				sum += i;
			}
			System.out.println(sum);
			return sum;

		}
	}

	public static void writeSum(int sumToWrite, String nameNewFile)
			throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				nameNewFile))) {
			writer.write(new Integer(sumToWrite).toString());
		}
	}

	public static void main(String[] args) throws IOException {
		String sorceFile = "resource\\number.txt";
		int sumToSvae = readAndSum(sorceFile);
		String nameNewFile = "resource\\SUM_number.txt";

		writeSum(sumToSvae, nameNewFile);

	}
}
