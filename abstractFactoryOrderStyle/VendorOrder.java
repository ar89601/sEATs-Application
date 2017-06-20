/**
 * @author Ashley.Ridout
 * @date May 20, 2017
 *
 */
package abstractFactoryOrderStyle;

public class VendorOrder implements Order {
	// specific methods for vendor order
	static final String TITLE = "Please choose a vendor to start your order.";

	@Override
	public String getTitle() {
		return TITLE;
	}

	static final String NAME = "Hot Diggity Dog \nStarboard Concessions \nPort Concessions";

	@Override
	public String getName() {
		return NAME;
	}
}
