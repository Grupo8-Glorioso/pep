package glorioso.pep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/cadPacientesv2.xhtml")
public class ReadPatientFormPage extends PageObject {

    @FindBy(name="name_field")
    private WebElement nameField;
    
    @FindBy(name="submit_button")
    private WebElement submitButton;
    
    @FindBy(name="confirm_title")
    private WebElement ConfirmAlertTitle;
    
    public void fill(String name) {
    	nameField.sendKeys(name);
    }
    
    public void submit() {
    	submitButton.click();
    }
    
    public String getConfirmedPatientName() {
    	return ConfirmAlertTitle.getText();
    }
}