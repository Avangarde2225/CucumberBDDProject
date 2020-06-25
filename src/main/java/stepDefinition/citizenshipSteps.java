package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {

    leftNav lv = new leftNav();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
    lv.clickOnCitizenship();
    }

    @Given("^Type in the name \"([^\"]*)\"$")
    public void type_in_the_name(String arg1) throws Throwable {

    }

    @Given("^Type in the shortname \"([^\"]*)\"$")
    public void type_in_the_shortname(String arg1) throws Throwable {

    }
}
