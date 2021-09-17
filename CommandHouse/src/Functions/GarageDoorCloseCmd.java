package Functions;

import Hardware.GarageDoor;

public class GarageDoorCloseCmd implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorCloseCmd(GarageDoor garageDoor) {
		this.garageDoor= garageDoor;
	}
	
	public void execute() {
		garageDoor.close();
	}

}
