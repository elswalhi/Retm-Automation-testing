package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.subscribersPage;

public class subscriberSteps {
    subscribersPage page = new subscribersPage();

    @Given("Admin navigate to Subscribers page")
    public void adminNavigateToSubscribersPage() throws InterruptedException {
        page.SidebarButton.click();
        Thread.sleep(100);
        page.subscribersPageButton.click();
    }

    @And("Admin click on Add subscriber")
    public void adminClickOnAddSubscriber() {
        page.addSubscribersButton.click();
    }
    @And("Admin Enter subscriber Name as {string}")
    public void adminEnterSubscriberNameAs(String arg0) {
        page.subscribersName.sendKeys(arg0);
    }

    @And("Admin Enter subscriber Email as {string}")
    public void adminEnterSubscriberEmailAs(String arg0) {
        page.subscribersEmail.sendKeys(arg0);
    }

    @And("Admin Enter subscriber Password as {string}")
    public void adminEnterSubscriberPasswordAs(String arg0) {
    page.subscribersPassword.sendKeys(arg0);
    }


    @And("Admin Enter subscriber Phone as {string}")
    public void adminEnterSubscriberPhoneAs(String arg0) {

        page.subscribersPhone.sendKeys(arg0);

    }

    @And("Admin click save")
    public void adminClickSave() {
        page.saveButton.click();
    }


    @Then("subscriber Added")
    public void subscriberAdded() throws InterruptedException {
        Thread.sleep(1000);
        boolean isSubscriber = page.success.isDisplayed();
        Assert.assertTrue(isSubscriber);
    }
}
