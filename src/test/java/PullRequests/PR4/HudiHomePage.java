package PullRequests.PR4;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HudiHomePage extends BasePage {
    public HudiHomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> choiceSizeHydi() {
        return getElementsByXpath("//*[@data-toggle='tooltip']");
    }

    public List<WebElement> choiceDataDelivery() {
        return getElementsByXpath("//*[@data-toggle='tooltip']");
    }

    public WebElement getAddCartButton() {
        return getElementByXpath("//button[@id='button-cart']");
    }
}
