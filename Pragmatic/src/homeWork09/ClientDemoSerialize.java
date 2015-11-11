package homeWork09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ClientDemoSerialize {
	public static void main(String[] args) throws IOException,
			FileNotFoundException {

		Client clinet1 = new Client(123456789, "Hristo Krachunov",
				"0899999999", "email@mail.com", "Sofia");
		Client clinet2 = new Client(987654321, "Ivan Ivanov", "0899999999",
				"client2@mail.com", "Plovdiv");
		Client clinet3 = new Client(99999999, "Petur Petrov", "0899999999",
				"client3@mail.com", "Varna");
		Client clinet4 = new Client(123123123, "Georgi Georgiev ",
				"0899999999", "client4@mail.com", "Burgas");

		List<Client> listOfClients = new ArrayList<Client>();

		listOfClients.add(clinet1);
		listOfClients.add(clinet2);
		listOfClients.add(clinet3);
		listOfClients.add(clinet4);
		
		Client.serialize(listOfClients);
	}
}
