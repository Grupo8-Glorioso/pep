import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class Main {

	public static void main() {
		Patient paciente = new Patient();
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:./pep.db");
			TableUtils.createTableIfNotExists(cs, Patient.class);
			Dao<Patient,Integer> patientDao = DaoManager.createDao(cs, Patient.class);
			patientDao.create(paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
