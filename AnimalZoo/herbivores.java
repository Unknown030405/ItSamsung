package AnimalZoo;

public class herbivores extends Animal{

	public void eatHerb() {
		System.out.println(animalType + " ��� �����");
	}
	
	@Override
	public void old() {
		System.out.println(animalType + " ������� ������ ����������� � �����������");
//		super.old();
	}
}
