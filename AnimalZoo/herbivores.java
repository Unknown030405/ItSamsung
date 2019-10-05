package AnimalZoo;

public class herbivores extends Animal{

	public void eatHerb() {
		System.out.println(animalType + " ест траву");
	}
	
	@Override
	public void old() {
		System.out.println(animalType + " слишком сильно растолстела и разленилась");
//		super.old();
	}
}
