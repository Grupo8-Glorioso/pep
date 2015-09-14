package glorioso.pep.util;

import java.sql.*;
import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		try {
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pep", "root", "");
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}