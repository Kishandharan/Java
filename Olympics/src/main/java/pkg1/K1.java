package pkg1;
import java.util.Scanner;
import java.io.IOException;
import java.net.URL;

public class K1 {
	public static void main(String[] args) throws IOException {
		String api = "https://api.ipify.org";
		URL url1 = new URL(api);
		Scanner sc1 = new Scanner(url1.openStream(), "UTF-8");
		System.out.println("My current IP address is " + sc1.next());

	}
}
