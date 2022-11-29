import java.sql.*;

public class Retrieve {
	static final String DB_url ="jdbc:mysql://localhost:3306/cogdb";
	static final String USER = "root";
	static final String PASS = "pass@word1";
	static final String QUERY = "select * from employees";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DriverManager.getConnection(DB_url, USER, PASS);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);)
		{
			while(rs.next())
			{
				System.out.println("EMPOLYEE ID : "+rs.getInt("empid"));
				System.out.println("EMPOLYEE NAME : "+rs.getString("empname"));
				System.out.println("EMPOLYEE AGE : "+rs.getInt("empage"));
				System.out.println("EMPOLYEE CITY : "+rs.getString("city"));
				System.out.println("EMPOLYEE INCOME : "+rs.getInt("income"));

			}
		}
		catch(SQLException e) {
			
		}
	}
}
