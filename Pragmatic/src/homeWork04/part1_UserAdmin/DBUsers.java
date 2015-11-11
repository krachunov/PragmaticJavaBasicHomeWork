package homeWork04.part1_UserAdmin;

import java.util.Map;
import java.util.TreeMap;

public abstract class DBUsers extends AbstractUser {

	// Опитах се да запазвам като ключ вместо само стринг (името на потребителя)
	// референция към обекта но нещо се оплетох
	private static TreeMap<String, String> usersDataBase = new TreeMap<String, String>();

	public static void addUser(AbstractUser user) {
		usersDataBase.put(user.getUserName(), user.getPassword());
	}

	public static boolean removeUser(String name) {
		
		return usersDataBase.remove(name) != null;
	}

	// Връща true ако има такъв потребител в противен случай false
	public static boolean getUser(String name) {
		if (usersDataBase.containsKey(name)) {
			System.out.println("The user exists");
			return true;
		} else {
			System.out.println("There is no such user");
			return false;
		}
	}

	public static void numberOfUsers() {
		System.out.println("Number of users: " + usersDataBase.size());
	}

}
