package glorioso.pep.steps;

import glorioso.pep.pages.CreatePatientFormPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReceptionistSteps extends ScenarioSteps {
	
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 1L;
	
	CreatePatientFormPage createPatientFormPage;
	
    @Step
	public void fill_and_submit(String name) {
        createPatientFormPage.fill(name);
        createPatientFormPage.submit();
    }

    @Step
    public void is_on_the_patient_creation_form() {
        createPatientFormPage.open();
    }

    @Step
    public void should_see_confirmation_page(String name) {
        assert(createPatientFormPage.getConfirmedPatientName() == name);
    }

}