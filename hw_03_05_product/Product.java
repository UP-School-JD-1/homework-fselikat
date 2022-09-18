package hw_03_05_product;

public abstract class Product extends Items implements Priceable {
	String sku;
	double price;
	double tax;
	
	
	public Product(String description, String sku, double price, double tax) {
		super(description);
		this.sku=sku;
		this.price=price;
		this.tax=tax;
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
		
	}
}
