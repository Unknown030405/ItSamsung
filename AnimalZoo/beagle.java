package AnimalZoo;

public class beagle extends dogs{

	public beagle() {
		age = 15;
		animalType = "�����";
	}
	
	@Override
	public void play() {
		super.play();
		System.out.println(animalType + " ������� �����, � ������� �����...");
	}

	public void live() {
		if (age == 0) {
			old();
			return;
		}
		eatMeat();
		defend();
		move();
		defend();
		eatMeat();
		sleep();
		play();
		age-=1;
	}
	
}
