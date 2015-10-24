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
	
	public void insert(String name, String gender, String CPF, 
			String motherName, String fatherName, String address,
			String neighborhood, String birthPlace, String zipCode,
			String maritalStatus, String birthDate, String phoneNumber) {
		p.setName(name);
		p.setGender(gender);
		p.setCPF(CPF);
		p.setMotherName(motherName);
		p.setFatherName(fatherName);
		p.setAddress(address);
		p.setNeighborhood(neighborhood);
		p.setBirthPlace(birthPlace);
		p.setZipCode(zipCode);
		p.setMaritalStatus(maritalStatus);
		p.setBirthDate(birthDate);
		p.setPhoneNumber(phoneNumber);
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
			pd.create(this.p);
			cs.close();
		} catch (SQLException | IOException e) {
			System.err.printf("Patient insert failed (%s)", e.toString());
			e.printStackTrace();
		}
	}
}
