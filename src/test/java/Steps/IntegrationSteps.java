package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.integrationPage;

public class IntegrationSteps {
    integrationPage page= new integrationPage();

    @Given("user have workspace")
    public void userHaveWorkspace() {

    }

    @And("user click on x icon")
    public void userClickOnXIcon() {
    page.xTwitter.click();
    }

    @And("user enter x username as {string}")
    public void userEnterXUsernameAs(String arg0) {
    page.username.sendKeys(arg0);
    }

    @And("user enter x password as {string}")
    public void userEnterXPasswordAs(String arg0) {
    page.password.sendKeys(arg0);
    }

    @And("user click sign in")
    public void userClickSignIn() {
    page.allow.click();
    }

    @Then("x integrated")
    public void xIntegrated() {
        boolean isIntegrated = page.success.isDisplayed();
        Assert.assertTrue(isIntegrated);
    }
}
