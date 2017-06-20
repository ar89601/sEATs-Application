/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package templateCurrencyExchange;

abstract class CurrencyExchangeAlgorithm {
	// final method to handle request that cannot be overridden
	double price;
	double newPrice;
	public final void handleRequest(){
		displayExchangeRate();
		exchange(price);
		print(price);
		endMessage();		
	}
	
	// abstract methods that will be implemented in the subclass
	abstract void displayExchangeRate();
	abstract void exchange(double price2);
	abstract void print(double price2);

	// common method for all implementations
	 void endMessage(){
		 System.out.println("Your order has been changed to your preferred currency.");
	 }
}
