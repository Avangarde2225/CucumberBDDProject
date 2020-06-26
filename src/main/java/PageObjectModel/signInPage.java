package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class signInPage extends abstractClass{
    private WebDriver driver;

    public signInPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

//    public void signInMethod() {
//
//        driver.findElement(By.cssSelector("div.cc-compliance > a")).click();
//        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("nigeria_tenant_admin");
//        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TnvLOl54WxR75vylop2A");
//        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
//    }

    @FindBy(css="div.cc-compliance > a")
    private WebElement clickOnCompliance;

    @FindBy(css="input[placeholder='Username']")
    private WebElement inputUserName;

    @FindBy(css="[formcontrolname=\"password\"]")
    private WebElement inputPassword;

    @FindBy(css="button[aria-label=\"LOGIN\"]")
    private WebElement buttonLogin;

    public void clickOnComplianceButton(){
        clickFunction(clickOnCompliance);
    }

    public void typeInInputUserName(){
        sendKeys(inputUserName, ReadProperties.getData("Username"));
    }
    public void typeInInputPassword(){
        sendKeys(inputPassword,ReadProperties.getData("Password"));
    }

    public void clickOnbuttonLogin(){
        clickFunction(buttonLogin);
    }

}
