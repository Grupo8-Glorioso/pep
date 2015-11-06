package glorioso.pep.jbehave;

import net.thucydides.core.annotations.Steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import glorioso.pep.steps.DoctorSteps;

public class RegisterEvaluationStepDefinitions 
{
    @Steps
    DoctorSteps doctor;

    @Given("the doctor has made the subjective or objective examinations of patient")
    public void givenTheDoctorHasMadeTheSubjectiveOrObjectiveExaminationsOfPatient() {
    	doctor.hasMadeTheSubjectiveOrObjectiveExaminations();
    }
    
    @When("he registers the diagnosis, CID 10 code and comments: $evaluation_table")
    public void whenHeRegistersTheDiagnosisCID10CodeAndComments(ExamplesTable evaluationTable) {
    	Map<String,String> evaluate = evaluationTable.getRow(0);
    	doctor.fillAndSaveEvaluationForm(evaluate.get("code_CID_10"),
    			evaluate.get("hipotesis_diagnostic"),
    			evaluate.get("definitive_diagnosis"),
    			evaluate.get("comments"));
    }
    
    @Then("the doctor should see a confirmation message")
    public void theDoctorShouldSeeAConfirmationMessage() {
    	doctor.confirmationEvaluation();
    }
}
