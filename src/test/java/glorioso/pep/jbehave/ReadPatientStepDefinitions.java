package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import glorioso.pep.steps.ReceptionistSteps;

public class ReadPatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is creating a patient")
    public void givenTheUserIsOnThePatientCreationForm() {
    	receptionist.is_on_the_patient_creation_form();
    }

    @When("the user enters the information from '$name'")
    // @Alias("the user enters the information from <name>")
    public void whenTheUserFillsAndSubmitsTheFormWithInformationFrom(String name) {
    	receptionist.fill_and_submit(name);
    }

    @Then("they should see a confirmation of the creation of '$name'")
    // @Alias("they should see a confirmation of the creation of <name>")
    public void thenTheyShouldSeeAConfirmationPageWithInformationFrom(String name) {
    	receptionist.should_see_confirmation_page(name);
    }

}
