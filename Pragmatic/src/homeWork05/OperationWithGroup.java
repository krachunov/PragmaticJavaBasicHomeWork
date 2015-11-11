package homeWork05;

import java.util.ArrayList;

public class OperationWithGroup {
	/**
	 * @listOfGroup - list which record individual groups
	 */
	static ArrayList<Group> listOfGroup = new ArrayList<Group>();

	/**
	 * @param numberOfPerson
	 *            - number of people that we want to add in groups
	 */
	public static void createGroup(int numberOfPerson) {
		if (numberOfPerson % 2 == 0) {
			int tmp = (numberOfPerson / 3) + 1;
			for (int i = 0; i < tmp; i++) {
				Group newGroup = new Group();
				listOfGroup.add(newGroup);
			}
		} else {
			int tmp = (numberOfPerson / 4) + 1;
			for (int i = 0; i < tmp; i++) {
				Group newGroup = new Group();
				listOfGroup.add(newGroup);
			}
		}
	}

	// add people in random order
	public static void addMembersToNewGroups() {
		ArrayList<Person> tempPersonList = Person.getPersonWithOutGroup();

		int countNewGroup = 0;
		while (tempPersonList.size() > 0) {
			int randomPosition = 0 + (int) (Math.random()
					* tempPersonList.size() - 1);

			if (countNewGroup >= listOfGroup.size()) {
				countNewGroup = 0;
			}
			// choose any user list
			Person randomPerson = tempPersonList.get(randomPosition);
			// check if there is any group and
			// remove from personWithOutGroup
			if (randomPerson.isGroup() != true) {
				Group selectedGroup = listOfGroup.get(countNewGroup);
				selectedGroup.addMemberToGroup(randomPerson);
				randomPerson.setGroup(true);
				tempPersonList.remove(randomPerson);
				countNewGroup++;
			}
		}
	}

	public static void printDifferentGroup() {
		Group currentGroup;
		for (int i = 0; i < listOfGroup.size(); i++) {
			currentGroup = listOfGroup.get(i);
			System.out.println("The Group ID: " + currentGroup.getGroupID()
					+ " has the following members:");
			currentGroup.printMembers();
			System.out.println("----------------------------");
		}
	}

}
