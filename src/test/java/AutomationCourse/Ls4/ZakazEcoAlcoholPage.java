package AutomationCourse.Ls4;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEcoAlcoholPage extends BasePage {
    public ZakazEcoAlcoholPage(WebDriver driver) {
        super(driver);
    }

    public WebElement yes18() {
        return getElementByXpath("//button[@data-testid='buttonYes']");
    }

    public WebElement nalivkaSpokusa() {
        return getElementByXpath("//a[@title='Напиток алкогольный Вишнева Спокуса 17,5% 0,7л']");
    }

    public WebElement addToCart() {
        return getElementByXpath("//div[@id='BigProductCardTopInfo__addButtons']");
    }

    public WebElement xzSho() {
        return getElementByXpath("//div[@id='BigProductCardTopInfo__addButtons']");
    }

    public WebElement novaPoshta() {
        return getElementByXpath("//li[@data-testid='deliveryType_novaPoshta']");
    }
}
