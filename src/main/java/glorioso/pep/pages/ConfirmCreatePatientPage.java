package glorioso.pep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/confCadPacientes.xhtml")
public class ConfirmCreatePatientPage extends PageObject {
	@FindBy(id = "nameReceived")
	private WebElement nameField;
	@FindBy(id = "birthDateReceived")
	private WebElement birthDateField;
	@FindBy(id = "maritalStatusReceived")
	private WebElement maritalStatusField;
	@FindBy(id = "phoneReceived")
	private WebElement phoneField;
	@FindBy(id = "addressReceived")
	private WebElement addressField;
	@FindBy(id = "neighborhoodReceived")
	private WebElement neighborhoodField;
	@FindBy(id = "zipCodeReceived")
	private WebElement zipcodeField;
	@FindBy(id = "birthPlaceReceived")
	private WebElement birthPlaceField;
	@FindBy(id = "fatherNameReceived")
	private WebElement fatherNameField;
	@FindBy(id = "motherNameReceived")
	private WebElement motherNameField;
	@FindBy(id = "cpfReceived")
	private WebElement cpfField;
	@FindBy(id = "genderReceived")
	private WebElement genderField;

	public void confirm(String name, String birthDate, String maritalStatus, String phone, String address,
			String neighborhood, String zipcode, String birthPlace, String fatherName, String motherName, String cpf,
			String gender) {
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
