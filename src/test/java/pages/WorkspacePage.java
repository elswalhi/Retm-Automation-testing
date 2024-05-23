package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class WorkspacePage {
    public WorkspacePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a.btn.iconed[href='/dashboard/workspaces/create']")
    public WebElement newWorkspaceButton;
    @FindBy(css = "input.form-input[type='text'][id='name']")
    public WebElement workspaceNameInput;
    @FindBy(css = "button.btn.w-full.lg[type='button']")
    public WebElement nextButton;
    @FindBy(css = "input.form-input[type='email'][id='email-0']")
    public WebElement emailInput;
    @FindBy(css = "input.form-input[type='email'][id='email-1']")
    public WebElement emailInput1;
    @FindBy(css = "button.flex.items-center.gap-2.text-primary[type='button']")
    public WebElement addMoreButton;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")
    public WebElement inviteLaterButton;
    @FindBy(css = "a.btn.lg.w-full.bordered[href='/dashboard']")
    public WebElement completeLaterLink;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement testButton;
    @FindBy(xpath = "//a[contains(text(),'All')]")
    public WebElement allLink;
    @FindBy(css = ".Vue-Toastification__toast-body")
    public WebElement success;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]")
    public WebElement workSpaceMore;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement workSpaceDelete;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement workSpaceConfirmDelete;
    @FindBy(css = "#headlessui-portal-root")
    public WebElement modalFrame;

}
//p[contains(text(),'Test automation workspace4')]