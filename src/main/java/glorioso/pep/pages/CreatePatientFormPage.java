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

@DefaultUrl("http://www.dac.unicamp.br/portal/") //so que nao
public class CreatePatientFormPage extends PageObject {

    @FindBy(name="q")
    private WebElementFacade nameField;
    
    @FindBy(name="sa")
    private WebElementFacade submitButton;
    
    @FindBy(name="busca")
    private WebElementFacade ConfirmAlertTitle;
    
    public void fill(String name) {
    	nameField.type(name);
    }
    
    public void submit() {
    	//submitButton.click();
    }
    
    public String getConfirmedPatientName() {
    	return ConfirmAlertTitle.getText();
    }
}