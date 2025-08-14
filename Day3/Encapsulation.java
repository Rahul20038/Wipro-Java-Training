package Day3;
class Employee{
	private String name;
	private double salary;
	public void setName(String n) {
		name = n;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Rahul");
		emp1.setSalary(55000);
		emp1.display();
	}

}
