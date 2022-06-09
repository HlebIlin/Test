package AutomationCourse.Ls10;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusFreshMeat extends BasePage {

    public VarusFreshMeat(WebDriver driver) {
        super(driver);
    }

    public WebElement varusChiseFreshMeat() {
        return getElementByXpath("//a[@title='Четверть куриная охлажденная']");
    }

    public WebElement meatToCart() {
        return getElementByXpath("//*[@id='BigProductCardTopInfo__addButtons']");
    }

    public WebElement choiceDelivery() {
        return getElementByXpath("//li[@id='react-tabs-2']");
    }

    public WebElement choiceLocality() {
        return getElementByXpath("//div[@data-marker='Locality']");
    }
    public  WebElement choiceCity(){
        return getElementByXpath("//div[@class='RegionSelect__option RegionSelect__option--is-focused css-1n7v3ny-option']");
    }
    public WebElement toShopping(){
        return getElementByXpath("//button[@data-testid='To shopping']");

    }
}