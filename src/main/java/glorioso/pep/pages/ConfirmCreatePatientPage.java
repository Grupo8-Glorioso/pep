package glorioso.pep.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/confCadPacientes.xhtml") //so que nao
public class ConfirmCreatePatientPage extends PageObject 
{
    @FindBy(name="nameReceived")
    private WebElement nameField;
    @FindBy(name="birthDateReceived")
    private WebElement birthDateField;
    @FindBy(name="maritalStatusReceived")
    private WebElement maritalStatusField;
    @FindBy(name="phoneReceived")
    private WebElement phoneField;
    @FindBy(name="addressReceived")
    private WebElement addressField;
    @FindBy(name="neighborhoodReceived")
    private WebElement neighborhoodField;
    @FindBy(name="zipCodeReceived")
    private WebElement zipcodeField;
    @FindBy(name="birthPlaceReceived")
    private WebElement birthPlaceField;
    @FindBy(name="fatherNameReceived")
    private WebElement fatherNameField;
    @FindBy(name="motherNameReceived")
    private WebElement motherNameField;
    @FindBy(name="cpfReceived")
    private WebElement cpfField;
    @FindBy(name="genderReceived")
    private WebElement genderField;
    
    
    public void confirm(String name, String birthDate, String maritalStatus, String phone,
					String address, String neighborhood, String zipcode, String birthPlace, 
					String fatherName, String motherName, String cpf, String gender) 
    {
    	assert(nameField.getText() == name);
    	assert(birthDateField.getText() == birthDate);
    	assert(maritalStatusField.getText() == maritalStatus);
    	assert(phoneField.getText() == phone);
    	assert(addressField.getText() == address); 
    	assert(neighborhoodField.getText() == neighborhood);
    	assert(zipcodeField.getText() == zipcode);
    	assert(birthPlaceField.getText() == birthPlace);
    	assert(fatherNameField.getText() == fatherName);
    	assert(motherNameField.getText() == motherName);
    	assert(cpfField.getText() == cpf);
    	assert(genderField.getText() == gender);
    }
    
}
