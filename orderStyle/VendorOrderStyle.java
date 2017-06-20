/**
 * @author Ashley.Ridout
 * @date May 20, 2017
 *
 */
package orderStyle;

public class VendorOrderStyle implements OrderStyle {
	// create order based on the vendor order style
	public Order createOrder(){
		return new VendorOrder();	
	}
}
