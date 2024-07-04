package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WorkspacePage;

import java.awt.*;

import static Base.Base.driver;

public class Workspace {
   WorkspacePage page = new WorkspacePage();
    @Given("Admin log in dashboard")
    public void adminLogInDashboard() throws InterruptedException {
        String expectedUrl="https://retm-stage.neop.co/dashboard";
        Thread.sleep(2000);
       String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("Admin click on create workspace button")
    public void adminClickOnCreateWorkspaceButton() {
        page.newWorkspaceButton.click();
    }

    @And("Enter workspace Name as {string}")
    public void enterWorkspaceNameAs(String workspaceName ) {
        page.workspaceNameInput.sendKeys(workspaceName);
    }

    @And("click on next button")
    public void clickOnNextButton() throws InterruptedException {
    Thread.sleep(1000);
    page.nextButton.click();
    }


    @And("click on invite late")
    public void clickOnInviteLate() throws InterruptedException {
        Thread.sleep(10000);
        page.inviteLaterButton.click();
    }

    @And("click on complete later")
    public void clickOnCompleteLater() {
        page.completeLaterLink.click();
    }

    @Then("Workspace Created and user can see {string} on active workspace")
    public void workspaceCreatedAndUserCanSeeOnActiveWorkspace(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        page.testButton.click();
        Assert.assertEquals(arg0, page.testButton.getText());

    }

    @Given("Admin navigate to workspaces page")
    public void adminNavigateToWorkspacesPage() throws InterruptedException {
        Thread.sleep(1000);
        page.testButton.click();
        Thread.sleep(200);
        page.allLink.click();

    }

    @And("Admin click more button")
    public void adminClickMoreButton() {
        Actions action = new Actions(driver);
        action.moveToElement(page.workSpaceMore).doubleClick(page.workSpaceMore).perform();
    }

    @And("Admin Click on delete workspace")
    public void adminClickOnDeleteWorkspace() {
        page.workSpaceDelete.click();

    }

    @And("Admin click on confirm delete")
    public void adminClickOnConfirmDelete() throws InterruptedException {
        Thread.sleep(1000);
//        driver.switchTo().frame(page.modalFrame);
        page.workSpaceConfirmDelete.click();
//        driver.switchTo().defaultContent();

    }

    @Then("workspace deleted")
    public void workspaceDeleted() throws InterruptedException {
        Thread.sleep(500);
       boolean isWorkSpace = page.success.isDisplayed();
       Assert.assertTrue(isWorkSpace);

    }
}
