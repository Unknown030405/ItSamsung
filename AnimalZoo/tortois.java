package AnimalZoo;

public class tortois extends omnivorous{
	
	public tortois() {
		age = 50;
		animalType = "Черепашка";
	}
	
	public void live() {
		if (age == 0) {
			old();
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
