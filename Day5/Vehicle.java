package Day5;
abstract class Vehicle_d{
	abstract void start();
	abstract void speed();
}
class Car extends Vehicle_d{
	void start() {
		System.out.println("Car was Strted");
	}
	void speed() {
		System.out.println("The speed of car was 120km/hr");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		Vehicle_d v1 = new Car();
		v1.start();
		v1.speed();
	}

}
