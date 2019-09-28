package car;

public class doors {
	boolean locked = false;
	public void lock() {
		locked = true;
		System.out.println("Двери закрыты.");
	}
	public void unlock() {
		locked = false;
		System.out.println("Двери открыты.");
	}
}
