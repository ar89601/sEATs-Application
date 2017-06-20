/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 *
 */
package observer;

public class FrenchFryObserver extends MenuItemObserver{
	// original price of fries
	double price = 1.50;
	
	// method to get price
	public double getPrice(){
		return price;
	}
	
	// constructor
	public FrenchFryObserver(Source source){
		this.source = source;
		this.source.attach(this);
	}
	
	// update to discounted price method
	@Override
	public void update() {
		System.out.println("Fries Sale Price: $" + price *(1 - (source.getState())));
	}
}
