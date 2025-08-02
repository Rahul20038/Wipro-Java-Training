package Day8;
class Mt1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Thread-1 is running.");	
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
}
class Mt2 extends Thread{
	public void run() {
		for(int i =1;i<=10;i++) {
		System.out.println("Thread-2 is running.");
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
public class MultiThreading1 {
	public static void main(String[] args) {
		Mt1 m1 = new Mt1();
		Mt2 m2 = new Mt2();
		m1.start();
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		m2.start();
		
	}
}
