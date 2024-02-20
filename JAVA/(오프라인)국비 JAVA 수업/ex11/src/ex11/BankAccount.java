package ex11;

public class BankAccount {
	
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBank() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
