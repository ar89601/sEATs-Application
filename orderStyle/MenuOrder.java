/**
 * @author Ashley.Ridout
 * @date May 20, 2017
 *
 */
package orderStyle;

public class MenuOrder implements Order {

	// specific methods for menuOrder
	static final String TITLE = "Please choose a menu selection to see which vendors offer this item.";

	@Override
	public String getTitle() {
		return TITLE;
	}

	static final String NAME = "Hot dog \nHamburger \nCheeseburger \nCoke";

	@Override
	public String getName() {
		return NAME;
	}
}
