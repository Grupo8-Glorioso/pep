package glorioso.pep.model.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName="patients")
public class Patient implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	public Patient() {};
	
	@DatabaseField(generatedId=true)
	private Integer id;
	
	@DatabaseField
	private String name;

	@DatabaseField
	private String motherName;
	
	@DatabaseField
	private String fatherName;
	@DatabaseField
	private String phoneNumber;
	
	@DatabaseField
	private String gender;
	
	@DatabaseField
	private String maritalStatus;
	
	@DatabaseField
	private String address;
	
	@DatabaseField
	private String neighborhood;
	
	@DatabaseField
	private String zipCode;
	
	@DatabaseField
	private String birthPlace;
	
	@DatabaseField
	private String birthDate;
	
	@DatabaseField
	private String CPF;

	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void createPatient(){
		
	}
}
