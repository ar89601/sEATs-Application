/**
 * @author Ashley.Ridout
 * @date June 5, 2017
 */
package commandAddCondiment;

import java.util.Scanner;

public class Client {

	//main method to add and remove mayo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menuItem;
		String input;
		
		// construct button object
		CondimentButton button = new CondimentButton();
		// construct mayo object
		Mayo mayo = new Mayo();
		// construct command objects
		Command addMayo = new AddMayo(mayo);
		Command removeMayo = new RemoveMayo(mayo);
		
		// output to console
		System.out.println("Please type a menu item.");
		menuItem = scan.nextLine();
		
		// add Mayo
		System.out.println("You have selected " + menuItem + ". Type 'add mayo' to add mayo to your " + menuItem +".");
		input = scan.nextLine();
		
		if(input.equalsIgnoreCase("add mayo")){
		button.setCommand(addMayo);
		button.pressButton();
		// all other input is inaccurate
		}else{
			System.out.println("Please retry by typing 'add mayo'.");
			System.exit(0);
			}
		
		// remove Mayo
		System.out.println("Type 'remove mayo' to remove mayo from your " + menuItem +".");
		input = scan.nextLine();
		if(input.equalsIgnoreCase("remove mayo")){
			button.setCommand(removeMayo);
			button.pressButton();
			// all other input is inaccurate
			}else{
				System.out.println("Please retry by typing 'remove mayo'.");
				System.exit(0);
				}
		scan.close();
	}
}
