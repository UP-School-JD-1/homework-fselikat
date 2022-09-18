package hw_03_04_temperature;

public class Kelvin extends DegreeUnit {
	public Kelvin() {
		
	}
	public Kelvin(double degree) {
		super(degree);
	}
	
	@Override
	public double convert(DegreeUnit degreeUnit) {
		if(degreeUnit instanceof Celcius) {
		
			double c = degree-273.15;
			return c;
			
		}
		else if(degreeUnit instanceof Fahrenheit) {
			double f =1.8 *(degree - 273.15) + 32;
			return f;
		}
		else
			return degree;
		
	}

}
