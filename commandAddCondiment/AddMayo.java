/**
 * @author Ashley.Ridout
 * @date June 5, 2017
 */
package commandAddCondiment;

// concrete command AddMayo
public class AddMayo implements Command {
	// Mayo object
	Mayo mayo;
	
	// constructor
	public AddMayo(Mayo mayo){
		this.mayo = mayo;
	}
	
	// execute method
	public void execute(){
		mayo.putsMayoOn();
	}
}
