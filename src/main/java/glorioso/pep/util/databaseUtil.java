package glorioso.pep.util;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import glorioso.pep.model.entity.Patient;

public class databaseUtil {
	
	public static void initialSetup() {
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			TableUtils.createTableIfNotExists(cs, Patient.class);
			System.out.println("Initial database setup succesful!");
			cs.close();
		} catch (SQLException | IOException e) {
			System.err.printf("Initial database setup failed (%s)", e.toString());
			e.printStackTrace();
		}
	}
}
