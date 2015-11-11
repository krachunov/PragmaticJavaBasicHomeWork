package homeWork05;

public class Demo {
	public static void main(String[] args) {
		Person.createPerson("Христо Крачунов");
		Person.createPerson("Румен Андреев");
		Person.createPerson("Гергана Канчева");
		Person.createPerson("Кирил Иванов");
		Person.createPerson("Давид Иванов");
		Person.createPerson("Петър Киряков");
		Person.createPerson("Стефан Тончев");
		Person.createPerson("Александър Димитров");
		Person.createPerson("I.d. Deshov");
		Person.createPerson("Васил Милчев");
		Person.createPerson("Тошко Тошков");

		OperationWithGroup.createGroup(11);
		OperationWithGroup.addMembersToNewGroups();
		OperationWithGroup.printDifferentGroup();
		
	
	}
}
