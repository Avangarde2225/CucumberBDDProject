package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class countryPage extends abstractClass {
    private WebDriver driver;

    public countryPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//ms-text-field[@placeholder=\"GENERAL.FIELD.NAME\"])[1]")
    private WebElement countryInputName;

    public void countryCreate(String name){
    sendKeys(countryInputName, name);
    }

    @FindBy(xpath = "(ms-text-field[@placeholder=\"GENERAL.FIELD.CODE\"])[1]")
    private WebElement countryCode;

    public void countryCode(String code){
        sendKeys(countryCode, code);
    }

}
