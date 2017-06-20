/**
 * @author Ashley.Ridout
 * @date June 5, 2017
 */
package commandAddCondiment;

public class RemoveMayo implements Command {
	// Mayo object
		Mayo mayo;
		
		// constructor
		public RemoveMayo(Mayo mayo){
			this.mayo = mayo;
		}
		
		// execute method
		public void execute(){
			mayo.takesMayoOff();
		}
	}

