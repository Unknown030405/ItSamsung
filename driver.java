import car.car;

public class driver {

	public static void main(String[] args) {
		car car = new car();
		
		car.getIn();
		car.drive();
		car.lock();
		car.drive();
		car.turn("лево");
		car.drive();
		car.stop();
		car.refill();
		car.getOut();
		car.unlock();
		car.getOut();
	}

}
