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
			System.out.println("Цвет успешно изменен");
			break;
		default:
			System.out.println("Перекрасить невозможно");
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
		System.out.println("Вы заправились. В баке теперь " + fuelbankSize + " литров");
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
			System.out.println("машина остонавливается... сейчас скорость равна " + (speed - i*50) + " км/ч");
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
			System.out.println("Машина начинает движение");
			rotateWheels();
		}
		else {
			System.out.println("Необходимо заправиться!");
		}
	}

	private void rotateWheels() {
		for(int i = 0; i < 10; i++) {
			speed+=horsePower/10;
			leftFuel -=1;
			System.out.println("Скорость равна " + speed + " км/ч");
			System.out.println("Осталось " + leftFuel + " литров бензина");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
