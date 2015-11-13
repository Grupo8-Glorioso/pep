package glorioso.pep.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:8080/pep/objetivo.xhtml")
public class RegisterObjectiveTestFormPage extends PageObject {
	@FindBy(id = "form:height_field")
	private WebElement heightField;
	@FindBy(id = "form:weight_field")
	private WebElement weightField;
	@FindBy(id = "form:temperature_field")
	private WebElement temperatureField;
	@FindBy(id = "form:blood_pressure_field")
	private WebElement bloodPressureField;
	@FindBy(id = "form:heart_rate_field")
	private WebElement heartRateField;
	@FindBy(id = "form:breathing_rate_field")
	private WebElement breathingRateField;
	@FindBy(id = "form:satO2_field")
	private WebElement satO2Field;
	@FindBy(id = "form:satCO2_field")
	private WebElement satCO2Field;
	@FindBy(id = "form:glycemia_field")
	private WebElement glycemiaField;
	@FindBy(id = "form:comments_field")
	private WebElement commentsField;

	@FindBy(id = "form:save_button")
	private WebElement saveButton;

	public void fill(String height, String weight, String temperature, String bloodPressure, String heartRate,
			String breathingRate, String satO2, String satCO2, String glycemia, String comments) {
		heightField.sendKeys(height);
		weightField.sendKeys(weight);
		temperatureField.sendKeys(temperature);
		bloodPressureField.sendKeys(bloodPressure);
		heartRateField.sendKeys(heartRate);
		breathingRateField.sendKeys(breathingRate);
		satO2Field.sendKeys(satO2);
		satCO2Field.sendKeys(satCO2);
		glycemiaField.sendKeys(glycemia);
		commentsField.sendKeys(comments);
	}

	public void save() {
		saveButton.click();
	}

}
