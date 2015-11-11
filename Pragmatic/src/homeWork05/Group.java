package homeWork05;

import java.util.ArrayList;

public class Group {
	/**
	 * @param groupID - identifier for each group
	 * @param countGroup - Counter that determines which group to record a random person
	 * @param memberGroup - record sheet which users to a group, already sorted
	 */
	private int groupID;
	private ArrayList<Person> memberGroup;
	public static int countGroup = 1;

	public Group() {
		groupID = countGroup;
		memberGroup = new ArrayList<Person>();
		countGroup++;

	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public ArrayList<Person> getMemberGroup() {
		return memberGroup;
	}

	public void setMemberGroup(ArrayList<Person> memberGroup) {
		this.memberGroup = memberGroup;
	}
	public void addMemberToGroup(Person memberGroup) {
		this.memberGroup.add(memberGroup);
	}
	public void printMembers(){
		for(Person people: memberGroup){
			System.out.println(people.getName());
		}
	}

}
