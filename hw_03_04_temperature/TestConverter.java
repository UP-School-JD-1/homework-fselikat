package hw_03_04_temperature;

public class TestConverter {

	public static void main(String[] args) {
		Fahrenheit f1= new Fahrenheit();
		Kelvin k1= new Kelvin();
		Celcius c1 =new Celcius ();
		
		Fahrenheit f2= new Fahrenheit(451);
		Kelvin k2= new Kelvin(0);
		Celcius c2 =new Celcius (100);
		System.out.println(f2.degree+" fahrenheit "+f2.convert(c1)+" celciustur");
		System.out.println(c2.degree+" celcius "+c2.convert(k1)+ " kelvindir.");
		System.out.println(k2.degree+ " kelvin "+k2.convert(f1)+" fahrenheittır.");
		
		
	}

}
