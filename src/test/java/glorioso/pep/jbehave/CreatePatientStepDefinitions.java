package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.ReceptionistSteps;

public class CreatePatientStepDefinitions 
{
    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is creating a patient")
    public void givenTheUserIsOnThePatientCreationForm() {
    	receptionist.isOnThePatientCreationForm();
    }

    @When("the user enters and submits the patient information: $patient_table")
    public void whenTheUserFillsAndSubmitsTheFormWithInformationFrom(ExamplesTable patientTable) 
    {
    	Map<String, String> patient = patientTable.getRow(0);
    	receptionist.fillAndSubmitCreateForm(patient.get("name"), patient.get("birth_date"), patient.get("marital_status"),
    								 patient.get("phone"), patient.get("address"), patient.get("neighborhood"),
    								 patient.get("zipcode"), patient.get("birth_place"), patient.get("father_name"),
    								 patient.get("mother_name"), patient.get("cpf"), patient.get("gender"));
    }

    @Then("they should see a confirmation of the creation of: $patient_table")
    public void thenTheyShouldSeeAConfirmationPageWithInformationFrom(ExamplesTable patientTable) {
    	Map<String, String> patient = patientTable.getRow(0);
    	receptionist.shouldSeeConfirmationPage(patient.get("name"), patient.get("birth_date"), patient.get("marital_status"),
    								 patient.get("phone"), patient.get("address"), patient.get("neighborhood"),
    								 patient.get("zipcode"), patient.get("birth_place"), patient.get("father_name"),
    								 patient.get("mother_name"), patient.get("cpf"), patient.get("gender"));
    }
    
    @Then("they should see an error message informing a duplicate '$error'")
    public void theyShouldSeeAnErrorMessageInformingADuplicate(String error){
    	receptionist.shouldSeeError(error);
    }

}
