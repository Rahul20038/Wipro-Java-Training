package Day3;

public class Mainacc {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Rahul", 1500);
		account.deposit(15000);
		account.withdraw(5000);
		account.displayDetails();
	}
}
