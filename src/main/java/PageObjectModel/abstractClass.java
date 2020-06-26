package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

//click and send keys functions

public abstract class abstractClass {
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 20);

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeys(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
    public void verifyCreated(List<WebElement> tableList, String value){
        boolean result = false;


        for (int i = 0; i <tableList.size() ; i++) {
            if(tableList.get(i).getText().equalsIgnoreCase(value)){
                result = true;
                break;
            }
        }
        if(result==false){
            Assert.fail();
        } else{
            System.out.println(value + "is displayed");
        }
    }
    public void waitUntilVisibilityOf(WebElement waitElement) {
        try {
            wait.until(ExpectedConditions.visibilityOf(waitElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void waitUntilInvisibilityOf(WebElement waitElement){
        try{
            wait.until(ExpectedConditions.invisibilityOf(waitElement));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteFunctionality(List<WebElement> name, List<WebElement> deleteButton, WebElement yes,String value){
        for (int i = 0; i <name.size() ; i++) {
            if(name.get(i).getText().equalsIgnoreCase(value)){
                clickFunction(deleteButton.get(i));
                clickFunction(yes);

            }
        }
    }
    public void verifyDeletedInAbstractClass(List<WebElement> tableList, String value) {
        boolean result = false;


        for (int i = 0; i <tableList.size() ; i++) {
            if(tableList.get(i).getText().equalsIgnoreCase(value)){
                result = true;
                break;
            }
        }
        if(result==true){
            Assert.fail();
        } else{
            System.out.println(value + "is displayed");
        }
    }

}
