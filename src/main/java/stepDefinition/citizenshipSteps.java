package stepDefinition;

import PageObjectModel.citizenshipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {

    leftNav lv = new leftNav();
    citizenshipPage cp = new citizenshipPage();


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
}
