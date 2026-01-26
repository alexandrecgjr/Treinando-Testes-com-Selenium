package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = {"~@Ignore"},
        glue = {"steps"}

)
public class RunCucumberTest {
}
