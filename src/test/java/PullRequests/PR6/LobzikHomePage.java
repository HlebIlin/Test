package PullRequests.PR6;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LobzikHomePage extends BasePage {
    public LobzikHomePage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getLobzikCompassDL2306BuyBtn() {
        return getElementsByXpath("//a[@href='https://epicentrk.ua/ua/shop/elektrolobzik-compass-dl2306.html']");
    }
}
