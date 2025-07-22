package Day3;
abstract class Employees{
	String name;
	int empId;
	public Employees(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}
	abstract double CalculateSalary();
	public void display() {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name"+ name);
	}
}
class FulltimeEmp extends Employees{
	double monthlySalary;
	public FulltimeEmp(String name, int empId, double monthlySalary) {
		super(name, empId);
		this.monthlySalary = monthlySalary;
	}
	@Override
	double CalculateSalary() {
		return monthlySalary;
	}
}
class ParttimeEmp extends Employees{
	int hoursWorked;
	double rateperHour;
	public ParttimeEmp(String name, int empId, int hoursWorked, double rateperHour) {
		super(name, empId);
		this.hoursWorked = hoursWorked;
		this.rateperHour = rateperHour;
	}
	@Override
	double CalculateSalary() {
		return hoursWorked * rateperHour;
	}
}
public class PayrollSystem {
	public static void main(String[] args) {
		Employees e1 = new FulltimeEmp("Rahul", 007, 55000);
		Employees e2 = new ParttimeEmp("Sai", 001, 5, 500);
		e1.display();
		System.out.println("Salary: " + e1.CalculateSalary());
		System.out.println();
		e2.display();
		System.out.println("Salary: " + e2.CalculateSalary());
		
		
	}

}
