package hw_03_05_product;

public class Consultancy extends Product implements Priceable{

	public Consultancy(String description, String sku, double price, double tax) {
		super(description, sku, price, tax);
	}

	@Override
	public void purchase() {
		System.out.println("Bizi tercih ettiğiniz için teşekkürler.");

	}

	@Override
	public String toString() {
		return "Consultancy [sku=" + sku + ", price=" + price + ", tax=" + tax + ", description=" + description + "]";
	}
	

}
