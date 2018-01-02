package test;

import java.io.Console;
import java.util.Scanner;

public class ReadPassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = null;
		username = scanner.nextLine();
		Console console = System.console();
		if (console != null) {
		    username = console.readLine("User name：");
		    System.out.println(username);
		}

		//char[] password = console.readPassword("Password：");
		//System.out.println(password);
	}

}
