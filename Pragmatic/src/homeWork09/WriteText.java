package homeWork09;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

public class WriteText {

	public static void writeTextDirectly() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Start writing text");

		String pathToSaveFile = System.getProperty("user.home")
				+ "\\Desktop\\console.input.txt";

		try (PrintWriter output = new PrintWriter(new FileWriter(
				pathToSaveFile, true));) {
			output.print(scan.nextLine());
			output.println();
		}
	}

	public static void writeText() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Start writing text");
		String text = scan.nextLine();
		String pathToSaveFile = System.getProperty("user.home")
				+ "\\Desktop\\console.input.txt";

		try (PrintWriter output = new PrintWriter(new FileWriter(
				pathToSaveFile, true));) {
			output.print(text);
			output.println();
		}
	}

	public static void main(String[] args) throws IOException {
		writeText();
		writeTextDirectly();

	}

}
