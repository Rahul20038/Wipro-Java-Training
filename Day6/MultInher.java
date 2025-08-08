package Day6;

public class MultInher {
	public static void main(String[] args) {
		Device speaker = new Device();
		speaker.Power();
		speaker.dev_name("Rahuls-Bot");
		speaker.Wificonn();
		BtDevice.Bt();
		speaker.PlayMusic();
	}
}
