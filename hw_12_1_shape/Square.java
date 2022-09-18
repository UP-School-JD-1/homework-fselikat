package hw_12_1_shape;

import java.util.Objects;

public class Square extends Shape {
	protected int edge;
	public Square(int edge) {
		super("Kare");
		this.edge=edge;
	}
	public int getEdge() {
		return edge;
	}
	public void setEdge(int edge) {
		this.edge = edge;
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
		double area=edge*edge;
		System.out.println(shape+" şeklinin alanı hesaplanıyor.");
		
		return area;
	}
	@Override
	double calculateCircumference () {
		double circumference = 4*edge;
		System.out.println(shape+" şeklinin çevresi hesaplanıyor.");
		return circumference;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(edge);
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
		Square other = (Square) obj;
		return edge == other.edge;
	}
	@Override
	public String toString() {
		return "Square [edge=" + edge + "]";
	}
	

}
