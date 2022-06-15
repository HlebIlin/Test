package AutomationCourse.Ls10;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusMeetChoise extends BasePage {

    public VarusMeetChoise(WebDriver driver) {
        super(driver);
    }

    public WebElement varusMeetChoise() {
        return getElementByXpath("//img[@alt='Свежее мясо']");
    }


}