package PullRequests.PR6;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LobzikCompassDl2306HomePage extends BasePage {
    public LobzikCompassDl2306HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getBuyBtn() {
        return getElementsByXpath("//button[@class='p-buy__btn btn btn--yellow']");
    }
}
