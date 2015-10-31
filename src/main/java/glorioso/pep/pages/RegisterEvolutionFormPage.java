package glorioso.pep.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/cadPacientes.xhtml")
public class RegisterEvolutionFormPage extends PageObject 
{
    @FindBy(id="form:comments_field")
    private WebElement commentsField;
    
    @FindBy(id="form:save_button")
    private WebElement saveButton;
    
    public void fill(String comments) 
    {
    	commentsField.sendKeys(comments);
    }
    
    public void save() {
    	saveButton.click();
    }
    
}
