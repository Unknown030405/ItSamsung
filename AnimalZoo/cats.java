package AnimalZoo;

public class cats extends hunters{
	
	public void DrinkMilk() {
		System.out.println(animalType + "���� ������");
	}
	
	@Override
	public void eatMeat() {
		System.out.println(animalType + " ��� �����!!!");
//		super.eatMeat();
	}
}
