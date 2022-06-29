package PullRequests.PR2;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ColaHomePage extends BasePage {
    public ColaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement yes18() {
        return getElementByXpath("//button[@data-testid='buttonYes']");
    }

    public List<WebElement> getCola2LBtn() {
        return getElementsByXpath("//div[@data-testid='product-tile__image']");
    }

    public WebElement getAddToCartBtn() {
        return getElementByXpath("//div[@class='jsx-1423358880 BigProductCardTopInfo__addToCartButtons']");
    }

    public WebElement getPickUpBtn() {
        return getElementByXpath("//li[@data-testid='deliveryType_pickup']");
    }

    public WebElement getLocationBtn() {
        return getElementByXpath("//div[@data-marker='Locality']");
    }

    public WebElement getDneprBtn() {
        return getElementByXpath("//div[@id='react-select-3-option-0']");
    }

    public WebElement getToShoppingBtn() {
        return getElementByXpath("//button[@data-testid='To shopping']");
    }
}

