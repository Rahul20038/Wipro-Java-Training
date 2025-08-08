package Day5;
import java.util.*;
public class TimerTask {
	public static void main(String[] args) {
		Timer timer = new Timer();
		setActivity(timer, 8, 0, "Hey Its breakfast time Rahul");
		setActivity(timer, 9, 0, "Its time to join the Meeting Rahul!!");
		setActivity(timer, 13, 0, "Hey Its time for the Lunch Rahul");
		setActivity(timer, 16, 45, "Hey its Snacks time");
		setActivity(timer, 18, 0, "Time to play Game!!!!!!");
	}
	public static void setActivity(Timer timer, int hour, int minute, String message) {
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.MINUTE, minute);
		time.set(Calendar.SECOND, 0);
		Date targetTime = time.getTime();
		if (targetTime.before(new Date())) {
			time.add(Calendar.DATE,1);
			targetTime = time.getTime();
		}
		timer.schedule(new java.util.TimerTask() {
			public void run() {
				System.out.println(message);
			}
		}, targetTime);
		System.out.println("Scheduled: "+ message + "at " + targetTime);
	}
}
