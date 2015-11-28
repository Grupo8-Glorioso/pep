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
	public void fillAndSubmitCreateForm(String name, String birthDate, String maritalStatus, String phone,
								String address, String neighborhood, String zipcode, String birthPlace, 
								String fatherName, String motherName, String cpf, String gender) 
    {	
    	
        createPatientFormPage.fill(name, birthDate, maritalStatus, phone, address, neighborhood, zipcode, birthPlace,
        						   fatherName, motherName, cpf, gender);
        createPatientFormPage.submit();
    }

    @Step
    public void isOnThePatientCreationForm() {
        createPatientFormPage.open();
    }

    @Step
    public void shouldSeeConfirmationPage(String name, String birthDate, String maritalStatus, String phone,
			String address, String neighborhood, String zipcode, String birthPlace, 
			String fatherName, String motherName, String cpf, String gender) {
       confirmPatientPage.confirm( name,  birthDate,  maritalStatus,  phone,
				 address,  neighborhood,  zipcode,  birthPlace, 
				 fatherName,  motherName,  cpf,  gender);
    }
    
    @Step
	public void isOnThePatientUpdateForm() {
		updatePatientFormPage.open();
	}

    @Step
	public void updateAndSubmit(String field, String info) {
        updatePatientFormPage.fill(field, info);
        updatePatientFormPage.submit();
	}

    @Step
	public void shouldSeeConfirmationPageFieldInfo(String field,
			String info) {
		assert(updatePatientFormPage.getConfirmedField().equals(field));
		assert(updatePatientFormPage.getConfirmedInfo().equals(info));
	}
    
    @Step
	public void shouldSeeError(String errorMessage) {
		assert(createPatientFormPage.getErrorInfo().equals(errorMessage));
	}
    
    @Step
    public void searchForPatient(String name)
    {
        assert(false == true);
    }

}