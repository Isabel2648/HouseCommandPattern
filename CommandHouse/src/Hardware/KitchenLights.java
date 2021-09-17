package Hardware;

public class KitchenLights {
	private int brightness;
	
	public int getBrightness() {
		return brightness;
	}
	
	public void setBrightness(int brightness) {
		System.out.println("Setting brightness to: " + brightness);
	}
	
	public void on() {
		System.out.println("Kitchen Lights Turned ON");
	}
	
	public void off() {
		System.out.println("Kitchen Lights Turned OFF");
	}

}
