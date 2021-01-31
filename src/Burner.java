public class Burner {
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	
	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	public final static int TIME_DURATION = 2;
	private int timer = TIME_DURATION;
	private Setting mySetting;
	private Temperature myTemperature;
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	
	
	public void plusButton() {
		/*if (mySetting == Setting.OFF) {
			mySetting = Setting.LOW;
		} else if (mySetting == Setting.LOW) {
			mySetting = Setting.MEDIUM;
		} else if (mySetting == Setting.MEDIUM) {
			mySetting = Setting.HIGH;
		} else if (mySetting == Setting.HIGH) {
			
		}*/
		
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
		/*if (mySetting == Setting.OFF) {
	
		} else if (mySetting == Setting.LOW) {
			mySetting = Setting.OFF;
		} else if (mySetting == Setting.MEDIUM) {
			mySetting = Setting.LOW;
		} else if (mySetting == Setting.HIGH) {
			mySetting = Setting.MEDIUM;
		}*/
		
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
		timer--;
		if(timer == 0) {
			
		}
	}
	
	public boolean redHot() {
		if (myTemperature == Temperature.valueOf("BLAZING")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void display() {
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
