package AutomationCourse.Ls10;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement phoneNumber() {
        return getElementByXpath("//input[@id='login-data']");
    }

    public WebElement password() {
        return getElementByXpath("//input[@id='login-password']");
    }

    public WebElement enter() {
        return getElementByXpath("//button[@data-marker='Sign in']");
    }

    public WebElement goOrderButton() {
        return getElementByXpath("//button[@data-marker='Order']");
    }
}