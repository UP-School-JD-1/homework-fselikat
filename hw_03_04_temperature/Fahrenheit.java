package hw_03_04_temperature;

public class Fahrenheit extends DegreeUnit {
	public Fahrenheit () {
		
	}
	public Fahrenheit(double degree) {
		super(degree);
		
	}
	@Override
	public double convert(DegreeUnit degreeUnit) {
		if(degreeUnit instanceof Celcius) {
		
			double c = (degree-32)/1.8;
			return c;
			
		}
		else if(degreeUnit instanceof Kelvin) {
			double k =(5/9)* (degree - 32) + 273.15;
			return k;
		}
		else
			return degree;
		
	}

}
