package War;

public class Card {
	
	private int value;
	private String name;
	

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("the " + value + " of " + name);
		
	}

}
