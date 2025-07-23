package bank;

public class UpiPayment extends Payment{
	public UpiPayment(double amount) {
		super(amount);
	}
	@Override
	public void makePayment() {
		System.out.println("Processing UPI Payment...");
		printReceipt();
	}

}
