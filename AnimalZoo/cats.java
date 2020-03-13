package AnimalZoo;

public class cats extends hunters{
	
	public void DrinkMilk() {
		System.out.println(animalType + "Пьет молоко");
	}
	
	@Override
	public void eatMeat() {
		System.out.println(animalType + " ест мышку!!!");
//		super.eatMeat();
	}
}
