package glorioso.pep.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/cadPacientes.xhtml")
public class RegisterPlanFormPage extends PageObject 
{
    @FindBy(id="form:conduct_field")
    private WebElement conductField;
    @FindBy(id="form:comments_field")
    private WebElement commentsField;
    
    @FindBy(id="form:save_button")
    private WebElement saveButton;
    
    public void fill(String conduct, String comments) 
    {
    	conductField.sendKeys(conduct);
    	commentsField.sendKeys(comments);
    }
    
    public void save() {
    	saveButton.click();
    }
    
}
