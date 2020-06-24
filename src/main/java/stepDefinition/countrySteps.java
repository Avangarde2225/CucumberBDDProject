package stepDefinition;

import PageObjectModel.signInPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class countrySteps {

    WebDriver driver;
    signInPage sip = new signInPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        driver = Driver.getDriver();

        driver.get("https://basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.clickOnComplianceButton();
        sip.typeInInputUserName();
        sip.typeInInputPassword();
        sip.clickOnbuttonLogin();

    }
}
