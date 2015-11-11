package homeWork08;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise01_EmploeeDemo {

	public static void printList(ArrayList<Exercise01_Emploee> staffList) {
		for (Exercise01_Emploee e : staffList) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Exercise01_Emploee> staffList = new ArrayList<>();
		staffList.add(new Exercise01_Emploee("Tom", 2000));
		staffList.add(new Exercise01_Emploee("Jhon", 1500));
		staffList.add(new Exercise01_Emploee("Anna", 100));
		staffList.add(new Exercise01_Emploee("Anna", 83));
		staffList.add(new Exercise01_Emploee("Zoro", 54600));
		staffList.add(new Exercise01_Emploee("Didy", 200));
		staffList.add(new Exercise01_Emploee("Silvester", 5200));
		staffList.add(new Exercise01_Emploee("emploee7", 900));
		staffList.add(new Exercise01_Emploee("Zoro", 546));
		staffList.add(new Exercise01_Emploee("Ceco", 310));

		System.out.println("List before sort");
		printList(staffList);

		System.out.println();
		Collections.sort(staffList);
		System.out.println("After sort");
		printList(staffList);

		System.out.println();
		System.out.println("The max value of the list "
				+ Collections.max(staffList));

	}

}
