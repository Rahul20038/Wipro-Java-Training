package Day4;
abstract class Payment{
	double amount;
	Payment(double amount){
		this.amount = amount;
	}
	abstract void makePayment();
	void showSuccessMessage() {
		System.out.println("Payment successfull "+amount);
	}
}
class CreditCardPayment extends Payment{
	CreditCardPayment(double amount){
		super(amount);
	}
	void makePayment() {
		System.out.println("Credit card payment is done....");
	}
}
class UpiPayment extends Payment{
	UpiPayment(double amount){
		super(amount);
	}
	void makePayment() {
		System.out.println("Upi payment is done....");
	}
}
public class Payments {
	public static void main(String[] args) {
		Payment py = new CreditCardPayment(55000);
		py.makePayment();
		System.out.println("Credit Card Payment Process is Completed ");
		Payment py2 = new UpiPayment(45700);
		py2.makePayment();
		System.out.println("Upi payment process is completed ");

	}

}
