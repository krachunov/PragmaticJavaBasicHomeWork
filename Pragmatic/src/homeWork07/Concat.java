package homeWork07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CosNaming.IstringHelper;

public class Concat {

	// code

	public static void concatNumber(int num) throws IOException {
		
		long startTime = System.nanoTime();
		
		StringBuilder sb = new StringBuilder();
		
		StringBuffer sBuilder = new StringBuffer();
		for (int i = 1; i <= num; i++) {
			sb.append(String.valueOf(i));
		}
		File file = new File("c:\\dump.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		try {
		    writer.write(sb.toString());
		} finally {
		    if (writer != null) writer.close();
		}
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime)*(Math.pow(10, -9)) + " sec");

	}

	public static void main(String[] args) throws IOException {
		concatNumber(1000000);
	}

}
