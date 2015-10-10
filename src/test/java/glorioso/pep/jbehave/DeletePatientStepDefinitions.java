package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import glorioso.pep.steps.ReceptionistSteps;

public class DeletePatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the doctor is managing patient '$name'")
    public void givenTheDoctorIsManagingPatient(String name) {
    	//doctor.is_on_the_management_form(name);
    }

    @When("the doctor chooses to remove the patient '$name'")
    // @Alias("the doctor chooses to remove the patient <name>")
    public void whenTheDoctorChoosesToRemoveThePatient(String name) {
    	//doctor.remove_and_submit(name);
    }

    @Then("they should see a confirmation about the deletion of the patient '$name'")
    // @Alias("they should see a confirmation of the creation of <name>")
    public void thenTheyShouldSeeAConfirmationPageWithInformationFrom(String name) {
    	receptionist.should_see_confirmation_page(name);
    }

}
