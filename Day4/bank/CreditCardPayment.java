package bank;

public class CreditCardPayment extends Payment {
	public CreditCardPayment(double amount) {
		super(amount);
	}
	@Override
	public void makePayment() {
		System.out.println("Processing Credit Card Payment...");
		printReceipt();
	}
}
