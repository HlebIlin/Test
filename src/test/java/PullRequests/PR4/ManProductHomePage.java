package PullRequests.PR4;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ManProductHomePage extends BasePage {
    public ManProductHomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> CheckHudiNB() {
        return getElementsByXpath("//span[@class='cart-icon']");
    }
}
