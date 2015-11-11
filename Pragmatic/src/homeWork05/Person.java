package homeWork05;

import java.util.ArrayList;

public class Person {
	private static ArrayList<Person> personWithOutGroup = new ArrayList<Person>();
	private String name;
	private int personalID;
	private static int id = 1;
	private boolean isGroup;

	private Person(String name) {
		this.name = name;
		this.personalID = id;
		this.isGroup = false;
		id++;
	}

	// �������� � ���� ������ ������������� �� �� ���� �� �� ������� �� ���
	// �����
	public static ArrayList<Person> getPersonWithOutGroup() {
		return personWithOutGroup;
	}

	// �� �� �������� � ������������ �� ������� ����� ����� �� ��� Person
	// ��������� ����������� � ������
	public static void createPerson(String personName) {
		personWithOutGroup.add(new Person(personName));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonalID() {
		return personalID;
	}

	public boolean isGroup() {
		return isGroup;
	}

	public void setGroup(boolean isGroup) {
		this.isGroup = isGroup;
	}

}
