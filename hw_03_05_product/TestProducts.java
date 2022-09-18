package hw_03_05_product;
import java.util.Date;

public class TestProducts {
	public static void main(String[] args) {
		ClothProduct cloth1= new ClothProduct("Kot Pantolon","123654",239.90,19.90,"Güzelyalı","A-1","Erkek","XL");
		FoodProduct food1= new FoodProduct("Konserve bezelye","8695963",24.10,4.89,"Liman","C-12",new Date(2022),2);
		Gift gift1=new Gift("sürpriz yılbaşı hediyesi", "5451742","Uncalı","S-07");
		System.out.println(cloth1.toString());
		cloth1.getDepot();
		cloth1.purchase();
		System.out.println(food1.getDescription());
		food1.getPrice();
		food1.purchase();
		System.out.println(gift1.toString());
		gift1.getDepot();
	}

}
