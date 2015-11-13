package glorioso.pep.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/avaliacao.xhtml")
public class RegisterEvaluationFormPage extends PageObject 
{
    @FindBy(id="form:code_CID_10_field")
    private WebElement codeCID10Field;
    @FindBy(id="form:hipotesis_diagnostic_field")
    private WebElement hipotesisDiagnosticField;
    @FindBy(id="form:definitive_diagnosis_field")
    private WebElement definitiveDiagnosisField;
    @FindBy(id="form:comments_field")
    private WebElement commentsField;
    
    @FindBy(id="form:save_button")
    private WebElement saveButton;
    
    public void fill(String codeCID10, String hipotesisDiagnostic, String definitiveDiagnosis, String comments) 
    {
    	codeCID10Field.sendKeys(codeCID10);
    	hipotesisDiagnosticField.sendKeys(hipotesisDiagnostic);
    	definitiveDiagnosisField.sendKeys(definitiveDiagnosis);
    	commentsField.sendKeys(comments);
    }
    
    public void save() {
    	saveButton.click();
    }
    
}
