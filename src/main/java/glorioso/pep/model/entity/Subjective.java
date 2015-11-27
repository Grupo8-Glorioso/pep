package glorioso.pep.model.entity;

import com.j256.ormlite.field.DatabaseField;

public class Subjective implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Subjective() {};

	@DatabaseField(generatedId=true)
	private Integer id;
	
	@DatabaseField
	private Integer patientId;
	
	@DatabaseField
	private String mainComplaint;
	
	@DatabaseField
	private String presentHistory;
	
	@DatabaseField
	private String symptomaticInterrogation;
	
	@DatabaseField
	private String familyHistory;
	
	@DatabaseField
	private String lifestyle;
	
	@DatabaseField
	private String orthotics;
	
	@DatabaseField
	private String comments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMainComplaint() {
		return mainComplaint;
	}

	public void setMainComplaint(String mainComplaint) {
		this.mainComplaint = mainComplaint;
	}

	public String getPresentHistory() {
		return presentHistory;
	}

	public void setPresentHistory(String presentHistory) {
		this.presentHistory = presentHistory;
	}

	public String getSymptomaticInterrogation() {
		return symptomaticInterrogation;
	}

	public void setSymptomaticInterrogation(String symptomaticInterrogation) {
		this.symptomaticInterrogation = symptomaticInterrogation;
	}

	public String getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	public String getLifestyle() {
		return lifestyle;
	}

	public void setLifestyle(String lifestyle) {
		this.lifestyle = lifestyle;
	}

	public String getOrthotics() {
		return orthotics;
	}

	public void setOrthotics(String orthotics) {
		this.orthotics = orthotics;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
}