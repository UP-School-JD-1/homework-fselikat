package hw_06_01_exceptions;



public class TestPayrollOffice {

	public static void main(String[] args) {
		PayrollOffice payrollOffice = new PayrollOffice();


		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		System.out.println(m1.toString());
		try {
			payrollOffice.paySalary(m1); // Employee employee = m1;
		}
		catch(SalaryPaidOnBankException e) {
			e.printStackTrace();
		}

		Director d1 = new Director(3, "Mehmet", 20, "Management", "Management", 10000);
		System.out.println(d1.toString());
			 // Employee employee = d1;
		try {
			payrollOffice.paySalary(d1); // Employee employee = m1;
		}
		catch(SalaryPaidOnBankException e) {
			e.printStackTrace();
		}


	}

}
