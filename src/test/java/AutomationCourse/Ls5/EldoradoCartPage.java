package AutomationCourse.Ls5;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EldoradoCartPage extends BasePage {
    public EldoradoCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement cartIphone() {
        return getElementByXpath("//div[@class='increase change-number']");
    }

}
