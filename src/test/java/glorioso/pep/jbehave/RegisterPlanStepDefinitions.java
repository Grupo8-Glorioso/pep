package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.DoctorSteps;

public class RegisterPlanStepDefinitions 
{
    @Steps
    DoctorSteps doctor;

    @Given("the doctor has determined a treatment plan for a patient")
    public void givenTheDoctorIsOnThePatientPlanForm() {
    	doctor.isOnThePatientPlanForm();
    }

    @When("the doctor register the conduct for the patient and comments:")
    public void whenTheDoctorRegisterTheConductAndComments(ExamplesTable planTable) {
    	Map<String, String> plan = planTable.getRow(0);
    	doctor.fillAndSavePlanForm(plan.get("conduct"), plan.get("comments"));
    }
    
    @Then("the doctor should see a confirmation message")
    public void thenTheyShouldSeeAConfirmationPlanPage() {
		doctor.confirmationPlanInfo();
	}

}
