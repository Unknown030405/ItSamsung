import java.util.*;

public class arrays {
	public static void main(String[] args) {
		int[] arr = new int[12];
		arr = randomarr();
		int mx = 0;
		int ind_mx = 0;
		for(int i = 0; i < 12; i++) {
			if(arr[i] >= mx) {
				mx = arr[i];
				ind_mx = i;
			}
		}
		System.out.println(mx);
		System.out.println(ind_mx);
		for(int i: arr) {
			System.out.print(i);
			System.out.print(' ');
		}
	}
	static int[] randomarr() {
		int[] ar = new int[12];
		for(int i = 0; i < 12; i++) {
			ar[i] = randint();
		}
		return ar;
	}
	static int randint() {
		Random rand = new Random();
		int i = rand.nextInt(16);
		int a = rand.nextInt(2);
		if (a == 0) {
			return i;
		}
		return -i;
	}
}
