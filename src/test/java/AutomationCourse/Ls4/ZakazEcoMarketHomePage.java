package AutomationCourse.Ls4;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEcoMarketHomePage extends BasePage {
    public ZakazEcoMarketHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement goSearch() {
        return getElementByXpath("//input[@type='search']");
    }

    public WebElement goTextAlcohol() {
        return getElementByXpath("//input[@type='search']");
    }
}
