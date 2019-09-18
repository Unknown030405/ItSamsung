import java.util.*;

public class arrays {
	public static void main(String[] args) {
		int n;
		while(true) {
			System.out.println("Enter number (length of an array): ");
			n = ask();
			if (n != -1){
				System.out.println("Generating...");
				break;
			}
			System.out.println("Error! Number shuld be more, than 3!");
		}
		int[] arr;
		arr = RandintArray(n);
		for(int i: arr) {
			System.out.print(i + " ");
		}
		int[] arr1;
		arr1 = evenFromArrays(arr,n);
		System.out.println(' ');
		for(int i: arr1) {
			if(i == -1) {
				break;
			}
			System.out.print(i + " ");
		}
	}
	private static int[] evenFromArrays(int[] arr, int n) {
		int[] even = new int[n];
		int c = 0;
		for(int i = 0; i < n; i++) {
			even[i] = -1;
		}
		for(int i: arr) {
			if(i%2 == 0) {
				even[c] = i;
				c++;
			}
		}
		return even;
	}
	private static int[] RandintArray(int n) {
		Random rand = new Random();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = rand.nextInt(n);
		}
		return ar;
	}
	static int ask() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<3) {
			return -1;
		}
		else {
			return n;
		}
	}
}
