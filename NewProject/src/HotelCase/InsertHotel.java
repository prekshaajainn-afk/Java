package HotelCase;
import java.sql.*;
import java.util.Scanner;
//before display hotel we need to add hotel one by one
public class InsertHotel {
	public static void addHotel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hotel name: ");
		String name = sc.next();
		System.out.println("enter room type: ");
		String room = sc.next();
		System.out.println("enter price: ");
		float price = sc.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hotel", "root","passwd");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM hotel;");
		}
		catch (Exception e) {
			
		}
	}
}
