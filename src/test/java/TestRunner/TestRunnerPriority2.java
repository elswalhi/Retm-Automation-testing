package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "Steps",
        tags = "@tag2",
        plugin = {
                "pretty",
                "html:target/reports-priority1.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:target/reports-priority1.json"
        }
)
public class TestRunnerPriority2 {}