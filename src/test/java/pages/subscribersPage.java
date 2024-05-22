package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class subscribersPage {
    public subscribersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/button[1]")
    public WebElement SidebarButton ;
    @FindBy (xpath = "//a[contains(text(),'Subscribers')]")
    public WebElement subscribersPageButton ;
    @FindBy (xpath = "//a[contains(text(),'Add Subscriber')]")
    public WebElement addSubscribersButton ;
    @FindBy (xpath = "//input[@id='name']")
    public WebElement subscribersName ;
    @FindBy (xpath = "//input[@id='email']")
    public WebElement subscribersEmail ;
    @FindBy (xpath = "//input[@id='password']")
    public WebElement subscribersPassword ;
    @FindBy (xpath = "//input[@id='phone']")
    public WebElement subscribersPhone ;
    @FindBy (xpath = "//body/div[@id='app']/main[1]/div[3]/section[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement saveButton ;
    @FindBy(className = "Vue-Toastification__toast-body")
    public WebElement success;
}


