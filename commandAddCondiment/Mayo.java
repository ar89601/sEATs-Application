/**
 * @author Ashley.Ridout
 * @date June 5, 2017
 */
package commandAddCondiment;

// receiver
public class Mayo {
	private boolean on;
	// addMayo method
	public void putsMayoOn(){
		on = true;
		System.out.println("Mayo has been added to your menu item.");
	}
	// removeMayo method
	public void takesMayoOff(){
		on = false;
		System.out.println("Mayo has been removed from your menu item.");
	}
}
