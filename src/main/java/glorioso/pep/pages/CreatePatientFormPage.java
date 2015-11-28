package glorioso.pep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/cadPacientesv2.xhtml")
public class CreatePatientFormPage extends PageObject 
{
    @FindBy(id="form:name_field")
    private WebElement nameField;
    @FindBy(id="form:birth_date_field")
    private WebElement birthDateField;
    @FindBy(id="form:marital_status_field")
    private WebElement maritalStatusField;
    @FindBy(id="form:phone_field")
    private WebElement phoneField;
    @FindBy(id="form:address_field")
    private WebElement addressField;
    @FindBy(id="form:neighborhood_field")
    private WebElement neighborhoodField;
    @FindBy(id="form:zipcode_field")
    private WebElement zipcodeField;
    @FindBy(id="form:birth_place_field")
    private WebElement birthPlaceField;
    @FindBy(id="form:father_name_field")
    private WebElement fatherNameField;
    @FindBy(id="form:mother_name_field")
    private WebElement motherNameField;
    @FindBy(id="form:cpf_field")
    private WebElement cpfField;
    @FindBy(id="form:gender_field")
    private WebElement genderField;
    
    @FindBy(id="form:submit_button")
    private WebElement submitButton;
    @FindBy(id="form:read_button")
    private WebElement readButton;
    
    @FindBy(id="form:error_label_field")
    private WebElement errorLabel;

    
    public void fill(String name, String birthDate, String maritalStatus, String phone,
					String address, String neighborhood, String zipcode, String birthPlace, 
					String fatherName, String motherName, String cpf, String gender) {
    	
    	nameField.sendKeys(name);
    	birthDateField.sendKeys(birthDate);
    	maritalStatusField.sendKeys(maritalStatus);
    	phoneField.sendKeys(phone);
    	addressField.sendKeys(address);
    	neighborhoodField.sendKeys(neighborhood);
    	zipcodeField.sendKeys(zipcode);
    	birthPlaceField.sendKeys(birthPlace);
    	fatherNameField.sendKeys(fatherName);
    	motherNameField.sendKeys(motherName);
    	cpfField.sendKeys(cpf);
    	genderField.sendKeys(gender);
    }
    
    public void submit() {
    	submitButton.click();
    }
    
    public void read() {
    	readButton.click();
    }
 
	public String getErrorInfo() {
		return errorLabel.getText();
	}
    
}
