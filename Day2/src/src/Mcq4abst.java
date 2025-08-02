package src;

abstract class Parent {
    abstract void show();
}

class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
}
public class Mcq4abst {
	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
	}
	

}
