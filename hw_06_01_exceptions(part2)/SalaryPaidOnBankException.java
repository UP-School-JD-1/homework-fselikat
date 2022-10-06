package hw_06_01_exceptions;

public class SalaryPaidOnBankException extends ArithmeticException {

	@Override
	public void printStackTrace() {
		System.out.println("Maaşınızı bankadan almalısınız.");
	}
	

}
