package car;

public class car {
	body body = new body();
	
	public void drive() {
		body.engine.drive();
	}
	
	public void turn(String side) {
		body.control.turn(side);
	}
	
	public void stop() {
		body.engine.stop();
	}
	
	public void lock() {
		body.doors.lock();
	}
	
	public void unlock() {
		 body.doors.unlock();
	}
	
	public void refill() {
		body.bank.refill();
	}
	
	public void getIn() {
		if(body.doors.locked) {
			System.out.println("����� �������. ����� � ������ ����������");
		}
		else {
			System.out.println("�� ���� � ������");
		}
	}
	
	public void getOut() {
		if(body.doors.locked) {
			System.out.println("����� �������. ����� �� ������ ����������");
		}
		else {
			System.out.println("�� ����� �� ������");
		}
	}
}
