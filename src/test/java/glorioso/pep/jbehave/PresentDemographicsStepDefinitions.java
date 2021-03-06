package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.ReceptionistSteps;

public class PresentDemographicsStepDefinitions 
{
    @Steps
    ReceptionistSteps receptionist;

    @Given("the receptionist is on the patient search page")
    public void givenTheRecepcionistIsOnThePatientSearchPageForm() {
    	receptionist.isOnThePatientCreationForm();
    }
    
    @When("she finds and selects '$name'")
    public void whenTheRecepcionistSelectThePatient(String name) {
    	receptionist.searchForPatient(name);
    }
    
    @Then("she should be directed to the page with the demographic data of '$name'")
    // @Alias("they should see a confirmation of the creation of <name>")
    public void thenSeeShouldBeDirectedToThePageWithDemographicData(String name) {
    	//receptionist.
    }

}
