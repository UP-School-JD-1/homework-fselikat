package hw_06_01_exceptions;

public class PayrollOffice {
	
//	public void paySalary(Employee e){
//		double salary = e.calculateSalary();
//		System.out.println("Paying a salary of " + salary + " to " + e.getName());
//	}
	
	public void paySalary(Employee e) {
		double salary = e.calculateSalary();
		
		if(salary >= 7000) {
			throw new SalaryPaidOnBankException();
		}
		else
		
			if(e instanceof Director){
				System.out.println("\n*************************");
				System.out.println("Hosşeldiniz efen'im");
				System.out.println("Buyrun maaşınız: " + salary);
				System.out.println("*************************\n");
			}
			else
				System.out.println("Paying a salary of " + salary + " to " + e.getName());
		}
	
}
