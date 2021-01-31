
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String input;

	private Setting(String input) {
		this.input = input;
	}
	
	@Override
	public String toString() {
		return Setting.valueOf(input).name();
	}
	
}
