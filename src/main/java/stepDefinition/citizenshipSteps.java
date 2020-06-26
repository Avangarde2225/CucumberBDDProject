package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.citizenshipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class citizenshipSteps {

    leftNav lv = new leftNav();
    citizenshipPage cp = new citizenshipPage();
    applicationPage ap = new applicationPage();


    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lv.clickOnCitizenship();
    }

    @Given("^Type in the name \"([^\"]*)\"$")
    public void type_in_the_name(String name) throws Throwable {
        cp.typeInTheInputCitizenName(name);
    }

    @Given("^Type in the shortname \"([^\"]*)\"$")
    public void type_in_the_shortname(String shortName) throws Throwable {
        cp.typeInTheInputShortName(shortName);
    }

    @Then("^Remove the data \"([^\"]*)\"$")
    public void remove_the_data(String name) throws Throwable {
    ap.deletingDeleteButtons(name);
    }

    @Then("^Verify data is removed \"([^\"]*)\"$")
    public void verify_data_is_removed(String arg1) throws Throwable {

    }
}
