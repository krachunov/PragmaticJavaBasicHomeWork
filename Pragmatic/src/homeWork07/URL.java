package homeWork07;

public class URL {

	public static void main(String[] args) {
		// [protocol]://[server]/[resource]
		String urlAdreess = "http://www.google.com/path/to/resource?arg=1";
		String[] partOfUrl = urlAdreess.split("[:/]+");
		String protocol = partOfUrl[0];
		String server = partOfUrl[1];
		String resource = urlAdreess.substring((urlAdreess.indexOf(server))
				+ (server.length()));

		System.out.println("Protocol is: " + protocol);
		System.out.println("The server is: " + server);
		System.out.println("The resource: " + resource);
	}

}
