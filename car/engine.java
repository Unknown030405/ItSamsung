package car;

public class engine {
	Wheel frontwheel = body.frontWheels;
	Wheel backwheel = body.backWheels;
	fuelBank bank = body.bank;
	public void drive() {
		if(!body.doors.locked) {
			System.out.println("Двери открыты. Движение невозможно");
			return;
		}
		if(bank.left == 0) {
			System.out.println("Нет Топлива!!!");
			return;
		}
		if(bank.left < bank.Size/3) {
			System.out.println("Осталось не много топлива! Необходима заправка!");
		}
		bank.drive();
		frontwheel.rotate();
		backwheel.rotate();
		System.out.println("Машина двигается!");
	}
	public void stop() {
		frontwheel.stopRotate();
		backwheel.stopRotate();
		System.out.println("Машина остановлена!");
	}
}
