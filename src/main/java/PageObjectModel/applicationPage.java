package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public class applicationPage extends abstractClass {

    //frequently used buttons will be stored here

    private WebDriver driver;


    public applicationPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="svg[data-icon='plus']")
    private WebElement clickOnPlusButton;

    public void clickPlusButton(){
        clickFunction(clickOnPlusButton);
    }

    @FindBy(css="mat-dialog-actions svg[data-icon='save']")
    private WebElement saveButton;

    public void clickSaveButton(){
        clickFunction(saveButton);
    }

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yes;

    public void clickOnYes(){
        clickFunction(yes);
    }

    @FindAll({
            @FindBy(xpath="//tbody//tr//td[2]")
    })
    private List<WebElement> tableListOfNames;

    public void nameIsCreated(String value){
        waitUntilVisibilityOf(successfullyCreatedMessage);
        waitUntilInvisibilityOf(successfullyCreatedMessage);
        verifyCreated(tableListOfNames, value);
    }

    @FindBy(xpath="//div[contains(text(), 'successfully created')]")
    private WebElement successfullyCreatedMessage;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button//button")
    })

    private List<WebElement> listOfDeleteButtons;

    public void deletingDeleteButtons(String value){
        deleteFunctionality(tableListOfNames, listOfDeleteButtons, yes,value );
    }

    public void verifyingDeleted(String value){
        verifyDeletedInAbstractClass(tableListOfNames, value);
    }

}
