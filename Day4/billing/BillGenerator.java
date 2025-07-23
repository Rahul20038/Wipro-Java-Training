package billing;
@FunctionalInterface
public interface BillGenerator {
	void generate(double amount);
	default void showBillFormat() {
		System.out.println("******* BILL RECEIPT ******");
	}
	static void displayHeader() {
		System.out.println("Welcome to Online Billing System");;
	}

}
