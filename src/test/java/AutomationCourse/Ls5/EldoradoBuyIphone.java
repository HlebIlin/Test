package AutomationCourse.Ls5;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EldoradoBuyIphone extends BasePage {
    public EldoradoBuyIphone(WebDriver driver) {
        super(driver);
    }

    public WebElement buyIphone() {
        return getElementByXpath("//div[@class='button']");
    }

    public WebElement basketButton() {
        return getElementByXpath("//button[@class='basket-button']");
    }


}
