package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import glorioso.pep.steps.ReceptionistSteps;

public class CreatePatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is on the patient creation form")
    public void givenTheUserIsOnThePatientCreationForm() {
    	receptionist.is_on_the_patient_creation_form();
    }

    @When("the user fills and submits the form with information from '$name'")
   // @Alias("the user fills and submits the form with information from <name>")
    public void whenTheUserFillsAndSubmitsTheFormWithInformationFrom(String name) {
    	receptionist.fill_and_submit(name);
    }

    @Then("they should see a confirmation page with information from '$name'")
   // @Alias("they should see a confirmation page with information from <name>")
    public void thenTheyShouldSeeAConfirmationPageWithInformationFrom(String name) {
    	receptionist.should_see_confirmation_page(name);
    }

}
