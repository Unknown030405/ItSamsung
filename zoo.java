import AnimalZoo.*;

public class zoo {

	public static void main(String[] args) {
		cow Murenka = new cow();
		horse Burushka = new horse();
		tortois Cherepaha = new tortois();
		felisCatus Barsik = new felisCatus();
		beagle Sharik = new beagle();
		Murenka.live();
		Burushka.live();
		Cherepaha.live();
		Barsik.live();
		Sharik.live();
		Murenka.age = 1;
		Murenka.live();
		Murenka.live();
		Burushka.age = 0;
		Burushka.live();
	}

}
