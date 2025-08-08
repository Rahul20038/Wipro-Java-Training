package Day6;

class Device implements PowerControl, Wifi {
	final void dev_name(String n) {
		System.out.println("Device name was - "+n);
	}
	@Override
	public void Wificonn() {
		System.out.println("Wifi was Connected Successfullt to = Jio");
	}
	@Override
	public void Power() {
		System.out.println( "Device Power is On ");
		PowerControl.super.Power();
	}
	public void PlayMusic() {
		System.out.println("Coolie - Power House Song Playing");
	}
} 
