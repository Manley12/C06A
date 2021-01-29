public class Burner {
	public enum Temperature{BLAZING, HOT, WARM, COLD};
	
	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
	}
	
	private Temperature myTemperature;
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	public final static int TIME_DURATION = 2;
	
	public void plusButton() {
		
	}
	
	public void minusButton() {
		
	}

	public void updateTemperature() {
		
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
		} else {
		}
	}
	
}
