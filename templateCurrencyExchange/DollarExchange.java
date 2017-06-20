/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package templateCurrencyExchange;

public class DollarExchange extends CurrencyExchangeAlgorithm {
	double dollar = 1;
	
	public double getDollar(){
		return dollar;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:dollar is 1:1. Your order is already in dollar currency.");
	}
	
	@Override
	void exchange(double price){
		
	}
	@Override
	void print(double price){
		
	}
}
