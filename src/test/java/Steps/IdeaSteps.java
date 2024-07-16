package Steps;
import java.nio.file.Path;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.ideaPage;

import java.nio.file.Paths;


public class IdeaSteps {
    ideaPage page = new ideaPage();
    @Given("user navigate to idea page")
    public void userNavigateToIdeaPage() {
        page.ideaPageButton.click();
    }

    @And("user click on add idea")
    public void userClickOnAddIdea() {
        try {
            if (page.addIdea.isDisplayed()) {
                page.addIdea.click();
            }
        } catch (NoSuchElementException e) {
            if (page.addIdeaE.isDisplayed()) {
                page.addIdeaE.click();
            }
        }
    }
    @And("user enter text as {string}")
    public void userEnterText(String arg0) {
        page.ideaText.clear();
        page.ideaText.sendKeys(arg0);
    }

    @And("user add picture")
    public void userAddPicture() throws InterruptedException {
        // Convert the relative path to an absolute path
        Path path = Paths.get("src/test/java/Files/images.jpeg").toAbsolutePath();
        String absolutePath = path.toString();

        // Print the absolute path to verify
        System.out.println("Absolute path to the file: " + absolutePath);

        // Check if the file exists
        if (path.toFile().exists()) {
            // Use the absolute path in sendKeys
            page.ideaPicture.sendKeys(absolutePath);
        } else {
            // Print an error message if the file does not exist
            System.err.println("File not found: " + absolutePath);
        }

        Thread.sleep(5000);
    }
    @And("user click save")
    public void userClickSave() throws InterruptedException {

        Thread.sleep(2000);
        page.SaveButton.click();

    }

    @Then("idea created")
    public void ideaCreated() throws InterruptedException {
        Thread.sleep(500);

       boolean isIdea = page.success.isDisplayed();
        Assert.assertTrue(isIdea);
    }

    @And("user click on idea")
    public void userClickOnIdea() {
        page.idea.click();

    }

    @And("user click on more button")
    public void userClickOnMoreButton() {
    page.moreButton.click();
    }

    @And("user click delete")
    public void userClickDelete() throws InterruptedException {
    Thread.sleep(100);
    page.deleteButton.click();
    }

    @And("user click confirm delete")
    public void userClickConfirmDelete() throws InterruptedException {
        Thread.sleep(100);
        page.confirmDeleteButton.click();
    }

    @Then("idea deleted")
    public void ideaDeleted() throws InterruptedException {
        Thread.sleep(500);
        boolean isIdea = page.success.isDisplayed();
        Assert.assertTrue(isIdea);
    }

    @And("user click on edit")
    public void userClickOnEdit() {
    page.editButton.click();
    }

    @And("user edit text as {string}")
    public void userEnterEditTextAs(String arg0) {
        page.ideaText.clear();
        page.ideaText.sendKeys(arg0);
    }

    @And("user enter comment as {string}")
    public void userEnterCommentAs(String arg0) {
        page.commentInput.sendKeys(arg0);
    }

    @And("user click send")
    public void userClickSend() throws InterruptedException {
        Thread.sleep(500);
        page.commentSend.click();
    }

    @Then("comment posted")
    public void commentPosted() {
        String comment =page.comment.getText();
        Assert.assertEquals("test comment",comment);
    }


    @Then("user click on comment more button")
    public void userClickOnCommentMoreButton()  {
        page.commentMore.click();
    }

    @And("click on delete comment")
    public void clickOnDeleteComment() throws InterruptedException {
        Thread.sleep(1000);
    page.commentDelete.click();
    }

    @Then("comment deleted")
    public void commentDeleted() throws InterruptedException {
        Thread.sleep(1000);

        try {
            // Attempt to find and check if the comment is displayed
            boolean isComment = page.comment.isDisplayed();
            Assert.assertFalse("Comment should be deleted but it is still displayed", isComment);
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Comment is successfully deleted", true);
        }
    }

    @And("user click on Approve")
    public void userClickOnApprove() {
        page.ideaApprove.click();
    }

    @Then("idea Approved")
    public void ideaApproved() {
    boolean isApproved = page.success.isDisplayed();
    Assert.assertTrue(isApproved);
    }

    @And("user click on Reject")
    public void userClickOnReject() {
        page.ideaReject.click();
    }

    @Then("idea Rejected")
    public void ideaRejected() {
        boolean isRejected = page.success.isDisplayed();
        Assert.assertTrue(isRejected);
    }

    @Then("user can see just an idea or create idea")
    public void userCanSeeJustAnIdeaOrCreateIdea() {

        try {
            if (page.addIdea.isDisplayed()) {
                Assert.assertTrue(page.justIdea.isDisplayed());
            }
        } catch (NoSuchElementException e) {
            if (page.addIdeaE.isDisplayed()) {
                Assert.assertTrue(page.addIdeaE.isDisplayed());

            }
        }
    }
}
