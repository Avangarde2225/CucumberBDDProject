package stepDefinition;

import PageObjectModel.leftNav;
import PageObjectModel.signInPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class countrySteps {

    WebDriver driver;
    signInPage sip = new signInPage();
    leftNav lv = new leftNav();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        driver = Driver.getDriver();

        driver.get("https://basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.clickOnComplianceButton();
        sip.typeInInputUserName();
        sip.typeInInputPassword();
        sip.clickOnbuttonLogin();

    }

    @Given("^Click on setup$")
    public void click_on_setup() throws Throwable {
    lv.clickOnSetup();
    }

    @Given("^Click on parameters$")
    public void click_on_parameters() throws Throwable {
    lv.clickOnParameters();
    }

    @Given("^Click on countries$")
    public void click_on_countries() throws Throwable {
     lv.clickOnCountries();
    }
}
