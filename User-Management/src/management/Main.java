package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl= "jdbc:mysql://localhost:3306/sampledb";
		String dbUsername = "root";
		String dbPassword = "pass";
		
		String username = "Tuntun";
		String password = "0707";
		String fullname = "Cristina Freitas de Souza";
		String email = "Cris@cris.com";
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
		
			String sql = "INSERT INTO users (username, password, fullname, email)" 
			+ "VALUES(?,?,?,?)";
			
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1,username);
			statement.setString(2, password);
			statement.setString(3, fullname);
			statement.setString(4, email);
				
			int rows = statement.executeUpdate();
			
			if(rows > 0) {
				System.out.println("added row successfully");
			}
			
			connection.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
