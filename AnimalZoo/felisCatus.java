package AnimalZoo;

public class felisCatus extends cats{

	public felisCatus() {
		animalType = "���������� �������������� �����";
		age = 10;
	}
	
	public void live() {
		if (age == 0) {
			old();
		}
		eatMeat();
		sleep();
		eatMeat();
		sleep();
		move();
		DrinkMilk();
		age-=1;
	}
	
}
