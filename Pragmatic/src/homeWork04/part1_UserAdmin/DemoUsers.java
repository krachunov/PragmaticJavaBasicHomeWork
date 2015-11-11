package homeWork04.part1_UserAdmin;

public class DemoUsers {

	public static void main(String[] args) {

		AdminUserImpl.admin.logIn();
		AdminUserImpl.admin.createUser();
		DBUsers.numberOfUsers();
		AdminUserImpl.admin.createUser();
		DBUsers.numberOfUsers();
		AdminUserImpl.admin.deleteUser();
		DBUsers.numberOfUsers();
		UserImpl user = new UserImpl();

	}

}
