package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.DoctorSteps;

public class RegisterObjectiveTestStepDefinitions {
	@Steps
	DoctorSteps doctor;

	@Given("the doctor is physically examining a patient")
	public void givenTheDoctorIsOnThePatientObjectiveForm() {
		doctor.isOnThePatientObjectiveForm();
	}

	@When("the doctor inserts test data:: $patient_table")
	public void whenTheDoctorRegistersObjectiveInformation(ExamplesTable objectiveTable) {
		Map<String, String> objective = objectiveTable.getRow(0);
		doctor.fillAndSaveObjectiveTestForm(objective.get("height"), objective.get("weight"),
				objective.get("temperature"), objective.get("blood_pressure"), objective.get("heart_rate"),
				objective.get("breathing_rate"), objective.get("satO2"), objective.get("satCO2"),
				objective.get("glycemia"), objective.get("comments"));
	}

	@Then("the doctor should see a confirmation message")
	public void thenTheyShouldSeeAConfirmationObjectivePage() {
		doctor.confirmationObjectiveInfo();
	}

}
