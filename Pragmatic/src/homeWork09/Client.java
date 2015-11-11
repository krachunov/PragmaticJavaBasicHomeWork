package homeWork09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client implements Serializable {
	private long accountNumber;
	private String fullName;
	private int ID;
	private String phone;
	private String email;
	private String address;

	// public static List<Client> clientList = new ArrayList();
	private static int IDgenerator = 0;

	public Client(long accountNumber, String fullName, String phone,
			String email, String addres) {
		setAccountNumber(accountNumber);
		setFullName(fullName);
		setID();
		setPhone(phone);
		setEmail(email);
		setAddress(addres);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getID() {
		return ID;
	}

	public void setID() {
		this.ID = IDgenerator++;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "AccNumber: " + accountNumber + " Full name: " + fullName;
	}

	public static void serialize(List client) throws IOException {
		File file = new File("ClientBackup");
		FileOutputStream fileOutput = new FileOutputStream(file);
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

		try {
			objectOutput.writeObject(client);
		} finally {
			if (fileOutput != null) {
				fileOutput.close();
			}
			if (objectOutput != null) {
				objectOutput.close();
			}
		}
	}

	public static List<Client> deserialize(String fileToDeserialize)
			throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(fileToDeserialize);
		ObjectInputStream objectImput = new ObjectInputStream(fileInput);
		try {
			List<Client> deserializeClient = (List<Client>) objectImput
					.readObject();
			return deserializeClient;
		} finally {
			if (fileInput != null) {
				fileInput.close();
			}
			if (objectImput != null) {
				objectImput.close();
			}
		}
	}

}
