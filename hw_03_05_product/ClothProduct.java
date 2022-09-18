package hw_03_05_product;

public class ClothProduct extends Product implements Locatable, Priceable{
	String sex;
	String size;
	String depot;
	String place;
	public ClothProduct(String description, String sku, double price, double tax,String depot, String place,String sex, String size) {
		super(description, sku, price, tax);
		this.sex=sex;
		this.size=size;
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
		System.out.println("Ürün "+ this.place +" bölümündedir");
		return this.place;
	}

	@Override
	public void purchase() {
		System.out.println("Ödeme başarılı. Güzel günlerde giyin");

	
	}


	@Override
	public String toString() {
		return "ClothProduct [sex=" + sex + ", size=" + size + ", depot=" + depot + ", place=" + place + ", sku=" + sku
				+ ", price=" + price + ", tax=" + tax + ", description=" + description + "]";
	}
	

}
