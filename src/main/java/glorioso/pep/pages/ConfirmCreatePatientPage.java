package glorioso.pep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/confCadPacientes.xhtml")
public class ConfirmCreatePatientPage extends PageObject {
	@FindBy(id = "form:nameReceived")
	private WebElement nameField;
	@FindBy(id = "form:birthDateReceived")
	private WebElement birthDateField;
	@FindBy(id = "form:maritalStatusReceived")
	private WebElement maritalStatusField;
	@FindBy(id = "form:phoneReceived")
	private WebElement phoneField;
	@FindBy(id = "form:addressReceived")
	private WebElement addressField;
	@FindBy(id = "form:neighborhoodReceived")
	private WebElement neighborhoodField;
	@FindBy(id = "form:zipCodeReceived")
	private WebElement zipcodeField;
	@FindBy(id = "form:birthPlaceReceived")
	private WebElement birthPlaceField;
	@FindBy(id = "form:fatherNameReceived")
	private WebElement fatherNameField;
	@FindBy(id = "form:motherNameReceived")
	private WebElement motherNameField;
	@FindBy(id = "form:cpfReceived")
	private WebElement cpfField;
	@FindBy(id = "form:genderReceived")
	private WebElement genderField;

	public void confirm(String name, String birthDate, String maritalStatus, String phone, String address,
			String neighborhood, String zipcode, String birthPlace, String fatherName, String motherName, String cpf,
			String gender) {
		assert(nameField.getText().equals(name));
		assert(birthDateField.getText().equals(birthDate));
		assert(maritalStatusField.getText().equals(maritalStatus));
		assert(phoneField.getText().equals(phone));
		assert(addressField.getText().equals(address));
		assert(neighborhoodField.getText().equals(neighborhood));
		assert(zipcodeField.getText().equals(zipcode));
		assert(birthPlaceField.getText().equals(birthPlace));
		assert(fatherNameField.getText().equals(fatherName));
		assert(motherNameField.getText().equals(motherName));
		assert(cpfField.getText().equals(cpf));
		assert(genderField.getText().equals(gender));
	}

}
