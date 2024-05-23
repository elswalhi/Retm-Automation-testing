package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/Features",tags = "@idea",glue = "Steps"  ,plugin = {"pretty","html:target/reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/reports.json ",}  )


public class TestRunner {}

