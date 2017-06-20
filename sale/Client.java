/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 *
 */
package sale;

import java.util.Scanner;

public class Client {
	// main method to add discount to multiple menu items
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		double discount;
		 
		// constructor objects
		Source source = new Source();
		PizzaObserver pizza = new PizzaObserver(source);
		FrenchFryObserver fries = new FrenchFryObserver(source);
		CheeseburgerObserver burger = new CheeseburgerObserver(source);
		
		// output to console
		System.out.println("Welcome to sEATs. Please type 'display' to see menu items and price.");
		input = scan.nextLine();
		
		//display original price
		if(input.equalsIgnoreCase("display")){
			System.out.println("Original price of pizza: $ " + pizza.getPrice() +"\nOriginal price of fries: $ " + fries.getPrice() +
				"\nOriginal price of cheeseburger: $ " + burger.getPrice() +"\n");
		// all other input is incorrect
		} else {
			System.out.println("Please retry by typing 'display'.");
			System.exit(0);
			}
		
		System.out.println("Please type 'add sale' if you wish to discount these items.");
		input = scan.nextLine();
		
		//if you want to add a discount to all menu items in this package
		if(input.equalsIgnoreCase("add sale")){
			System.out.println("Please enter the amount you wish to discount the sale as a decimal. "
					+ "For example, a 5% sale would be entered as ‘.05’.");
			discount = scan.nextDouble();
		
			System.out.println("Sale price: " + discount);
			source.setState(discount);
			
			System.out.println("\nIf you'd like to set another sale price, please enter the sale discount as a decimal.");
			discount = scan.nextDouble();
			
			System.out.println("Sale price: " + discount);
			source.setState(discount);

		// all other input is incorrect
		} else {
				System.out.println("Please retry by typing 'add sale'.");
				System.exit(0);
				}
		scan.close();
	}
}
