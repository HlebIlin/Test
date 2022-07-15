package PullRequests.PR1;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazHelpHomePage extends BasePage {
    public ZakazHelpHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPaymentBtn() {
        return getElementByXpath("//li[@class='active']");
    }
}
