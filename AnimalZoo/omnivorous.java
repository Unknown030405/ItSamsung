package AnimalZoo;

public class omnivorous extends Animal{

	public void eat() {
		System.out.println(animalType + " ест все, что поадается на глаза");
	}
	
	@Override
	public void move() {
		System.out.println(animalType + " лениво тащится");
//		super.move();
	}
	
}
