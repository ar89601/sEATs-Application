/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package currencyExchange;

public class DollarExchange extends CurrencyExchangeAlgorithm {
	double dollar = 1;
	
	public double getDollar(){
		return dollar;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:dollar is 1:1.");
	}
	
	@Override
	void exchange(double price){
		
	}
	@Override
	void print(double price){
		System.out.println("Your order is already in dollar currency.");
	}
}
