package Day5;


interface Systems{
	public void SystemType();
	public void SystemSpeed();
}

class Desktop implements Systems{
	public void SystemType() {
		System.out.println("System: Desktop.");
	}
	public void SystemSpeed() {
		System.out.println("Speed: Faster.");
	}
}
class Laptop implements Systems{
	public void SystemType(){
		System.out.println("System: Laptop");
	}
	public void SystemSpeed() {
		System.out.println("Speed: Slower");
	}
}


public class Computer {
	public static void main(String[] args) {
		Systems s1 = new Desktop();
		s1.SystemType();
		s1.SystemSpeed();
		Systems s2 = new Laptop();
		s2.SystemType();
		s2.SystemSpeed();
	}
}
