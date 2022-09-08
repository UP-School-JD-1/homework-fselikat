package hw_12_1_shape;

import java.util.Objects;

public class Rectangle extends Shape {
	protected int longEdge;
	protected int shortEdge;
	public Rectangle( int longEdge, int shortEdge) {
		super("Dikdörtgen");
		this.longEdge=longEdge;
		this.shortEdge=shortEdge;
		
		
	}
	public int getLongEdge() {
		return longEdge;
	}
	public void setLongEdge(int longEdge) {
		this.longEdge = longEdge;
	}
	public int getShortEdge() {
		return shortEdge;
	}
	public void setShortEdge(int shortEdge) {
		this.shortEdge = shortEdge;
	}
	@Override
	void draw() {
		System.out.println(shape+" şekli çiziliyor.");
	}
	@Override
	void erase() {
		System.out.println(shape+" şekli siliniyor.");
	}
	
	@Override
	public double calculateArea() {
		double area=shortEdge*longEdge;
		System.out.println(shape+" şeklinin alanı hesaplanıyor.");
		
		return area;
	}
	@Override
	double calculateCircumference () {
		double circumference = 2*(shortEdge*longEdge);
		System.out.println(shape+" şeklinin çevresi hesaplanıyor.");
		return circumference;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(longEdge, shortEdge);
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
		Rectangle other = (Rectangle) obj;
		return longEdge == other.longEdge && shortEdge == other.shortEdge;
	}
	@Override
	public String toString() {
		return "Rectangle [longEdge=" + longEdge + ", shortEdge=" + shortEdge + "]";
	}
	

}
