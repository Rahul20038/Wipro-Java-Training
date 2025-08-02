package Day6;

public interface Bank {
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount);
	default void DisplayAccType() {
		System.out.println("Account Type: Generic Bank Account.");
	}
	default void executeTansaction(String type, double amount) {
		if (!Bank.isValid(amount)) {
			System.out.println("Invalid Amount: "+amount);
			return;
		}
		switch(type.toUpperCase()) {
		case "DEPOSIT":
			deposit(amount);
			System.out.println("Deposited $ "+amount+" Net Blance $ "+getBalance());
			break;
		case "WITHDRAW":
			withdraw(amount);
			System.out.println("Withdraw $ "+amount+" NetBalance $ "+getBalance());
			break;
		default:
			System.out.println("Unknown Transaction type: "+type);
		}
	}
	static boolean isValid(double amount) {
		return amount>0;
	}

}
