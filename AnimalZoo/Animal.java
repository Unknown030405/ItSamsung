package AnimalZoo;

public class Animal {
	
	public  String animalType;
	public int age;
	public String color;
	
	public void move() {
		System.out.println(animalType + " �������� � ���� �������");
	}
	
	public void sleep() {
		System.out.println(animalType + " ����");
	}
	
	public void play() {
		System.out.println(animalType + " ������");
	}
	
	public void old() {
		System.out.println(animalType + "������� ����, ����� ���-�� ������");
	}
	
}
