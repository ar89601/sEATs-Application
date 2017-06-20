/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 *
 */
package observer;

public class CheeseburgerObserver extends MenuItemObserver {
	// original cheeseburger price
	double price = 6.00;
	
	// method to get price
	public double getPrice(){
		return price;
	}
	
	// constructor
	public CheeseburgerObserver(Source source){
		this.source = source;
		this.source.attach(this);
	}
	
	// update to discounted price method
	@Override
	public void update() {
		System.out.println("Cheeseburger Sale Price: $" + price *(1 - (source.getState())));
	}
}
