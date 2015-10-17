package glorioso.pep.steps;

import glorioso.pep.pages.CreatePatientFormPage;
import glorioso.pep.pages.UpdatePatientFormPage;
import glorioso.pep.pages.ConfirmCreatePatientPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReceptionistSteps extends ScenarioSteps 
{	
	// necessario para o eclipse nao reclamar
	private static final long serialVersionUID = 1L;
	
	CreatePatientFormPage createPatientFormPage;
	UpdatePatientFormPage updatePatientFormPage;
	ConfirmCreatePatientPage confirmPatientPage;

    @Step
	public void fill_and_submit_create_form(String name, String birthDate, String maritalStatus, String phone,
								String address, String neighborhood, String zipcode, String birthPlace, 
								String fatherName, String motherName, String cpf, String gender) 
    {
        createPatientFormPage.fill(name, birthDate, maritalStatus, phone, address, neighborhood, zipcode, birthPlace,
        						   fatherName, motherName, cpf, gender);
        createPatientFormPage.submit();
    }

    @Step
    public void is_on_the_patient_creation_form() {
        createPatientFormPage.open();
    }

    @Step
    public void should_see_confirmation_page(String name, String birthDate, String maritalStatus, String phone,
			String address, String neighborhood, String zipcode, String birthPlace, 
			String fatherName, String motherName, String cpf, String gender) {
       confirmPatientPage.confirm( name,  birthDate,  maritalStatus,  phone,
				 address,  neighborhood,  zipcode,  birthPlace, 
				 fatherName,  motherName,  cpf,  gender);
    }
    
    @Step
	public void is_on_the_patient_update_form() {
		updatePatientFormPage.open();
	}

    @Step
	public void update_and_submit(String field, String info) {
        updatePatientFormPage.fill(field, info);
        updatePatientFormPage.submit();
	}

    @Step
	public void should_see_confirmation_page_field_info(String field,
			String info) {
		assert(updatePatientFormPage.getConfirmedField() == field);
		assert(updatePatientFormPage.getConfirmedInfo() == info);
	}
    
    @Step
    public void search_for_patient(String name)
    {
    	assert(false == true);
    }

}