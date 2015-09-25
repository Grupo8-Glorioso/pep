package glorioso.pep.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://www.google.com") //so que nao
public class CreatePatientFormPage extends PageObject {

    @FindBy(name="name_field")
    private WebElementFacade nameField;
    
    @FindBy(name="submit_button")
    private WebElementFacade submitButton;
    
    @FindBy(name="confirm_title")
    private WebElementFacade ConfirmAlertTitle;
    
    public void fill(String name) {
    	nameField.type(name);
    }
    
    public void submit() {
    	submitButton.click();
    }
    
    public String getConfirmedPatientName() {
    	return ConfirmAlertTitle.getText();
    }
}