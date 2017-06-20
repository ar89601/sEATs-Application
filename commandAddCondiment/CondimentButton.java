/**
 * @author Ashley.Ridout
 * @date June 5, 2017
 */
package commandAddCondiment;

// invoker class
public class CondimentButton {
	private Command command;
	// set method
	public void setCommand(Command command){
		this.command = command;
	}
	// method to execute command
	public void pressButton(){
		command.execute();
	}
}
