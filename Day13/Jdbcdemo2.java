package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo2 {
	 public static void main(String[] args) throws SQLException {
	        String url = "jdbc:mysql://localhost:3306/jdbc";
	        String userName = "root";
	        String pwd = "Rahul@sql1";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            System.err.println("MySQL driver not found");
	            e.printStackTrace();
	            return;
	        }

	        try (Connection con = DriverManager.getConnection(url, userName, pwd);
	             Statement st = con.createStatement()) {

	            // Create table
	            String user = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20), age INT)";
	            st.executeUpdate(user);
	            System.out.println("Table 'users' is created.");

	            // Insert data using PreparedStatement
	            String val = "INSERT INTO users(name, age) VALUES (?, ?)";
	            try (PreparedStatement ps = con.prepareStatement(val)) {
	                ps.setString(1, "Rahul");
	                ps.setInt(2, 22);
	                ps.addBatch();

	                int[] arr = ps.executeBatch();
	                System.out.printf("Inserted rows: %d%n", java.util.stream.IntStream.of(arr).filter(c -> c > 0).count());
	            }

	            // Fetch and display data
	            String query = "SELECT * FROM users";
	            try (ResultSet rs = st.executeQuery(query)) {
	                while (rs.next()) {
	                    int id = rs.getInt("id");
	                    String name = rs.getString("name");
	                    int age = rs.getInt("age");
	                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
