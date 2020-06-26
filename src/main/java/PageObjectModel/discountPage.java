package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class discountPage {
    private WebDriver driver;

    public discountPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


}
