package AnimalZoo;

public class cow extends herbivores{
	
	public cow(){
		age = 10;
		animalType = "������";
	}
	
	public void live() {
		if (age == 0) {
			old();
		}
		move();
		eatHerb();
		sleep();
		age-=1;
	}
	
}
