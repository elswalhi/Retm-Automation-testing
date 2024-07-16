package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.InnovationPage;

import static Base.Base.driver;

public class Innovation {
    InnovationPage page =  new InnovationPage();
    @Given("user navigate to post page")
    public void userNavigateToPostPage() {
        page.innovationPageButton.click();
    }

    @And("user click on add post")
    public void userClickOnAddPost() {
        try {
            if (page.addPost.isDisplayed()) {
                page.addPost.click();
            }
        } catch (NoSuchElementException e) {
            if (page.addPostE.isDisplayed()) {
                page.addPostE.click();
            }
        }
    }

    @Then("post created")
    public void postCreated() throws InterruptedException {
        Thread.sleep(500);

        boolean isIdea = page.success.isDisplayed();
        Assert.assertTrue(isIdea);
    }

    @And("user click on post")
    public void userClickOnPost() {
        page.post.click();
    }

    @Then("post deleted")
    public void postDeleted() throws InterruptedException {
        Thread.sleep(500);

        boolean isIdea = page.success.isDisplayed();
        Assert.assertTrue(isIdea);
    }

    @Then("post Approved")
    public void postApproved() throws InterruptedException {
        Thread.sleep(500);

        boolean isIdea = page.success.isDisplayed();
        Assert.assertTrue(isIdea);
    }

    @And("user click save draft")
    public void userClickSaveDraft() {
        page.draftButton.click();
    }

    @And("user enter post text as {string}")
    public void userEnterPostTextAs(String arg0) {
        page.postText.clear();
        page.postText.sendKeys(arg0);
    }

    @And("user edit post text as {string}")
    public void userEditPostTextAs(String arg0) {
        page.postText.clear();
        page.postText.sendKeys(arg0);
    }

    @And("user click on post more button")
    public void userClickOnPostMoreButton() {
        page.postMore.click();
    }

    @And("user click on post edit")
    public void userClickOnPostEdit() {
        page.editPost.click();
    }

    @Then("user click on post comment more button")
    public void userClickOnPostCommentMoreButton() {
        page.postCommentMore.click();
    }

    @And("user click on post Approve")
    public void userClickOnPostApprove() {
        page.postApprove.click();
    }

    @And("user click on Request Revision")
    public void userClickOnRequestRevision() {
        page.requestRevision.click();
    }


    @And("user enter feedback as {string}")
    public void userEnterFeedbackAs(String arg0) {
        page.feedback.clear();
        page.feedback.sendKeys(arg0);
    }

    @And("user click on save feedback")
    public void userClickOnSaveFeedback() {
        page.saveFeedback.click();
    }

    @Then("post revision requested")
    public void postRevisionRequested() throws InterruptedException {
        String expectedUrl="https://retm-stage.neop.co/dashboard/innovation-space";
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("user can see just an innovation or create post")
    public void userCanSeeJustAnInnovationOrCreatePost() {
        try {
            if (page.addPost.isDisplayed()) {
                Assert.assertTrue(page.ideaToBE.isDisplayed());
            }
        } catch (NoSuchElementException e) {
            if (page.addPostE.isDisplayed()) {
                Assert.assertTrue(page.addPostE.isDisplayed());

            }
        }
    }

    @And("user click on post publish")
    public void userClickOnPostPublish() {
        page.publish.click();
    }

    @And("user click on Approved post")
    public void userClickOnApprovedPost() {
        page.approvedPost.click();
    }
}
