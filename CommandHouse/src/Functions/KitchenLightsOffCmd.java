package Functions;

import Hardware.KitchenLights;

public class KitchenLightsOffCmd implements Command {
	KitchenLights kitchenLights;
	
	public KitchenLightsOffCmd(KitchenLights kitchenLights) {
		this.kitchenLights= kitchenLights;
	}
	
	public void execute() {
		kitchenLights.setBrightness(0);
		kitchenLights.off();	
	}

}
