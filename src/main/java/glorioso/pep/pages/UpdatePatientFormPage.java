package glorioso.pep.pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/updatePatient.xhtml") //inexistente
public class UpdatePatientFormPage extends PageObject {

    @FindBy(name="name_field")
    private WebElement nameField;
    
    @FindBy(name="submit_button")
    private WebElement submitButton;
    
    @FindBy(name="confirm_title")
    private WebElement ConfirmAlertTitle;
    
    public void fill(String field, String info) {
    	nameField.sendKeys(info);
    }
    
    public void submit() {
    	submitButton.click();
    }
    
    public String getConfirmedPatientName() {
    	return ConfirmAlertTitle.getText();
    }

	public String getConfirmedField() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getConfirmedInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}