package AnimalZoo;

public class omnivorous extends Animal{

	public void eat() {
		System.out.println(animalType + " ��� ���, ��� ��������� �� �����");
	}
	
	@Override
	public void move() {
		System.out.println(animalType + " ������ �������");
//		super.move();
	}
	
}
