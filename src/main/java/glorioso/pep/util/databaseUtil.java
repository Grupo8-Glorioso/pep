package glorioso.pep.util;

import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import glorioso.pep.model.entity.Patient;
import glorioso.pep.model.entity.Subjective;
import glorioso.pep.model.entity.Objective;

public class databaseUtil {
	
	public static void initialSetup() {
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			TableUtils.createTableIfNotExists(cs, Patient.class);
			TableUtils.createTableIfNotExists(cs, Subjective.class);
			TableUtils.createTableIfNotExists(cs, Objective.class);
			System.out.println("Initial database setup succesful!");
			cs.close();
		} catch (SQLException e) {
			System.err.printf("Initial database setup failed (%s)", e.toString());
			e.printStackTrace();
		}
	}
}
