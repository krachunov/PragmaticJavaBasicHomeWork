package edu.pragmatic.java.basics.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CutFile {

	public static void cutingFile(String pathAndFileName, String destination)
			throws FileNotFoundException, IOException {
		File fileInput = new File(pathAndFileName);
		try (FileInputStream inputStream = new FileInputStream(fileInput);
				FileOutputStream outputStream = new FileOutputStream(
						destination);) {

			int currentByte;
			while ((currentByte = inputStream.read()) != -1) {
				outputStream.write(currentByte);
			}
			fileInput.deleteOnExit();
		}
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		String pathAndFileName = "resource\\console.input.txt";
		String destination = "resource\\MoveFileHere\\console.input.txt";

		cutingFile(pathAndFileName, destination);

	}

}
