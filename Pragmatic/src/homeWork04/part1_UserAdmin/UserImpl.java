package homeWork04.part1_UserAdmin;

import java.util.Date;

public class UserImpl extends AbstractUser {

	public UserImpl() {
		super.userName = "defaultUser";
		super.password = "123";
		super.dataRegistration = new Date();
	}

	public UserImpl(String name, String pass) {
		super.userName = name;
		super.password = pass;
		super.dataRegistration = new Date();
	}

	@Override
	public String getPassword() {
		return super.password;
	}

	@Override
	public String getUserName() {
		return super.userName;
	}

	@Override
	public Date getDateRegistered() {
		return super.dataRegistration;
	}

	@Override
	public void logIn() {
		if(DBUsers.getUser(this.getUserName())){
			System.out.println("Hello User");
		}else{
			System.out.println("Please register first");
		}
		
	}

}
