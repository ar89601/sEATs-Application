/**
 * @author Ashley.Ridout
 * @date May 20, 2017
 *
 */
package orderStyle;

public class MenuOrderStyle implements OrderStyle {
	// create order based on the menu order style
	public Order createOrder() {
		return new MenuOrder();
		
	}

}
