package AnimalZoo;

public class horse extends herbivores{
	
	public horse(){
		age = 20;
		while(age != 0) {
			move();
			eatHerb();
			move();
			sleep();
			move();
			sleep();
			
			age-=1;
		}
	}

}
