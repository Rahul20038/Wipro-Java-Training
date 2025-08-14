package Day6;

public class BankMain {
	public static void main(String[] args) {
		Bank account = new SavingsAcc(1500);
		account.DisplayAccType();
		account.executeTansaction("deposit", 5000);
		account.executeTansaction("Withdraw", 2000);
		System.out.println("Final Balance: "+ account.getBalance());
	}

}
