package car;

public class doors {
	boolean locked = false;
	public void lock() {
		locked = true;
		System.out.println("����� �������.");
	}
	public void unlock() {
		locked = false;
		System.out.println("����� �������.");
	}
}
