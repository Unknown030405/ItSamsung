package car;

public class fuelBank {
	int Size;
	int left;
	fuelBank(int Size){
		this.Size = Size;
		left = Size;
	}
	
	public void refill(){
		left = Size;
		System.out.println("�� �����������. ������ � ���� " + Size + " ������");
	}
	
	public void drive() {
		left-=1;
	}
}
