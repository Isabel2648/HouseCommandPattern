package Functions;

import Hardware.KitchenLights;
import Hardware.GarageDoor;

public class AllOnCommand implements Command {
	KitchenLights kitchenLights;
	GarageDoor garageDoor;
	
	public AllOnCommand(KitchenLights kitchenLights, GarageDoor garageDoor) {
		this.kitchenLights = kitchenLights;
		this.garageDoor = garageDoor;
		
	}
	
	public void execute() {
		System.out.println("-- HOME FOR DINNER --");
		garageDoor.open();
		kitchenLights.on();
		kitchenLights.setBrightness(30);
				
	}

}
