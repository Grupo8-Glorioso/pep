package glorioso.pep.model.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import glorioso.pep.model.entity.Patient;

public class PatientController {
	
	private String name;
	private String CPF;
	private String motherName;
	private String fatherName;
	private String address;
	private String neighborhood;
	private String birthPlace;
	private String zipCode;
	private String maritalStatus;
	private String birthDate;
	private String phoneNumber;
	private String gender;
	
	public String insert() {
		String result = verifyPatient(this.name, this.CPF, this.zipCode, this.phoneNumber);
	
		if (result == "ok") {
			Patient p = this.genPatient();
		
			try {
				ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
				Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
				pd.create(p);
				cs.close();
				result = "confCadPacientes";
			} catch (SQLException e) {
				System.err.printf("Patient insert failed (%s)\n", e.toString());
				e.printStackTrace();
				result = "error";
			}
		}
		
		return result;
	}
	
	public String read() {
		Patient p = this.genPatient();
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
			/* MONTAR A QUERY DO BANCO */
			cs.close();
			return "confReadPacientes";
		} catch (SQLException e) {
			System.err.printf("Patient read failed (%s)\n", e.toString());
			e.printStackTrace();
			return "error";
		}
	}
	
	public String verifyPatient(String name, String cpf, String zipCode, String phoneNumber){
		if (name == ""){
			return "name";
		} else if (cpf.length() != 11){
			return "cpf";
		} else if (zipCode.length() != 9){
			return "zipCode";
		} else if (phoneNumber.length() != 11){
			return "phoneNumber";
		}
		 
		return "ok";
	}
	
	public Patient genPatient() {
		Patient p = new Patient();
		p.setName(this.name);
		p.setCPF(this.CPF);
		p.setMotherName(this.motherName);
		p.setFatherName(this.fatherName);
		p.setAddress(this.address);
		p.setNeighborhood(this.neighborhood);
		p.setBirthPlace(this.birthPlace);
		p.setZipCode(this.zipCode);
		p.setMaritalStatus(this.maritalStatus);
		p.setBirthDate(this.birthDate);
		p.setPhoneNumber(this.phoneNumber);
		p.setGender(this.gender);
		return p;
	}
	
	public List<String> getGenders() {
	    List<String> genVal = new ArrayList<String>();
	    genVal.add(new String("Masculino"));
	    genVal.add(new String("Feminino"));
	    genVal.add(new String("Outro"));
	    return genVal;
	} 
	
	public List<String> getMaritalStatuss(){
		List<String> msVal = new ArrayList<String>();
		msVal.add(new String("Solteiro(a)"));
		msVal.add(new String("Casado(a)"));
		msVal.add(new String("Viúvo(a)"));
		msVal.add(new String("Divorciado(a)"));
	    
	    return msVal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cpf) {
		CPF = cpf;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static boolean isNumeric(String str) {
	    return str.matches("-?\\d+(.\\d+)?");
	}
}
