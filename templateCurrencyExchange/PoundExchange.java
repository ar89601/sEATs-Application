/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package templateCurrencyExchange;

public class PoundExchange extends CurrencyExchangeAlgorithm {
	double pound = 0.77;
	
	public double getEuro(){
		return pound;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:pound is 1:0.77.");
	}
	
	@Override
	void exchange(double price){
		this.price = price;
		double newPrice = price * pound;
	}
	@Override
	void print(double price){
		this.price = price;
		newPrice = price * pound;
		System.out.println("Your order has been changed from $" + price + " to £" + newPrice);
	}
}
