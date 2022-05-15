package task;

public class Tool {

	private String name;
	private String purpose;
	private int quantity;

	public Tool(String name, String purpose, int quantity) {
		this.name = name;
		this.purpose = purpose;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
