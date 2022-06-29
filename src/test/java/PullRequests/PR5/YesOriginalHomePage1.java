package PullRequests.PR5;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YesOriginalHomePage1 extends BasePage {
    public YesOriginalHomePage1(WebDriver driver) {
        super(driver);
    }

    public void goYesOriginal() {
        driver.get("https://yesoriginal.com.ua/ru");
    }

    public WebElement getReviewBtn() {
        return getElementByXpath("//a[@href='/otzyv']");
    }
    public WebElement getContactBtn() {
        return getElementByXpath("//a[@href='/contact']");
    }
    public WebElement getSiteMapBtn() {
        return getElementByXpath("//a[@href='/sitemap']");
    }
    public WebElement getLoyaltyProgramBtn() {
        return getElementByXpath("//a[@href='/loyalty-program']");
    }
    public WebElement getDeliveryPayment() {
        return getElementByXpath("//a[@href='/delivery-payment']");
    }
}
