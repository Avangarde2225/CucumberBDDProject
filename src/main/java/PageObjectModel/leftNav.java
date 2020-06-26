package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav extends abstractClass {
    private WebDriver driver;

    public leftNav() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement clickOnSetup;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement clickOnParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement clickOnCountries;

    @FindBy(xpath = "//span[contains(text(),'Citizenships')]")
    private WebElement clickOnCitizenship;

    @FindBy(xpath = "//span[contains(text(),'Nationalities')]")
    private WebElement clickOnNationality;

    public void clickOnSetup() {
        clickFunction(clickOnSetup);
    }

    public void clickOnParameters() {
        clickFunction(clickOnParameters);
    }

    public void clickOnCountries() {
        clickFunction(clickOnCountries);
    }

    public void clickOnCitizenship() {
        clickFunction(clickOnCitizenship);
    }

    public void ClickOnNationality(){
        clickFunction(clickOnNationality);
    }
}
