package Functions;

import Hardware.KitchenLights;
import Hardware.GarageDoor;

public class AllOffCommand implements Command {
	KitchenLights kitchenLights;
	GarageDoor garageDoor;
	
	public AllOffCommand(KitchenLights kitchenLights, GarageDoor garageDoor) {
		this.kitchenLights = kitchenLights;
		this.garageDoor = garageDoor;
		
	}
	
	public void execute() {
		System.out.println("-- TURNING IN FOR THE NIGHT --");
		garageDoor.close();
		kitchenLights.off();
		kitchenLights.setBrightness(0);
	}
	
}
