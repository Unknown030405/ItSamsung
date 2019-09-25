package car;

public class Wheel {
	int size;
	
	Wheel(int size){
		this.size = size;
	}
	
	public void rotate() {
		System.out.println(" олеса начали врашение...");
	}
	public void stopRotate() {
		System.out.println("колеса остановились...");
	}
}
