import java.sql.*;
import java.util.Scanner;

public class Sql {

	public static void main(String[] args) {
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection connect = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Unknown030405\\Desktop\\sql lite\\players.db");
			System.out.println("Connection done!");
			
			Scanner scan = new Scanner(System.in);
			
			String name = scan.nextLine();
			String nick = scan.nextLine();
			String clas = scan.nextLine();
			String input = "INSERT INTO players(realName, nickName, class) VALUES ('" + name + "', '" + nick + "', '" + clas + "');";
			
			scan.close();
			
			connect.createStatement().executeUpdate(input);
			
			System.out.println("Added");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
