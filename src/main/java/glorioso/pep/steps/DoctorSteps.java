package glorioso.pep.steps;

import glorioso.pep.pages.RegisterSubjectiveTestFormPage;
import glorioso.pep.pages.RegisterObjectiveTestFormPage;
import glorioso.pep.pages.RegisterEvaluationFormPage;
import glorioso.pep.pages.RegisterPlanFormPage;
import glorioso.pep.pages.RegisterEvolutionFormPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DoctorSteps extends ScenarioSteps {
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 1L;

	RegisterSubjectiveTestFormPage registerSubjectiveTestFormPage;
	RegisterObjectiveTestFormPage registerObjectiveTestFormPage;
	RegisterEvaluationFormPage registerEvaluationFormPage;
	RegisterPlanFormPage registerPlanFormPage;
	RegisterEvolutionFormPage registerEvolutionFormPage;

	@Step
	public void fillAndSaveSubjectiveTestForm(String mainComplaint, String historyOfPresentIllness,
			String symptomaticInterrogation, String personalAndFamilyHistory,
			String lifestyleSocioeconomicAndCulturalConditions, String orthoticsAndProsthetics, String comments) {
		registerSubjectiveTestFormPage.fill(mainComplaint, historyOfPresentIllness, symptomaticInterrogation,
				personalAndFamilyHistory, lifestyleSocioeconomicAndCulturalConditions, orthoticsAndProsthetics,
				comments);
		registerSubjectiveTestFormPage.save();
	}

	@Step
	public void fillAndSaveObjectiveTestForm(String height, String weight, String temperature, String bloodPressure,
			String heartRate, String breathingRate, String satO2, String satCO2, String glycemia, String comments) {
		registerObjectiveTestFormPage.fill(height, weight, temperature, bloodPressure, heartRate, breathingRate, satO2,
				satCO2, glycemia, comments);
		registerObjectiveTestFormPage.save();
	}

	@Step
	public void fillAndSaveEvaluationForm(String codeCID10, String hipotesisDiagnostic, String definitiveDiagnosis,
			String comments) {
		registerEvaluationFormPage.fill(codeCID10, hipotesisDiagnostic, definitiveDiagnosis, comments);
		registerEvaluationFormPage.save();
	}

	@Step
	public void fillAndSavePlanForm(String conduct, String comments) {
		registerPlanFormPage.fill(conduct, comments);
		registerPlanFormPage.save();
	}
	
	@Step
	public void fillAndSaveEvolutionForm(String comments) {
		registerEvolutionFormPage.fill(comments);
		registerEvolutionFormPage.save();
	}

}