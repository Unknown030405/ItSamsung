package car;

public class fuelBank {
	int Size;
	int left;
	fuelBank(int Size){
		this.Size = Size;
	}
	
	public void refill(){
		left = Size;
	}
	
	public void drive() {
		left-=1;
	}
}
