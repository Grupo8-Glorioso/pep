package glorioso.pep.model.entity;

import com.j256.ormlite.field.DatabaseField;

public class Objective implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Objective() {};

	@DatabaseField(generatedId=true)
	private Integer id;
	
	@DatabaseField
	private Integer patientId;

	@DatabaseField
	private String height;

	@DatabaseField
	private String weight;
	
	@DatabaseField
	private String temperature;
	
	@DatabaseField
	private String bloodPressure;
	
	@DatabaseField
	private String heartRate;
	
	@DatabaseField
	private String breathingRate;
	
	@DatabaseField
	private String o2Sat;
	
	@DatabaseField
	private String co2Sat;
	
	@DatabaseField
	private String glycemia;
	
	@DatabaseField
	private String comments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getBreathingRate() {
		return breathingRate;
	}

	public void setBreathingRate(String breathingRate) {
		this.breathingRate = breathingRate;
	}

	public String getO2Sat() {
		return o2Sat;
	}

	public void setO2Sat(String o2Sat) {
		this.o2Sat = o2Sat;
	}

	public String getCo2Sat() {
		return co2Sat;
	}

	public void setCo2Sat(String co2Sat) {
		this.co2Sat = co2Sat;
	}

	public String getGlycemia() {
		return glycemia;
	}

	public void setGlycemia(String glycemia) {
		this.glycemia = glycemia;
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