/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 *
 */
package sale;

// abstract parent class for all observers
public abstract class MenuItemObserver {
		protected Source source;
		public abstract void update();
}
