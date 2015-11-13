package glorioso.pep.model.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
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
	
	private List<Patient> patientList;
	
	private String errorLabel;
	
	public String insert() {
		String result = verifyPatient(this.name, this.CPF, this.zipCode, this.phoneNumber);
		System.out.println(result);
		if (result == "ok") {
			Patient p = this.genPatient();
		
			try {
				ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
				Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
				
				QueryBuilder<Patient,Integer> qb = pd.queryBuilder();
				Where<Patient,Integer> where = qb.where();
				
				where.eq("CPF", p.getCPF());
				List<Patient> existsPatient = where.query();
				
				if (!existsPatient.isEmpty()){
					errorLabel = "Já existe esse usuário";
				} else {
					pd.create(p);
					result = "confCadPacientes";
				}
				
				cs.close();
			} catch (SQLException e) {
				System.err.printf("Patient insert failed (%s)\n", e.toString());
				e.printStackTrace();
				errorLabel = "Erro no banco";
			}
		} else {
			errorLabel = result;
		}
		
		System.out.println("O QUE ESTA RETORNANDO:" + result);
		return result;
	}
	
	public String read() {
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Patient,Integer> pd = DaoManager.createDao(cs, Patient.class);
			QueryBuilder<Patient,Integer> qb = pd.queryBuilder();
			Where<Patient,Integer> where = qb.where();
			
			int n = 0;
			if (this.name != "") {
				n++;
				where.eq("name", this.name);
			}
			if (this.CPF != "") {
				n++;
				where.eq("CPF", this.CPF);
			}
			if (this.motherName != "") {
				n++;
				where.eq("motherName", this.motherName);
			}
			if (this.fatherName != "") {
				n++;
				where.eq("fatherName", this.fatherName);
			}
			if (this.address != "") {
				n++;
				where.eq("address", this.address);
			}
			if (this.neighborhood != "") {
				n++;
				where.eq("neighborhood", this.neighborhood);
			}
			if (this.birthPlace != "") {
				n++;
				where.eq("birthPlace", this.birthPlace);
			}
			if (this.zipCode != "") {
				n++;
				where.eq("zipCode", this.zipCode);
			}
			if (this.maritalStatus != "") {
				n++;
				where.eq("maritalStatus", this.maritalStatus);
			}
			if (this.birthDate != "") {
				n++;
				where.eq("birthDate", this.birthDate);
			}
			if (this.phoneNumber != "") {
				n++;
				where.eq("phoneNumber", this.phoneNumber);
			}
			if (this.gender != "") {
				n++;
				where.eq("gender", this.gender);
			}
			if (n == 0) {
				patientList = pd.queryForAll();
			} else {
				where.and(n);
				patientList = where.query();
			}
			
			cs.close();
			return "confReadPacients";
		} catch (SQLException e) {
			System.err.printf("Patient read failed (%s)\n", e.toString());
			e.printStackTrace();
			return "error";
		}
	}
	
	public String verifyPatient(String name, String cpf, String zipCode, String phoneNumber){
		String result = "ok";
		
//		if (name == ""){
//			result = "Coloque um nome";
//		} else if (cpf.length() != 11){
//			result = "CPF Invalido";
//		} else if (zipCode.length() != 8){
//			result = "CEP Invalido";
//		} else if (phoneNumber.length() != 11){
//			result = "Telefone Invalido";
//		}
		 
		return result;
	}

	public List<Patient> getPatientList() {
		return this.patientList;
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
	    genVal.add(new String(""));
	    genVal.add(new String("Masculino"));
	    genVal.add(new String("Feminino"));
	    genVal.add(new String("Outro"));
	    return genVal;
	} 
	
	public List<String> getMaritalStatuss(){
		List<String> msVal = new ArrayList<String>();
		msVal.add(new String(""));
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
	
	public String getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(String errorLabel) {
		this.errorLabel = errorLabel;
	}
	
	public static boolean isNumeric(String str) {
	    return str.matches("-?\\d+(.\\d+)?");
	}
}
