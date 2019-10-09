import carNew.Car;

public class driverCarNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setStats("green", 200, 500);
		System.out.println("Ваша машина " + car.getColor() + " цвета");
		car.pushPedal();
		System.out.println("Сейчас скорость равна " + car.getSpeed() + " км/ч");
		car.relisePedal();
		car.refill();
	}

}
