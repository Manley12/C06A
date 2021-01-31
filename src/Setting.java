/*
 * 
 * Setting ENUM 
 *  
 * @author Justin Orjis
 * @author Gregory Manley
 * 
 */
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	
	// Private variable setup
	private String input;

	// Constructor
	private Setting(String input) {
		this.input = input;
	}
	
	// toString method to output characters associated with a given Setting
	@Override
	public String toString() {
		if (Setting.OFF == Setting.valueOf(input)) {
			return "---";
		} else if (Setting.LOW == Setting.valueOf(input)) {
			return "--+";
		} else if (Setting.MEDIUM == Setting.valueOf(input)) {
			return "-++";
		} else if (Setting.HIGH == Setting.valueOf(input)) {
			return "+++";
		} else {
			return "";
		}
	}
	
}
