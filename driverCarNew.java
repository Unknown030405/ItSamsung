import carNew.Car;

public class driverCarNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setStats("green", 200, 500);
		System.out.println("���� ������ " + car.getColor() + " �����");
		car.pushPedal();
		System.out.println("������ �������� ����� " + car.getSpeed() + " ��/�");
		car.relisePedal();
		car.refill();
	}

}
