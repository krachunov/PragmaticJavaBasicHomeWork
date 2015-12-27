package edu.pragmatic.java.basics.streamAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonDemo {

	/**
	 * 
	 * @param list
	 *            - List of Person object
	 * @return - the length of the long name
	 */
	public static Optional<Integer> personNameLength(List<Person> list) {
		return list.stream().map(n -> n.getName()).map(n -> n.length())
				.max((o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0);
	}

	public static Optional<Double> personHeight(List<Person> list) {
		return list.stream().map(n -> n.getHeight())
				.max((o1, o2) -> (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0);

	}

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ico", "Ivan", "Georgi",
				"Razvigor");

		ArrayList<Person> nameObject = new ArrayList<Person>();
		nameList.stream().map(Person::new).forEach(n -> nameObject.add(n));

		for (Person person : nameObject) {
			System.out.println(person.getName());
		}
		Optional<Integer> maxLengthName = personNameLength(nameObject);
		System.out.println(maxLengthName.orElse(-1));

		// Exercise04
		Optional<Double> maxLength = personHeight(nameObject);

	}

}
