package glorioso.pep.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Patient implements Serializable {
	
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 2L;
	
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
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	private long idPatient;
	private long idPatientOrg;
	
	private String name;
	private String motherName;
	private String gender;
	private String CPF;
	private List<Contact> contactList = new ArrayList<Contact>();
}
