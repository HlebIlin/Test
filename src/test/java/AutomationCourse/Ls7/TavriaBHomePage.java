package AutomationCourse.Ls7;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TavriaBHomePage extends BasePage {
    public TavriaBHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickAddress() {
        return getElementByXpath("//div[@data-marker-store-id='default']");
    }

    public WebElement deliveryTakeAway() {
        return getElementByXpath("//li[@data-testid='deliveryType_pickup']");
    }

    public WebElement choiceCity() {
        return getElementByXpath("//div[@class='RegionSelect__control css-yk16xz-control']");
    }

    public WebElement choiceNikolayev() {
        return getElementByXpath("//div[@id='react-select-3-option-0']");
    }

    public WebElement goToShopping() {
        return getElementByXpath("//button[@data-testid='To shopping']");
    }
}
