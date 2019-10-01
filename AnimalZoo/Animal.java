package AnimalZoo;

public class Animal {
	
	public  String animalType;
	public int age;
	public String color;
	
	public void move() {
		System.out.println(animalType + " движется в твою сторону");
	}
	
	public void sleep() {
		System.out.println(animalType + " спит");
	}
	
	public void play() {
		System.out.println(animalType + " играет");
	}
	
	public void old() {
		System.out.println(animalType + "Слишком стар, чтобы что-то делать");
	}
	
}
