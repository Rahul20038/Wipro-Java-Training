package Day13;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbcdemo1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String userName="root";
			String pwd="Rahul@sql1";
			String query="select * from students";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,pwd);
			Statement st=(Statement) con.createStatement();
//			st.executeQuery(query);
			ResultSet rs=st.executeQuery(query);
			while (rs.next()) {
				System.out.println("ID: "+rs.getString(1)+" Name "+rs.getString(2));
			}
			st.close();
			con.close();
			
		}
	}

