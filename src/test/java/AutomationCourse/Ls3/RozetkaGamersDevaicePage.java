package AutomationCourse.Ls3;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaGamersDevaicePage extends BasePage {
    public RozetkaGamersDevaicePage(WebDriver driver) {
        super(driver);
    }

    public WebElement goGamersLaptop() {
        return getElementByXpath("//img[@alt='Ігрові ноутбуки Asus']");
    }
}
