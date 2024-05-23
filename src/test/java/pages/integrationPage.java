package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class integrationPage {
    public integrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "X (Twitte")
    public WebElement xTwitter;

    @FindBy(xpath = "//input[@id='username_or_email']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy (xpath = "//input[@id='allow']")
    public WebElement allow;

    @FindBy(css = ".Vue-Toastification__toast-body")
    public WebElement success;

}
