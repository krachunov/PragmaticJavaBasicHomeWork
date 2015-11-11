package homeWork09;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.management.Query;

public class FindingFile {

	/**
	 * 
	 * @param startDirectory
	 *            - directory from which want to start searching
	 * @param fileName
	 *            - file searches
	 * @return - an object of type File or null
	 */
	public static File findFile(String startDirectory, String fileName) {
		Stack<File> stuck = new Stack<>();
		File directory = new File(startDirectory);
		if (directory.isDirectory()) {
			stuck.push(directory);
			// if the directory is empty remove it from stack
			if (directory.length() <= 0) {
				stuck.pop();
				// if not, scan content
			} else {
				File[] subDirectory = directory.listFiles();
				// all files and directories're checking whether directories.If
				// so, add them to the queue
				stuck.pop();
				for (File currentDirectory : subDirectory) {
					if (currentDirectory.isDirectory()) {
						if (!currentDirectory.canRead()) {
							continue;
						}
						stuck.push(currentDirectory);
						// recursively scan any directory
						findFile(currentDirectory.getAbsolutePath(), fileName);
					} else {
						if (currentDirectory.getName().equalsIgnoreCase(
								fileName)) {
							System.out.println("File name: "
									+ currentDirectory.getName()
									+ "  is located "
									+ currentDirectory.getAbsolutePath());
							return currentDirectory;
						}
					}
				}
			}
		}

		while (stuck.size() > 0) {
			stuck.pop();
			// System.out.println(queue.pop());
		}
		return null;

	}

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the path"); String pathToSearch =
		 * scan.next();
		 * 
		 * System.out.println("Enter the file name"); String fileNameToSearch =
		 * scan.next(); File searchingFile = findFile(pathToSearch,
		 * fileNameToSearch);
		 */

		String path = "resource\\test";
		String fileName = "a.txt";
		File file = findFile(path, fileName);

	}
}
