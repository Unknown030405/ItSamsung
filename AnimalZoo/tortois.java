package AnimalZoo;

public class tortois extends omnivorous{
	
	public tortois() {
		age = 50;
		animalType = "���������";
	}
	
	public void live() {
		if (age == 0) {
			old();
			return;
		}
		sleep();
		eat();
		move();
		eat();
		play();
		sleep();
		age-=1;
	}
	
}
