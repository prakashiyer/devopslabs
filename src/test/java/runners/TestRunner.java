package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature/",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = { "progress",
                "html:target/Cucumber"
        })

public class TestRunner {
}
