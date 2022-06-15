package AutomationCourse.Ls4;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEcoHomePage extends BasePage {
    public ZakazEcoHomePage(WebDriver driver) {
        super(driver);
    }

    public void goZkazEco() {
        driver.get("https://zakaz.ua/ru/");
    }

    public WebElement goEco() {
        return getElementByXpath("//img[@alt='EKO']");
    }
}
