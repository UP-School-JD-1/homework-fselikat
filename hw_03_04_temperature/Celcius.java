package hw_03_04_temperature;

public class Celcius extends DegreeUnit {
	public Celcius() {
		
	}
	public Celcius(double degree) {
		super(degree);
	}
	@Override
	public double convert(DegreeUnit degreeUnit) {
		if(degreeUnit instanceof Fahrenheit) {
		
			double f = 1.8*degree + 32;
			return f;
			
		}
		else if(degreeUnit instanceof Kelvin) {
			double k =degree+273.15;
			return k;
		}
		else
			return degree;
		
	}

}
