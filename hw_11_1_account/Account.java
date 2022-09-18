package hw_11_1_account;

public class Account {
	double balance;
	Account (double balance){
		this.balance=balance;
	}
	Account (){
		balance=0;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*public double addition (double amount) {
		balance+=amount;
		return balance;
	}
	public double subtraction (double amount) {
		balance-=amount;
		return balance;
	}
	*/

}
	
