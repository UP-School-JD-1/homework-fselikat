package hw_12_1_shape;

import java.util.Objects;

public class Circle extends Shape {
	protected int radius;
	
	public Circle(int radius) {
		super("Daire");
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println(shape +" şekli çiziliyor.");
	}
	@Override
	void erase() {
		System.out.println(shape +" şekli siliniyor.");
	}
	
	@Override
	public double calculateArea() {
		double area=Math.PI*Math.pow(radius, 2);
		System.out.println(shape + " şeklinin alanı hesaplanıyor.");
		
		return area;
	}
	@Override
	double calculateCircumference () {
		double circumference = 2*Math.PI*radius;
		System.out.println(shape+" şeklinin çevresi hesaplanıyor.");
		return circumference;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(radius);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
