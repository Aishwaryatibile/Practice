import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	static final String DB_url = "jdbc:mysql://localhost:3306/cogdb";
	static final String USER = "root";
	static final String PASS = "pass@word1";
	static final String QUERY = "select * from reg where email=? AND password=?;";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager.getConnection(DB_url, USER, PASS);
				Statement stmt = con.createStatement();
				PreparedStatement ps = con.prepareStatement(QUERY);) {
			Scanner sc = new Scanner(System.in);

			System.out.println("enter the email :");
			String email = sc.next();
			System.out.println("enter the password :");
			String pass = sc.next();

			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("login success");
			} else {
				System.out.println("login fail");
			}

		}

		catch (SQLException e) {

		}
	}
}
