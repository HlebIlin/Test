package PullRequests.PR3;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePagePayment extends BasePage {
    public HomePagePayment(WebDriver driver) {
        super(driver);
    }

    public WebElement getAmountBtn() {
        return getElementByXpath("//input[@name='amount_color']");
    }

    public WebElement getCartNamberBtn() {
        return getElementByXpath("//input[@autocomplete='cc-number']");
    }

    public WebElement getMMYYBtn() {
        return getElementByXpath("//input[@el='MMYY']");
    }

    public WebElement getCardCVVbtn() {
        return getElementByXpath("//input[@el='CardCvv']");
    }

    public List<WebElement> getPayBtn() {
        return getElementsByXpath("//div[@el='Send']");
    }
}
