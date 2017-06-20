/**
 * @author Ashley.Ridout
 * @date June 3, 2017
 */
package currencyExchange;

public class EuroExchange extends CurrencyExchangeAlgorithm {
	double euro = 0.89;
	
	public double getEuro(){
		return euro;
	}
	
	@Override
	void displayExchangeRate(){
		System.out.println("The exchange rate for dollar:euro is 1:0.89.");
	}
	
	
	@Override
	void exchange(double price){
		this.price = price;
		double newPrice = price * euro;	
	}	
	
	@Override
	void print(double price){
		this.price = price;
		double newPrice = price * euro;
		System.out.println("Your order has been changed from $" + price + " to €" + newPrice);
	}
	
}
