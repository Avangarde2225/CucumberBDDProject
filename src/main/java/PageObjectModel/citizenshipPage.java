package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class citizenshipPage {
    private WebDriver driver;

    public citizenshipPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

}
