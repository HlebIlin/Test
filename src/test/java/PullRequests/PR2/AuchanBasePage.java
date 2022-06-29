package PullRequests.PR2;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuchanBasePage extends BasePage {
    public AuchanBasePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return getElementByXpath("//input[@type='search']");
    }
}

