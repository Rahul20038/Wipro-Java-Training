package bank;

public abstract class Payment {
	protected double amount;
	public Payment(double amount) {
		this.amount = amount;
	}
	public void printReceipt() {
		System.out.println("Payment of $"+amount +" Processed");
	}
	public abstract void makePayment();

}
