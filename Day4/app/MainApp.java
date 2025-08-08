package app;
import bank.CreditCardPayment;
import bank.UpiPayment;
import billing.BillGenerator;
public class MainApp {
	public static void main(String[] args) {
		CreditCardPayment cpp = new CreditCardPayment(13000);
		cpp.makePayment();
		UpiPayment upi = new UpiPayment(5000);
		upi.makePayment();
		BillGenerator.displayHeader();
		BillGenerator bill = (amount) -> {
			System.out.println("Amount: $" + amount);
			System.out.println("Thank you for your Payment!!");
		};
		bill.showBillFormat();
		bill.generate(18000);
	}

}
