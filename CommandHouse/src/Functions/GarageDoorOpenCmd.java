package Functions;

import Hardware.GarageDoor;

public class GarageDoorOpenCmd implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCmd(GarageDoor garageDoor) { 
		this.garageDoor= garageDoor;
	}
			
	public void execute() {
		garageDoor.open();
	}

}
