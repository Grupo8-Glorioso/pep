package glorioso.pep.model.control;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import glorioso.pep.model.entity.Subjective;
import glorioso.pep.model.entity.Objective;

public class SoapeController {

	public String insertSubjective() {
		String result = "confSubjective";
		Subjective s = genSubjective();
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Subjective,Integer> sd = DaoManager.createDao(cs, Subjective.class);			
			sd.create(s);
			cs.close();
		} catch (SQLException e) {
			System.err.printf("Subjective insert failed (%s)\n", e.toString());
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String insertObjective() {
		String result = "confObjective";
		Objective o = genObjective();
		try {
			ConnectionSource cs = new JdbcConnectionSource("jdbc:sqlite:pep.db");
			Dao<Objective,Integer> od = DaoManager.createDao(cs, Objective.class);			
			od.create(o);
			cs.close();
		} catch (SQLException e) {
			System.err.printf("Objective insert failed (%s)\n", e.toString());
			e.printStackTrace();
		}
		
		return result;
	}

	private Integer patientId;
	
	private String comments;
	private String familyHistory;
	private String lifestyle;
	private String orthotics;
	private String mainComplaint;
	private String presentHistory;
	private String symptomaticInterrogation;
	
	public Subjective genSubjective() {
		Subjective s = new Subjective();
		s.setComments(this.comments);
		s.setFamilyHistory(this.familyHistory);
		s.setLifestyle(this.lifestyle);
		s.setMainComplaint(this.mainComplaint);
		s.setOrthotics(this.orthotics);
		s.setPresentHistory(this.presentHistory);
		s.setSymptomaticInterrogation(this.symptomaticInterrogation);
		s.setPatientId(this.patientId);
		return s;
	}
	
	private String bloodPressure;
	private String breathingRate;
	private String co2Sat;
	private String glycemia;
	private String heartRate;
	private String height;
	private String o2Sat;
	private String temperature;
	private String weight;
	
	public Objective genObjective() {
		Objective o = new Objective();
		o.setBloodPressure(this.bloodPressure);
		o.setBreathingRate(this.breathingRate);
		o.setCo2Sat(this.co2Sat);
		o.setComments(this.comments);
		o.setGlycemia(this.glycemia);
		o.setHeartRate(this.heartRate);
		o.setHeight(this.height);
		o.setO2Sat(this.o2Sat);
		o.setTemperature(this.temperature);
		o.setWeight(this.weight);
		o.setPatientId(this.patientId);
		return o;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getBreathingRate() {
		return breathingRate;
	}

	public void setBreathingRate(String breathingRate) {
		this.breathingRate = breathingRate;
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

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getO2Sat() {
		return o2Sat;
	}

	public void setO2Sat(String o2Sat) {
		this.o2Sat = o2Sat;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
}
