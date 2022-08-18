package hw_12_1_shape;

import java.util.Objects;

public class Shape {
	protected String shape;
	public Shape(String shape) {
		this.shape=shape;
		
	}
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	void draw() {
		System.out.println(shape+" şekli çiziliyor.");
	}
	void erase() {
		System.out.println(shape+" şekli siliniyor.");
	}
	double calculateArea() {
		System.out.println(shape+" şeklinin alanı hesaplanıyor.");
		return 0;
	}
	double calculateCircumference() {
		System.out.println(shape+" şeklinin çevresi hesaplanıyor.");
		return 0;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(shape);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Objects.equals(shape, other.shape);
	}

	@Override
	public String toString() {
		return "Shape [shape=" + shape + "]";
	}
	

}
