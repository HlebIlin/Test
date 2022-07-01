package AutomationCourse.Ls10;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusCart extends BasePage {
    public VarusCart(WebDriver driver) {
        super(driver);
    }

    public WebElement meatQuantity() {
        return getElementByXpath("//button[@data-marker='+']");
    }

    public WebElement cart() {
        return getElementByXpath("//button[@data-testid='cart_button']");
    }

    public WebElement add() {
        return getElementByXpath("//button[@data-marker='Order']");
    }
}
