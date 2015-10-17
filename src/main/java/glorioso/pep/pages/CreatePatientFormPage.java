package glorioso.pep.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/cadPacientes.xhtml")
public class CreatePatientFormPage extends PageObject 
{
    @FindBy(name="name_field")
    private WebElement nameField;
    @FindBy(name="birth_date_field")
    private WebElement birthDateField;
    @FindBy(name="marital_status_field")
    private WebElement maritalStatusField;
    @FindBy(name="phone_field")
    private WebElement phoneField;
    @FindBy(name="address_field")
    private WebElement addressField;
    @FindBy(name="neighborhood_field")
    private WebElement neighborhoodField;
    @FindBy(name="zipcode_field")
    private WebElement zipcodeField;
    @FindBy(name="birth_place_field")
    private WebElement birthPlaceField;
    @FindBy(name="father_name_field")
    private WebElement fatherNameField;
    @FindBy(name="mother_name_field")
    private WebElement motherNameField;
    @FindBy(name="cpf_field")
    private WebElement cpfField;
    @FindBy(name="gender_field)")
    private WebElement genderField;
    
    @FindBy(name="submit_button")
    private WebElement submitButton;
    
    public void fill(String name, String birthDate, String maritalStatus, String phone,
					String address, String neighborhood, String zipcode, String birthPlace, 
					String fatherName, String motherName, String cpf, String gender) 
    {
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
    
}
