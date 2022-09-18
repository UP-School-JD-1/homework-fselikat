package hw_03_05_product;

import java.util.Date;

public class FoodProduct extends Product implements Locatable{
	String depot;
	String place;
	Date productionDate;
	int life;
	
	public FoodProduct(String description, String sku, double price, double tax,String depot,String place, Date productionDate,int life) {
		super(description, sku, price, tax);
		this.depot=depot;
		this.place=place;
		this.productionDate= productionDate;
		this.life=life;
	}
	
	@Override
	public String getDepot() {
		System.out.println("Ürün "+ this.depot +" deposundadır.");
		return this.depot;
	}
	@Override
	public String getPlace() {
		System.out.println("Ürün "+ this.place +" şubesindedir");
		return this.place;
	}
	@Override
	public void purchase() {
		System.out.println("Ödeme başarılı. Afiyetle yiyin");
		
	}

	@Override
	public String toString() {
		return "FoodProduct [depot=" + depot + ", place=" + place + ", productionDate=" + productionDate + ", life="
				+ life + ", sku=" + sku + ", price=" + price + ", tax=" + tax + ", description=" + description + "]";
	}
	
	
	
	

}
