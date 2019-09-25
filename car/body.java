package car;

public class body {
	static doors doors = new doors();
	static Wheel frontWheels = new Wheel(24);
	static Wheel backWheels = new Wheel(24);
	static controller control = new controller();
	static fuelBank bank = new fuelBank(100);
	static engine engine = new engine();
}
