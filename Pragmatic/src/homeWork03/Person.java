package homeWork03;

import java.util.ArrayList;

public class Person {
	String firstName;
	String lastName;
	int age;
	float height;
	float weight;
	Person mother;
	
	/*
	 * Използвам ArayList за да не преоразмерявам всеки път когато се запълни
	 * масива. Понеже не знам предварително броя.
	 */
	ArrayList<Person> myFriends;

	public Person() {
	}

	public Person(String firstName) {
		this.firstName = firstName;
	}

	public Person(String firstNme, String lstNme, int age) {
		this.firstName = firstNme;
		this.lastName = lastName;
		this.age = age;
	}

	public Person(String firstNme, String lstNme, int age, float height,
			float weight) {
		this(firstNme, lstNme, age);
		this.height = height;
		this.weight = weight;
	}

	public void addFriends(String newFriend) {
		if (myFriends.size() == 0) {
			myFriends = new ArrayList<Person>();
		}
		Person friend = new Person(newFriend);
		myFriends.add(friend);
	}

	public void addMother(String mom) {
		Person mother = new Person(mom);
	}
}
