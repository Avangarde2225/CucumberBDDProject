package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav {
    private WebDriver driver;

    public leftNav(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement clickOnSetup;

    @FindBy(xpath = "//span[contains(text(),'Parameters')])[1]")
    private WebElement clickOnParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement clickOnCountries;

    public void clickOnSetup(){
        clickOnSetup.click();
    }
    public void clickOnParameters(){
        clickOnParameters.click();
    }
    public void clickOnCountries(){
        clickOnCountries.click();
    }
}
