package Day8;

class Mt3 implements Runnable{
	public void run() {
		for(int i=1;i<10;i++) {
		System.out.println("Thread-3 is running");
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class Mt4 implements Runnable{
	public void run() {
		for(int i=1;i<10;i++) {
		System.out.println("Thread-4 is running");
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
public class MultiThreading2 {
	public static void main(String[] args) {
		Runnable m1 = new Mt3();
		Runnable m2 = new Mt4();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}

}
