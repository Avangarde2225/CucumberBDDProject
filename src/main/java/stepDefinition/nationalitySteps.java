package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.countryPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class nationalitySteps {
    leftNav lv = new leftNav();
    countryPage cp = new countryPage();
    applicationPage ap = new applicationPage();

    @Given("^Click on Nationality$")
    public void click_on_Nationality() throws Throwable {
    lv.ClickOnNationality();
    }
}
