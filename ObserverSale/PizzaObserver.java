/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 *
 */
package observer;

public class PizzaObserver extends MenuItemObserver{
	// original price of pizza
	double price = 3.50;
	
	//method to get price
	public double getPrice(){
		return price;
	}
	
	// constructor
	public PizzaObserver(Source source){
		this.source = source;
		this.source.attach(this);
	}
	
	// update to discounted price method
	@Override
	public void update() {
		System.out.println("Pizza Sale price: $" + price *(1 - (source.getState())));
	}
}
