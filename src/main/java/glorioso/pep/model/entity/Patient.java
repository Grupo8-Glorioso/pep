package glorioso.pep.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import glorioso.pep.model.dao.PatientDAO;

public class Patient implements Serializable {
		
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 2L;
	
	//private PatientDAO patientDao;
	
	public long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	
	public long getIdPatientOrg() {
		return idPatientOrg;
	}
	public void setIdPatientOrg(long idPatientOrg) {
		this.idPatientOrg = idPatientOrg;
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getGenders() {
	    List<String> genVal = new ArrayList<String>();
	    genVal.add(new String("Masculino"));
	    genVal.add(new String("Feminino"));
	    genVal.add(new String("Outro"));
	    return genVal;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	/*
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	public String getContactType() {
		return c.getType();
	}
	public void setContactType(String type) {
		c.setType(type);;
	}
	public String getContactInfo() {
		return c.getInfo();
	}
	public void setContactInfo(String info) {
		c.setInfo(info);
	}
	public List<String> getContactTypes(){
		return c.getTypes();
	}*/
	
	
	private long idPatient;
	private long idPatientOrg;
	
	private String name;
	private String motherName;
	private String fatherName;
	private String phoneNumber = "aaa";
	private String gender;
	private String maritalStatus;
	private String address;
	private String neighborhood;
	private String zipCode;
	private String birthPlace;
	private String birthDate;
	private String CPF;
	
	//private Contact c = new Contact();
	//private List<Contact> contactList = new ArrayList<Contact>();
	
	
	public String Insert(int aishoaios){
		System.out.println("Chamou!");
		//patientDao = new PatientDAO(HibernateUtil.openSession());
		System.out.println("Abriu sessao!");
		//patientDao.registerPatient(this);
		return "confCadPacientes";
	}
	
	public void CreateContact(){
		//System.out.println("Mensagem recebida: " + c.getType() + " - " + c.getInfo());
		//contactList.add(c);
		//System.out.println(contactList);
		//contactList.add(contact);
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
}
