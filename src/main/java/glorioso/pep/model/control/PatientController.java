package glorioso.pep.model.control;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import glorioso.pep.model.entity.Patient;

public class PatientController {
	private Patient p;
	
	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public void insert(Patient p) {
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
			pd.create(p);
			cs.close();
		} catch (SQLException | IOException e) {
			System.err.printf("Patient insert failed (%s)", e.toString());
			e.printStackTrace();
		}
	}
}
