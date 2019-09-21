import java.util.*;

public class XO {
	
	static int[][] gameBoard = new int[3][3];
	Scanner scan = new Scanner(System.in);
	String playerX = "X", playerO = "O", currentPlayer = playerX;
	static int c,X,Y;

	public static void main(String[] args) {
		while(win() != 0 && c < 9) {
			
		}
	}
	static int win() {
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != 0) {
			return gameBoard[0][0];
		}
		for(int i = 0; i < 3; i++) {
			if( gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2] && gameBoard[i][0] != 0) {
				return gameBoard[i][0];
			}
		}
		return 0;
	}
	
	static void drawGB() {
		for(int[] i: gameBoard) {
			System.out.println(" -----");
			for(int j: i) {
				System.out.print("|");
				switch(j) {
				case 0:
					System.out.print(" ");
					break;
				case 1:
					System.out.print("X");
					break;
				case 2:
					System.out.print("O");
					break;
				}
			}
			System.out.println("|");
		}
		System.out.println(" -----");
	}

}
