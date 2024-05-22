package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class ideaPage {
    public ideaPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Idea Board')]")
    public WebElement ideaPageButton;
    @FindBy(xpath = "//body/div[@id='app']/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement addIdea;
    @FindBy (xpath = "//textarea[@id='content']")
    public WebElement ideaText;
    @FindBy (className = "filepond--browser")
    public WebElement ideaPicture;
    @FindBy (xpath = "//body/div[@id='headlessui-portal-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
    public WebElement SaveButton;
    @FindBy(css = ".Vue-Toastification__toast-body")
    public WebElement success;
    @FindBy (xpath = "//body/div[@id='app']/main[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]")
    public WebElement idea;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement moreButton;
    @FindBy (xpath = "//body/div[@id='app']/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]")
    public WebElement deleteButton;
    @FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement editButton;
    @FindBy (xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
    public WebElement confirmDeleteButton;

}
