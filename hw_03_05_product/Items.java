package hw_03_05_product;

public abstract class Items {
	String description;
	public Items(String description) {
		this.description=description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
