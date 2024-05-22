package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ideaPage;

import javax.swing.*;

public class IdeaSteps {
    ideaPage page = new ideaPage();
    @Given("user navigate to idea page")
    public void userNavigateToIdeaPage() {
        page.ideaPageButton.click();
    }

    @And("user click on add idea")
    public void userClickOnAddIdea() {
    page.addIdea.click();
    }

    @And("user enter text as {string}")
    public void userEnterText(String arg0) {
        page.ideaText.clear();
        page.ideaText.sendKeys(arg0);
    }

    @And("user add picture")
    public void userAddPicture() throws InterruptedException {
        page.ideaPicture.sendKeys("C:\\Users\\Darwish\\Desktop\\retm\\src\\test\\java\\Files\\images.jpeg");
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

    @And("user  click on idea")
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
//        page.ideaText.sendKeys(arg0);
    }
}
