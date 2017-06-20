/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package templateCurrencyExchange;

import java.util.Scanner;

public class Client {
	// main method to change currency to preferred currency
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String p;
			String input;
			String moneyType;
			
			// objects from constructors
			EuroExchange euroX = new EuroExchange();
			PoundExchange poundX = new PoundExchange();
			DollarExchange dollarX = new DollarExchange();
			
			// output to console
			System.out.println("Please enter the price of your order.");
			p = scan.nextLine();
			double price = Double.parseDouble(p);
			
			System.out.println("Your order costs $" + price +". Please type 'exchange' to change to another currency.");
			input = scan.nextLine();
			
			// user can exchange currency by typing 'exchange'
			if(input.equalsIgnoreCase("exchange")){
				System.out.println("Please type the currency in which to pay for your order: 'dollar', 'euro' or 'pound'.");
				
			// all other input is incorrect
			} else {
				System.out.println("Please retry by typing 'exchange'.");
				System.exit(0);
				}
			
			//if user enters 'euro', 'pound' or 'dollar', appropriate handleRequest method runs 
			moneyType = scan.nextLine();
			if(moneyType.equalsIgnoreCase("euro")){
				euroX.exchange(price);
				euroX.handleRequest();
			}
			else if(moneyType.equalsIgnoreCase("pound")){
				poundX.exchange(price);
				poundX.handleRequest();
			}
			else if(moneyType.equalsIgnoreCase("dollar")){
				poundX.exchange(price);
				dollarX.handleRequest();
				
			// all other input is incorrect
			} else {
				System.out.println("Please retry by typing 'dollar', 'euro' or 'pound'.");
				System.exit(0);
				}
			scan.close();
		}
}
