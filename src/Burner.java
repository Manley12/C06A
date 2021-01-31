/*
 * 
 * Setting ENUM 
 *  
 * @author Justin Orji
 * @author Gregory Manley
 * 
 */
public class Burner {
	// Temperature ENUM
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	
	// Burner Constructor
	public Burner() {
		super();
		// Set temperature to cold and setting to off to begin with
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	// Setup variables for Burner
	public final static int TIME_DURATION = 2;
	private int timer = TIME_DURATION;
	private Setting mySetting;
	private Temperature myTemperature;
	
	// return the temperature when asked
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	public void plusButton() {
		// Switch statement to increase temperature when the plus button is activated 
		switch (mySetting) {
			case OFF: mySetting = Setting.LOW;
				break;
			case LOW: mySetting = Setting.MEDIUM;
				break;
			case MEDIUM: mySetting = Setting.HIGH;
				break;
			case HIGH: mySetting = Setting.HIGH;
				break;
		}
	}
	
	public void minusButton() {
		// Switch statement to decrease temperature when the minus button is activated 
		switch (mySetting) {
			case OFF: mySetting = Setting.OFF;
				break;
			case LOW: mySetting = Setting.OFF;
				break;
			case MEDIUM: mySetting = Setting.LOW;
				break;
			case HIGH: mySetting = Setting.MEDIUM;
				break;
		}
	}

	public void updateTemperature() {
		if (mySetting == Setting.OFF) {
			myTemperature = Temperature.valueOf("COLD");
		} else if (mySetting == Setting.LOW) {
			myTemperature = Temperature.valueOf("WARM");
		} else if (mySetting == Setting.MEDIUM) {
			myTemperature = Temperature.valueOf("HOT");
		} else if (mySetting == Setting.HIGH) {
			myTemperature = Temperature.valueOf("BLAZING");
		}
		if(timer == 0) timer = TIME_DURATION;
		timer--;
	}
	
	public boolean redHot() {
		// Test if a burner is Blazing to output warning
		if (myTemperature == Temperature.valueOf("BLAZING")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void display() {
		// Test what temperature it is currently and output information to the Standard output
		if (myTemperature == Temperature.valueOf("COLD")) {
			System.out.println("[---].....cooool");
		} else if (myTemperature == Temperature.valueOf("WARM")) {
			System.out.println("[--+].....warm");
		} else if (myTemperature == Temperature.valueOf("HOT")) {
			System.out.println("[-++].....CAREFUL");
		} else if (myTemperature == Temperature.valueOf("BLAZING")) {
			System.out.println("[+++].....VERY HOT! DON'T TOUCH");
		}
	}
	
}
