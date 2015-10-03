package glorioso.pep.steps;

import glorioso.pep.pages.CreatePatientFormPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReceptionistSteps extends ScenarioSteps {
	
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 1L;
	
	CreatePatientFormPage createPatientFormPage;

    @Step
	public void fill_and_submit_create_form(String name, String birthDate, String maritalStatus, String phone,
								String address, String neighborhood, String zipcode, String birthPlace, 
								String fatherName, String motherName) 
    {
        createPatientFormPage.fill(name, birthDate, maritalStatus, phone, address, neighborhood, zipcode, birthPlace,
        						   fatherName, motherName);
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
    
    @Step
    public void search_for_patient(String name)
    {
    	assert(false == true);
    }
}