package hw_11_1_account;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account1 = new Account(7200.25);
		Account account2 = new Account();
		AccountClient accountClient1 = new AccountClient("Asiye DEMİRTAŞ","151202031",account1);
		AccountClient accountClient2 = new AccountClient("Fatma Selika TUĞ","151202034",account2);
		accountClient1.withdrawMoney( 1997.50);
		accountClient2.depositMoney(953);
		accountClient1.transferMoney(account2, 200);
		
		
	

	}

}
