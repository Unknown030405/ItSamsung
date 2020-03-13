package AnimalZoo;

public class cow extends herbivores{
	
	public cow(){
		age = 10;
		animalType = "Корова";
	}
	
	public void live() {
		if (age <= 0) {
			old();
			return;
		}
		move();
		eatHerb();
		sleep();
		age-=1;
	}
	
}
