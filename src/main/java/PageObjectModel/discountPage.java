package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class discountPage extends abstractClass{
    private WebDriver driver;

    public discountPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//mat-dialog-container//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input")
    private WebElement clickDescription;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']//input")
    private WebElement inputIntegrationCode;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']//input")
    private WebElement inputPriority;

    public void typeInthedescription(String name){
        sendKeys( clickDescription , name );
    }

    public void typeInIntegrationCode(String intCode){
        sendKeys( inputIntegrationCode , intCode );
    }

    public void typeIninputPriority(String priority){
        sendKeys( inputPriority , priority );
    }

}
