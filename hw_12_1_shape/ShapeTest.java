package hw_12_1_shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape circle1= new Circle(10);
		Shape circle2= new Circle(15);
		Shape rectangle1= new Rectangle(9,7);
		Shape rectangle2= new Rectangle(9,7);
		Shape square1= new Square(4);
		Shape square2= new Square(9);
		Shape triangle1= new Triangle(3,4,5);
		Shape triangle2= new Triangle(5,12,13);
		
		
		System.out.println("**************************DAİRE**************************");
		
		circle1.draw();
		System.out.println("dairenin alanı: " +circle1.calculateArea());
		System.out.println("dairenin çevresi: " +circle1.calculateCircumference());
		System.out.println(circle2.toString());
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(circle1.hashCode()==circle2.hashCode());
		System.out.println(circle1.equals(circle2));
		circle1.erase();
		
		System.out.println("**************************DİKDÖRTGEN**************************");
		
		rectangle1.draw();
		System.out.println("dikdörtgenin alanı: " +rectangle1.calculateArea());
		System.out.println("dikdörtgenin çevresi: " +rectangle1.calculateCircumference());
		System.out.println(rectangle1.toString());
		System.out.println(rectangle1.hashCode());
		System.out.println(rectangle2.hashCode());
		System.out.println(rectangle1.hashCode()==rectangle2.hashCode());
		System.out.println(rectangle1.equals(rectangle2));
		rectangle1.erase();
		
		System.out.println("**************************KARE**************************");
		
		square1.draw();
		System.out.println("karenin alanı: " +square1.calculateArea());
		System.out.println("karenin çevresi: " +square1.calculateCircumference());
		System.out.println(square1.toString());
		System.out.println(square1.hashCode());
		System.out.println(square2.hashCode());
		System.out.println(square1.hashCode()==square2.hashCode());
		System.out.println(square1.equals(square2));
		square1.erase();
		
System.out.println("**************************ÜÇGEN**************************");
		
		triangle1.draw();
		System.out.println("üçgenin alanı: " +triangle1.calculateArea());
		System.out.println("üçgenin çevresi: " +triangle1.calculateCircumference());
		System.out.println(triangle1.toString());
		System.out.println(triangle1.hashCode());
		System.out.println(triangle2.hashCode());
		System.out.println(triangle1.hashCode()==triangle2.hashCode());
		System.out.println(triangle1.equals(triangle2));
		triangle1.erase();
		
		
		

	}

}
