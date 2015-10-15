package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import glorioso.pep.steps.ReceptionistSteps;

public class ReadPatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is on the patient search page")
    public void givenTheUserIsOnThePatientReadForm() {
    	receptionist.is_on_the_patient_creation_form();
    }

    @When("the user searches for '$name'")
    public void whenTheUserSearchesForName(String name) {
    	receptionist.search_for_patient(name);
    }
    
    //@When("the user fills and submits '$age' and '$marital_status'")
   // public void whenTheUserFillsAndSubmits(String age, String marital_status) {
    //	receptionist.fill_and_submit(age, marital_status);
    //}    
    
    @Then("they should see information for '$name'")
    public void thenTheyShouldSeeInformationFor(String name) {
    	receptionist.should_see_confirmation_page(name);
    }
    
    //@Then("they should see a list only of patients that satisfy the previous criteria")
    //public void thenTheyShouldSeeInformationFor(String name) {
   // 	receptionist.should_see_confirmation_page(name);
    //}
    
    @Then("the system record the audit '$audit'")
    public void thenTheSystemRecordTheAudit(String audit) {
    	receptionist.should_see_confirmation_page(audit);
    }

}
