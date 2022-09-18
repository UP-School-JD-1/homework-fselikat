package hw_12_1_shape;

import java.util.Objects;

public class Triangle extends Shape{
	protected int edgeA;
	protected int edgeB;
	protected int edgeC;
	public Triangle ( int edgeA, int edgeB, int edgeC) {
		super("üçgen");
		this.edgeA=edgeA;
		this.edgeB=edgeB;
		this.edgeC=edgeC;
		
	}
	public int getEdgeA() {
		return edgeA;
	}
	public void setEdgeA(int edgeA) {
		this.edgeA = edgeA;
	}
	public int getEdgeB() {
		return edgeB;
	}
	public void setEdgeB(int edgeB) {
		this.edgeB = edgeB;
	}
	public int getEdgeC() {
		return edgeC;
	}
	public void setEdgeC(int edgeC) {
		this.edgeC = edgeC;
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
		double s=(edgeA+edgeB+edgeC)/2;
		double area=Math.sqrt(s*(s-edgeA)*(s-edgeB)*(s-edgeC));
		System.out.println(shape+" şeklinin alanı hesaplanıyor.");
		
		return area;
	}
	@Override
	double calculateCircumference () {
		double circumference = edgeA+edgeB+edgeC;
		System.out.println(shape+" şeklinin çevresi hesaplanıyor.");
		return circumference;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(edgeA, edgeB, edgeC);
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
		Triangle other = (Triangle) obj;
		return edgeA == other.edgeA && edgeB == other.edgeB && edgeC == other.edgeC;
	}
	@Override
	public String toString() {
		return "Triangle [edgeA=" + edgeA + ", edgeB=" + edgeB + ", edgeC=" + edgeC + "]";
	}
	

}
