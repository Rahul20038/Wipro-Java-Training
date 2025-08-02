package Day6;

public class SavingsAcc implements Bank{
	private double balance;
	public SavingsAcc(double initialBalance) {
		this.balance = initialBalance;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in your account");
		}
	}
	@Override
	public void DisplayAccType() {
		System.out.println("Account Type: Savings Account.");
	}

}
