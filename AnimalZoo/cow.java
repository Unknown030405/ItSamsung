package AnimalZoo;

public class cow extends herbivores{
	
	public cow(){
		age = 10;
		while(age != 0) {
			move();
			eatHerb();
			sleep();
			age-=1;
		}
	}

}
