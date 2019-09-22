import java.util.*;

public class XO {
	
	static int[][] gameBoard = new int[3][3];
	static Scanner scan = new Scanner(System.in);
	static String playerX = "X", playerO = "O", currentPlayer = playerX;
	static int c,x,y;

	public static void main(String[] args) {
		while(true) {
			drawGB();
			while(win() == 0 && c < 9) {
				c++;
				while(true) {
					System.out.println("Введите строку: ");
					x = scan.nextInt();
					if(x > 2) {
						System.out.println("Не верное число!");
						continue;
					}
					System.out.println("Введите столбец: ");
					y = scan.nextInt();
					if(y > 2) {
						System.out.println("Не верное число!");
						continue;
					}
					if(!isFree(x,y)) {
						System.out.println("Эта клетка занята!");
						continue;
					}
					break;
				}
				gameBoard[x][y] = currentPlayer == playerX ? 1 : 2;
				currentPlayer = currentPlayer == playerX ? playerO : playerX;
				drawGB();
			}
			switch(win()) {
			case 0:
				System.out.println("Ничья!");
				break;
			case 1:
				System.out.println("Победил 'X'!");
				break;
			case 2:
				System.out.println("Победил 'O'!");
				break;
			}
			System.out.println("Если хотите продолжить, введите 'yes' без кавычек, иначе введите 'stop' без кавычек");
			String ex = scan.next();
			if(ex.equalsIgnoreCase("stop")) {
				System.out.println("Спасибо за игру!");
				break;
			}
		}
	}
	private static boolean isFree(int one, int two) {
		return gameBoard[one][two] == 0;
	}
	static int win() {
		if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != 0) {
			return gameBoard[0][0];
		}
		for(int i = 0; i < 3; i++) {
			if( gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2] && gameBoard[i][0] != 0) {
				return gameBoard[i][0];
			}
			if(gameBoard[0][i] == gameBoard[1][i] && gameBoard [1][i] == gameBoard [2][i] && gameBoard[0][i] != 0) {
				return gameBoard[0][i];
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
