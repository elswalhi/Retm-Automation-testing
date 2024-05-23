package Steps;

import Base.Base;
import Base.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;

public class Hooks extends Base {


    @Before
    public void runsBeforeAnyScenario(){
       init();
    }
    @After
    public void runsAfterAnyScenario(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            // Scenario failed; take a screenshot
            byte[] screenshot = ScreenshotUtils.takeScreenshot(driver);
            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");
            // Attach screenshot to Allure
            Allure.addAttachment("Screenshot on Failure", new ByteArrayInputStream(screenshot));
        }
        driver.quit();
    }
}

