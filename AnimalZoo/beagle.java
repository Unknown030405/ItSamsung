package AnimalZoo;

public class beagle extends dogs{

	public beagle() {
		age = 15;
		animalType = "Бигль";
	}

	public void live() {
		if (age == 0) {
			old();
		}
		eatMeat();
		defend();
		move();
		defend();
		eatMeat();
		sleep();
		age-=1;
	}
	
}
