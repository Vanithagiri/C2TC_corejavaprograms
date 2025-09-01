package jdbc;
import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) {
		// Database credentials
		String url ="jdbc:postgresql://localhost:5432/Employee"; // Change database name
		String user= "postgres"; // Change to your PostgreSQL username
		String password ="vanitha123@"; // Change to your PostgreSQL password
		
		// JDBC variables
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Load PostgreSQL JDBC Driver
			Class.forName("org.postgresql.Driver");
			// Establish Connection
			conn =DriverManager.getConnection(url, user, password);

			// Create Statement
			stmt =conn.createStatement();

			// Execute Query
			String query ="SELECT * FROM students";
			rs=stmt.executeQuery(query);
			
			// Process the result set
			System.out.println("Student Details:");
			System.out.println("--");
			while (rs.next()) {
				int id =rs.getInt("id");
				String name= rs.getString("name");
				int age =rs.getInt("age");
				String grade= rs.getString("grade");
				
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
}