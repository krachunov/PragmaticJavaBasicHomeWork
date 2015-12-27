package edu.pragmatic.java.basics.serialize;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ClientDemoDeserialize {
	public static void main(String[] args) throws FileNotFoundException,
			ClassNotFoundException, IOException {
		List<Client> deserializedClient = Client.deserialize("ClientBackup");

		for (Client cient : deserializedClient) {
			System.out.println(cient.toString());
		}

	}
}
