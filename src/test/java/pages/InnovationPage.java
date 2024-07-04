package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class InnovationPage {

    public InnovationPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Innovation Space")
    public WebElement innovationPageButton;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]")
    public WebElement addPost;
    @FindBy(xpath = "//button[contains(text(),'Create Post')]")
    public WebElement addPostE;

    @FindBy (xpath = "//textarea[@id='content-4']")
    public WebElement postText;
    @FindBy(css = ".Vue-Toastification__toast-body")
    public WebElement success;
    @FindBy(xpath = "//body/div[@id='headlessui-portal-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
    public WebElement draftButton;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[2]/div[1]/div[3]/div[2]/div[2]/a[1]/div[1]/div[1]")
    public WebElement post;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement postMore;
    @FindBy(xpath = "//span[contains(text(),'Edit Post')]")
    public WebElement editPost;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]")
    public WebElement postCommentMore;
    @FindBy(xpath = "//button[contains(text(),'Approve')]")
    public WebElement postApprove;
    @FindBy(xpath = "//button[contains(text(),'Request Revision')]")
    public WebElement  requestRevision ;
    @FindBy(css = "textarea.form-textarea.p-0.w-full.p-0\\.5.border-none.outline-none.resize-none.text-lg")
    public WebElement  feedback ;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement  saveFeedback ;

}
