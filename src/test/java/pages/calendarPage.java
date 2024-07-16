package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Base.driver;

public class calendarPage {
    public calendarPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".fc")
    public WebElement calendar;
}
