package Day11;

import java.util.ArrayList;
import java.util.Collections;

public class Java_collections {
	class department{
		private String name;
		private double sales;
		private double expenses;
		public department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		public double getProfit() {
			return sales-expenses;
		}
		public String getName() {
			return name;
		}		
	}
	public static void main(String[] args) {
		ArrayList<department> dept = new ArrayList();
		dept.add(new Java_collections().new department("Sales", 25000, 20000));
		dept.add(new Java_collections().new department("Marketing", 30000, 22000));
		dept.add(new Java_collections().new department("R&D", 20000, 14000));

		for(department d:dept) {
			System.out.println(d.getName() + "Profit: "+d.getProfit());
		}
		dept.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));
		System.out.println("Sorting is done succesfully.");
		for(department d:dept) {
			System.out.println(d.getName() + "Profit: "+d.getProfit());
		}
	}
	
}
