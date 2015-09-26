package glorioso.pep.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.google.com") //so que nao
public class CreatePatientFormPage extends PageObject {

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