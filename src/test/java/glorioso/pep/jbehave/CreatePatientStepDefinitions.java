package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.ReceptionistSteps;

public class CreatePatientStepDefinitions {

    @Steps
    ReceptionistSteps receptionist;

    @Given("the user is creating a patient")
    public void givenTheUserIsOnThePatientCreationForm() {
    	receptionist.is_on_the_patient_creation_form();
    }

    @When("the user enters and submits the patient information: $patient_table")
    public void whenTheUserFillsAndSubmitsTheFormWithInformationFrom(ExamplesTable patientTable) 
    {
    	Map<String, String> patient = patientTable.getRow(0);
    	receptionist.fill_and_submit_create_form(patient.get("name"), patient.get("birth_date"), patient.get("marital_status"),
    								 patient.get("phone"), patient.get("address"), patient.get("neighborhood"),
    								 patient.get("zipcode"), patient.get("birth_place"), patient.get("father_name"),
    								 patient.get("mother_name"));
    }

    @Then("they should see a confirmation of the creation of '$name'")
    public void thenTheyShouldSeeAConfirmationPageWithInformationFrom(String name) {
    	receptionist.should_see_confirmation_page(name);
    }

}
