package carNew;

public class Car {

	private int horsePower = 200, fuelbankSize = 150, leftFuel, speed;
	private String color = "red";
	public final String mark = "Porsche";
	
	public void setStats(String color, int fuelbankSize, int horsePower) {
		
		switch (color){
		case "red":
		case "green":
		case "blue":
			this.color = color;
			System.out.println("���� ������� �������");
			break;
		default:
			System.out.println("����������� ����������");
		}
		this.horsePower = horsePower;
		this.fuelbankSize = fuelbankSize;
		leftFuel = fuelbankSize;
		
	}
	
	public void pushPedal() {
		workEngine();
		
	}
	public void relisePedal() {
		stopEngine();
	}

	public void refill() {

		leftFuel = fuelbankSize;
		System.out.println("�� �����������. � ���� ������ " + fuelbankSize + " ������");
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	private void stopEngine() {
		// TODO Auto-generated method stub
		stopWheels();
	}

	private void stopWheels() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= speed/50; i++) {
			System.out.println("������ ���������������... ������ �������� ����� " + (speed - i*50) + " ��/�");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void workEngine() {
		if(leftFuel > 0) {
			System.out.println("������ �������� ��������");
			rotateWheels();
		}
		else {
			System.out.println("���������� �����������!");
		}
	}

	private void rotateWheels() {
		for(int i = 0; i < 10; i++) {
			speed+=horsePower/10;
			leftFuel -=1;
			System.out.println("�������� ����� " + speed + " ��/�");
			System.out.println("�������� " + leftFuel + " ������ �������");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
