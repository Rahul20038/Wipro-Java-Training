package Day4;
interface EcomarcesPayment{
	void makePayment();
}
abstract class PaymentSystems implements EcomarcesPayment{
	double amount;
	PaymentSystems(double amount){
		this.amount = amount;
	}
	void showSuccessMessage() {
		System.out.println("Payment is successfull "+amount);
	}
}
class DebitCardPayment extends PaymentSystems{
	DebitCardPayment(double amount){
		super(amount);
	}
	public void makePayment() {
		System.out.println("Debit card Payment is done...");
		showSuccessMessage();
	}
}
class NetBankingPayment extends PaymentSystems{
	NetBankingPayment(double amount){
		super(amount);
	}
	public void makePayment() {
		System.out.println("NetBanking Payment is done...");
		showSuccessMessage();
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		PaymentSystems ip = new DebitCardPayment(45000);
		ip.makePayment();
		System.out.println();
		PaymentSystems ip2 = new NetBankingPayment(50000);
		ip2.makePayment();
	}

}
