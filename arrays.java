public class arrays {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int[] i: arr) {
			for(int j: i) {
				System.out.print(j);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
