package Command;

import Functions.AllOffCommand;
import Functions.AllOnCommand;
import Hardware.GarageDoor;
import Hardware.KitchenLights;

public class Main {
	
	public static void main(String[] args) {
       
        AlexaDevice alexa = new AlexaDevice();
        GarageDoor garageDoor = new GarageDoor();
        KitchenLights kitchenLights = new KitchenLights();
        
        alexa.setCommand(
        		1, 
        		new AllOnCommand(kitchenLights, garageDoor),
        		new AllOffCommand(kitchenLights, garageDoor)
        	);
        
        System.out.println(alexa);
        
        alexa.activateSlot(1);
        alexa.deactivateSlot(1);
        
	}

}
