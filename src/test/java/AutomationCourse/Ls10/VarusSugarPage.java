package AutomationCourse.Ls10;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusSugarPage extends BasePage {
    public VarusSugarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement sugarBuy() {
        return getElementByXpath("//a[@title='Сахар Выгода 1кг']");
    }

    public WebElement sugarCart() {
        return getElementByXpath("//*[@id='BigProductCardTopInfo__addButtons']");
    }
}
