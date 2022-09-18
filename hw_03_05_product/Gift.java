package hw_03_05_product;

public class Gift extends Items implements Locatable {
	String sku;
	String depot;
	String place;
	public Gift(String description, String sku,String depot,String place) {
		super(description);
		this.sku=sku;
		this.depot=depot;
		this.place=place;
	}

	@Override
	public String getDepot() {
		System.out.println("Ürün "+ this.depot +" deposundadır.");
		return this.depot;
	}

	@Override
	public String getPlace() {
		System.out.println("Ürün depoda "+ this.place +" şubesindedir.");

		return this.place;
	}

	@Override
	public String toString() {
		return "Gift [sku=" + sku + ", depot=" + depot + ", place=" + place + ", description=" + description + "]";
	}
	

}
