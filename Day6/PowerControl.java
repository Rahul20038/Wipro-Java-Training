package Day6;

public interface PowerControl {
	default void Power() {
		System.out.println("Power is ON.");
	}

}
