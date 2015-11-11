package homeWork04.part1_UserAdmin;

import java.util.Date;

public abstract class AbstractUser implements IUser {

	public String userName;
	public String password;
	public Date dataRegistration;

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public Date getDataRegistration() {
		return dataRegistration;
	}

}
