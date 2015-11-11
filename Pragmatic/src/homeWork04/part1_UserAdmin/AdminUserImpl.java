package homeWork04.part1_UserAdmin;

import java.util.Date;
import java.util.Scanner;

public class AdminUserImpl extends AbstractUser implements IAdminUser {
	
	private AdminUserImpl() {
		super.userName = "admin";
		super.password = "passw0rd";
		super.dataRegistration = new Date();
	}
	public static AdminUserImpl admin = new AdminUserImpl();

	@Override
	public String getUserName() {
		return super.userName;
	}

	public void SetUserName(String name) {
		super.userName = name;

	}

	@Override
	public Date getDateRegistered() {
		return super.dataRegistration;
	}

	public void setDateRegitered() {
		super.dataRegistration = new Date();
	}

	@Override
	public void logIn() {
		System.out.println("Hello Admin");

	}

	@Override
	public void createUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the new user:");
		String user = scan.next();
		System.out.println("Enter the password of the new user");
		String pass = scan.next();
		AbstractUser newUse = new UserImpl(user, pass);
		DBUsers.addUser(newUse);
		
		// Защо когато в кода има scan.close(); дава грешка: Exception in thread
		// "main" java.util.NoSuchElementException
		// scan.close();
	}

	@Override
	public void deleteUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user who want to remove:");
		String user = scan.next();
		if(	DBUsers.removeUser(user)){
			System.out.println("Successfully removed");
		}else{
			System.out.println("No such user");
		}

	}

}
