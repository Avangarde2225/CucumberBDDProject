package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },

        tags = "@RegressionTest",

        features = {"src/test/java/resources"},

        glue={"stepDefinition"},

        dryRun = false
)
public class regressionRunner extends AbstractTestNGCucumberTests {

}
