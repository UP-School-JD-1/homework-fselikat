package hw_03_04_temperature;

public abstract class DegreeUnit implements Convertable{
	double degree;
	public DegreeUnit() {
		
	}
	public DegreeUnit(double degree) {
		this.degree=degree;
		
	}
	public double getDegree() {
		return degree;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	
	

}
