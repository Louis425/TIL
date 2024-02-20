package ex11;

public class Main {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(10000);
		park.deposit(20000);
		
		yoon.withdraw(2000);
		park.withdraw(3000);
		
		yoon.checkMyBank();
		park.checkMyBank();
	}
}
