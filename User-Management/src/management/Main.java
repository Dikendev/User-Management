package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl= "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "pass";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			if (connection != null) {
				System.out.println("connected to database!!");
				connection.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
