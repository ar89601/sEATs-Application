/**
 * @author Ashley.Ridout
 * @date May 22, 2017
 *
 */
package orderStyle;

// class to build the order
public class Application {
	private Order order;

	public void buildOrder(final OrderStyle style){
		setOrder(style.createOrder());
	}
	
	Order getOrder(final OrderStyle style){
		return style.createOrder();
	}
	
	public Order getOrder(){
		return order;
	}
	
	private void setOrder(final Order order){
		this.order = order;
	}
}
