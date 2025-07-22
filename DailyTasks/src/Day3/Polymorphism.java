package Day3;
class Shape{
	void draw() {
		System.out.println("Drawing a shape.");
	}
}
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Circle.");
	}
}
class Cube extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing a Cube.");
	}
} 
public class Polymorphism {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Cube();
		Shape s3 = new Shape();
		s1.draw();
		s2.draw();
		s3.draw();
	}

}
