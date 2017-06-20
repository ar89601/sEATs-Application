/**
 * @author Ashley.Ridout
 * @date May 28, 2017
 *
 */
package vendor;

import java.util.Scanner;

public class Client {
	// main method to create unique user name
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String input;
			String userName;
			VendorLogin register = null;
			
		// output to console
		System.out.println("Welcome to the sEATs registration page. Type 'register' to get started.");
		input = scan.nextLine();

		// if user wants to register
		if ("register".equalsIgnoreCase(input)) {
			System.out.println("Enter name.");
			input = scan.nextLine();
			System.out.println("Enter user name.");
			userName = scan.nextLine();
			
			//get Singleton
			register.getSingeltonOfUserName();
			//test Singleton performed as expected
			register.uniqueSingleton();
			input = scan.nextLine();
			System.out.println("Welcome to sEATs. Your user name is " + userName + ".");
			
		// all other input is incorrect
		} else {
			System.out.println("Please retry by typing 'register'.");
			System.exit(0);
				}
		scan.close();
		}
}
