package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.DoctorSteps;

public class RegisterEvolutionStepDefinitions 
{
    @Steps
    DoctorSteps doctor;

    @Given("the doctor is interviewing a returning patient")
    public void givenTheDoctorIsOnThePatientEvolutionForm() {
    	doctor.isOnThePatientEvolutionForm();
    }
    
    @When("the doctor inserts commentaries about the disease evolution: $patient_table")
    public void whenTheDoctorInsertCommentariesAboutEvolution(ExamplesTable evolutionTable) {
    	Map<String, String> evolution = evolutionTable.getRow(0);
    	doctor.fillAndSaveEvolutionForm(evolution.get("comments"));
    }

    @Then("the doctor should see a confirmation page")
    public void thenTheyShouldSeeAConfirmationEvolutionPage() {
		doctor.confirmationEvolutionInfo();
	}

}
