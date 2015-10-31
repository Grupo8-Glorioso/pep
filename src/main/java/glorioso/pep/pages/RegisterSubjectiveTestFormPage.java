package glorioso.pep.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://localhost:8080/pep/cadPacientes.xhtml")		Alterar quando tiver para esse cara
public class RegisterSubjectiveTestFormPage extends PageObject {
	@FindBy(id = "form:main_complaint_field")
	private WebElement mainComplaintField;
	@FindBy(id = "form:history_of_present_illness_fied")
	private WebElement historyOfPresentIllnessField;
	@FindBy(id = "form:symptomatic_interrogation_field")
	private WebElement symptomaticInterrogationField;
	@FindBy(id = "form:personal_and_family_history_field")
	private WebElement personalAndFamilyHistoryField;
	@FindBy(id = "form:lifestyle_socioeconomic_and_cultural_conditions_field")
	private WebElement lifestyleSocioeconomicAndCulturalConditionsField;
	@FindBy(id = "form:orthotics_and_prosthetics_field")
	private WebElement orthoticsAndProstheticsField;
	@FindBy(id = "form:comments_field")
	private WebElement commentsField;

	@FindBy(id = "form:save_button")
	private WebElement saveButton;

	public void fill(String mainComplaint, String historyOfPresentIllness, String symptomaticInterrogation,
			String personalAndFamilyHistory, String lifestyleSocioeconomicAndCulturalConditions,
			String orthoticsAndProsthetics, String comments) {
		mainComplaintField.sendKeys(mainComplaint);
		historyOfPresentIllnessField.sendKeys(historyOfPresentIllness);
		symptomaticInterrogationField.sendKeys(symptomaticInterrogation);
		personalAndFamilyHistoryField.sendKeys(personalAndFamilyHistory);
		lifestyleSocioeconomicAndCulturalConditionsField.sendKeys(lifestyleSocioeconomicAndCulturalConditions);
		orthoticsAndProstheticsField.sendKeys(orthoticsAndProsthetics);
		commentsField.sendKeys(comments);

	}

	public void save() {
		saveButton.click();
	}

}
