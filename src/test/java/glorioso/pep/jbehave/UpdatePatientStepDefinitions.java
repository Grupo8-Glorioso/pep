package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import glorioso.pep.steps.ReceptionistSteps;

public class UpdatePatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is managing a patient")
    public void givenTheUserIsOnThePatientUpdateForm() {
    	receptionist.isOnThePatientUpdateForm();
    }

    @When("the user updates the field '$field' to '$info'")
    // @Alias("the user updates the field <field> to <info>")
    public void whenTheUserUpdatesAFieldWithInfo(String field, String info) {
    	receptionist.updateAndSubmit(field, info);
    }

    @Then("they should see a confirmation of the patient’s new '$field' as '$info'")
    // @Alias("they should see a confirmation of the patient's new <field> as <info>")
    public void thenTheyShouldSeeAConfirmationOfAFieldWithInfo(String field, String info) {
    	receptionist.shouldSeeConfirmationPageFieldInfo(field, info);
    }

}
