/**
 * @author Ashley.Ridout
 * @date May 22, 2017
 *
 */
package abstractFactoryOrderStyle;

import java.util.Scanner;

public class Application {

	// main method to create order based on user selection
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		Client client = new Client();
		OrderStyle orderStyle = null;

		// output to console
		System.out.println("Please select if you would like to order by Menu by typing 'M' or by Vendor by typing 'V'.");
		input = scan.nextLine();

		// if user wants to order by menu
		if ("m".equalsIgnoreCase(input)) {
			orderStyle = new MenuOrderStyle();
			client.buildOrder(orderStyle);
			System.out.println("You have chosen to order by menu.\n" + MenuOrder.TITLE + "\n" + MenuOrder.NAME);
		}
		// if user wants to order by vendor
		else if ("v".equalsIgnoreCase(input)) {
			orderStyle = new VendorOrderStyle();
			client.buildOrder(orderStyle);
			System.out.println("You have chosen to order by vendor.\n" + VendorOrder.TITLE +"\n" + VendorOrder.NAME);

		// all other input is incorrect
		} else {
			System.out.println("Please retry by typing 'M' or 'V'.");
			System.exit(0);
		}
		scan.close();
	}
}
