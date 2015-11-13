package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.DoctorSteps;

public class RegisterSubjectiveTestStepDefinitions {
	@Steps
	DoctorSteps doctor;

	@Given("the doctor is interviewing a patient")
	public void givenTheDoctorIsOnThePatientSubjectiveForm() {
		doctor.isOnThePatientSubjectiveForm();
	}

	@When("the doctor registers the information given by the patient: $patient_table")
	public void whenTheDoctorRegistersSubjectiveInformation(ExamplesTable subjectiveTable) {
		Map<String, String> subjective = subjectiveTable.getRow(0);
		doctor.fillAndSaveSubjectiveTestForm(subjective.get("main_complaint"),
				subjective.get("history_of_present_illness"), subjective.get("symptomatic_interrogation"),
				subjective.get("personal_and_family_history"),
				subjective.get("lifestyle_socioeconomic_and_cultural_conditions"),
				subjective.get("orthotics_and_prosthetics"), subjective.get("comments"));
	}

	@Then("the doctor should see a confirmation message")
	public void thenTheyShouldSeeAConfirmationSubjectivePage() {
		doctor.confirmationSubjectiveInfo();
	}

}
