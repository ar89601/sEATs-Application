/**
 * @author Ashley.Ridout
 * @date June 1, 2017
 */
package observer;

import java.util.ArrayList;
import java.util.List;

// holds methods to update all observers with changes
public class Source {

	// array list to hold observers
	private List<MenuItemObserver> observers = new ArrayList<MenuItemObserver>();
	private double state;

	// method to return state
	public double getState() {
		return state;
	}

	// method to set state and notify observers
	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}

	// method to add observer to array list
	public void attach(MenuItemObserver observer) {
		observers.add(observer);
	}

	//method to notify observers of update
	public void notifyAllObservers(){
	    for (MenuItemObserver observer : observers) {
	        observer.update();
	    }
	}
}
