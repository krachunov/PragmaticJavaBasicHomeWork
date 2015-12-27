package edu.pragmatic.java.basics.streamAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise05 {

	public static void squareRoot(List<Integer> list) {
		list.stream().map(n -> Math.sqrt(n))
				.forEach(n -> System.out.println(n));


	}

	public static void main(String[] args) {
		List<Integer> listNumber = Arrays.asList(9,12,25,-1,1,-100,100);

		squareRoot(listNumber);
		
		
	}
}
