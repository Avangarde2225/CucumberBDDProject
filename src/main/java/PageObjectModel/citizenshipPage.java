package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class citizenshipPage extends abstractClass{
    private WebDriver driver;

    public citizenshipPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//ms-text-field[@placeholder=\"GENERAL.FIELD.NAME\"])[2]")
    private WebElement inputCitizenName;

    @FindBy(xpath="(//ms-text-field[@placeholder=\"GENERAL.FIELD.SHORTNAME\"])[1]")
    private WebElement inputShortName;

    public void typeInTheInputCitizenName(String name){
        sendKeys(inputCitizenName, name);
    }
    public void typeInTheInputShortName(String shortName){
        sendKeys(inputShortName, shortName);
    }
}
