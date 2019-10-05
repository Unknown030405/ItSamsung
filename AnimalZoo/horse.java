package AnimalZoo;

public class horse extends herbivores{
	
	public horse(){
		age = 20;
		animalType = "Лошадь";
	}
	public void live() {
		if (age == 0) {
			old();
			return;
		}
		move();
		eatHerb();
		move();
		sleep();
		move();
		sleep();	
		age-=1;
	}

}
