package Day6;
class Devices{
	final String devname;
	Devices(String n){
		this.devname = n;
	}
	public void showDev(){
		System.out.println("The device is "+devname);
	}
}
public class Finalkey {
	public static void main(String[] args) {
		Devices d1 = new Devices("RealMee");
		Devices d2 = new Devices("Samsung");
		d1.showDev();
		d2.showDev();
		d1.devname = "Iphone";
		
	}
}
