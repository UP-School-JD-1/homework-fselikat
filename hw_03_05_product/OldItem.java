package hw_03_05_product;

public class OldItem extends Items implements Locatable,Priceable {
	double price;
	double tax;
	String depot;
	String place;
	public OldItem(String description,double price,double tax, String depot, String place) {
		super(description);
		this.price=price;
		this.tax=tax;
		this.depot=depot;
		this.place=place;
	}

	@Override
	public double getPrice() {
		System.out.println("Ürünün fiyatı kontrol ediliyor.");
		return this.price;
	}

	@Override
	public double getTax() {
		System.out.println("Ürünün vergisi hesaplanıyor.");
		return this.tax;
	}

	@Override
	public void purchase() {
		System.out.println("Eski eşyalar satıldı...");
		
	}

	@Override
	public String getDepot() {
		System.out.println("Ürün "+ this.depot +" deposundadır.");
		return this.depot;
	}

	@Override
	public String getPlace() {
		System.out.println("Ürün merkez şubededir");
		return this.place;
	}

	@Override
	public String toString() {
		return "OldItem [price=" + price + ", tax=" + tax + ", depot=" + depot + ", place=" + place + ", description="
				+ description + "]";
	}
	

}
