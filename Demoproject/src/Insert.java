import java.sql.*;
import java.util.Scanner;

public class Insert {
	static final String DB_url = "jdbc:mysql://localhost:3306/cogdb";
	static final String USER = "root";
	static final String PASS = "pass@word1";
	static final String QUERY = "insert into employees(empid,empname,empage,city,income ) values(?,?,?,?,?) ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DriverManager.getConnection(DB_url, USER, PASS);
				Statement stmt = con.createStatement();
				PreparedStatement ps = con.prepareStatement(QUERY);)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the empid\t\t :");
			int id = sc.nextInt();
			System.out.println("enter the empname :");
			String name = sc.next();
			System.out.println("enter the empage :");
			int age = sc.nextInt();
			System.out.println("enter the city :");
			String city = sc.next();
			System.out.println("enter the income :");
			int income = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, city);
			ps.setInt(5, income);
			//ps.executeUpdate();
			
			int rowsInserted = ps.executeUpdate();
				if (rowsInserted > 0) 
				{
				    System.out.println("A new user was inserted successfully\t\t!");
				}
			}
				catch(SQLException e) {
					
				}
			}
		
		
}	


