package glorioso.pep.util;
import java.sql.*;
import com.mysql.jdbc.Connection;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("conexao ok");
		con.close();
	}
}