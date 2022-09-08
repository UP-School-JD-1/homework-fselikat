package hw_11_1_account;

public class AccountClient {
	double transferCost= 2.50;
	String nameSurname;
	String accountNumber;
	Account account;
	
	
	public AccountClient (String nameSurname, String accountNumber,Account account) {
		this.nameSurname=nameSurname;
		this.accountNumber=accountNumber;
		this.account=account;
		
	}
	public void withdrawMoney( double amount){
		System.out.println(" Hoşgeldiniz "+accountNumber +" müşteri numaralı Sayın "+nameSurname);
		System.out.println(" Mevcut bakiyeniz: "+account.getBalance());
		if (amount<=account.getBalance()) {
			account.setBalance(account.getBalance()-amount);
			System.out.println(amount+" tl hesabınızdan çekilmiştir. Mevcut bakiyeniz: "+account.getBalance());		
		}
		else {
			System.out.println("Mevcut bakiyenizden fazlasını çekemezsiniz ");
		

		}
	}
	public void depositMoney (double amount) {
		System.out.println(" Hoşgeldiniz "+accountNumber +" müşteri numaralı Sayın "+nameSurname);
		System.out.println(" Mevcut bakiyeniz: "+account.getBalance());
		account.setBalance(account.getBalance()+amount);
		System.out.println(amount+" tl hesabınıza yatırılmıştır. Mevcut bakiyeniz: "+account.getBalance());
	
	}
	public void transferMoney(Account account1, double amount) {
		System.out.println(" Hoşgeldiniz "+accountNumber +" müşteri numaralı Sayın "+nameSurname);
		System.out.println("Güncel bakiyeniz:"+account.getBalance());
		System.out.println("Havale yapılacak hesabın güncel bakiyesi:"+account1.getBalance());
		System.out.println(amount+"tl karşı tarafa havale ediliyor. İşlem ücreti : "+transferCost);
		account.setBalance(account.getBalance()-amount-transferCost);
		account1.setBalance(account1.getBalance()+amount);
		System.out.println("Güncel bakiyeniz:"+account.getBalance());
		System.out.println("Havale yapılmış hesabın güncel bakiyesi:"+account1.getBalance());
		
		
	}
}
 