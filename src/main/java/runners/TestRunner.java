package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features/LoginInvestor.feature",
        glue={"steps"},
        plugin ={"pretty",
        "html:target/cucumber-reports.html",
                "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true

)
public class TestRunner {


}
