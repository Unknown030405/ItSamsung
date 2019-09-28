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
			System.out.println("Двери закрыты. Сесть в машину невозможно");
		}
		else {
			System.out.println("Вы сели в машину");
		}
	}
	
	public void getOut() {
		if(body.doors.locked) {
			System.out.println("Двери закрыты. Выйти из машины невозможно");
		}
		else {
			System.out.println("Вы вышли из машины");
		}
	}
}
