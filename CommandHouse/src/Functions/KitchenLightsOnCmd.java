package Functions;

import Hardware.KitchenLights;

public class KitchenLightsOnCmd implements Command {
	KitchenLights kitchenLights;
		
	public KitchenLightsOnCmd(KitchenLights kitchenLights) {
		this.kitchenLights= kitchenLights;
	}
	
	public void execute() {
		kitchenLights.on();
		kitchenLights.setBrightness(15);
	}

}
