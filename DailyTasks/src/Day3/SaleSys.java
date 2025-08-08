package Day3;

public class SaleSys {
	public static void main(String[] args) {
		SaleItem[] items = {
				new SaleItem("Laptop", 55600, 2),
				new SaleItem("Phone", 36000, 1),
				new SaleItem("Case", 550, 1),
		};
		double grandTotal = 0;
		System.out.println("Product\tPrice\tQuantity\tTotal");
		System.out.println("--------------------------------");
		for (SaleItem item:items) {
			item.displayitem();
			grandTotal += item.getTotalPrice();
		}
		System.out.println("---------------------------------");
		System.out.println("Grand Total: "+grandTotal);
	}

}
