package AutomationCourse.Ls13;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderZakazHomePage extends BasePage {
    public HeaderZakazHomePage(WebDriver driver) {
        super(driver);
    }

    public void goZakazOpen() {
        driver.get("https://zakaz.ua/ru/");
    }
    public WebElement checkLogo(){
        return getElementByXpath("//div[@class='jsx-3617752486 Header__leftNavigation']");
    }
    public WebElement checkLanguage(){
        return getElementByXpath("//a[@href='/uk/']");
    }
    public WebElement checkPartners(){
        return getElementByXpath("//div[@class='jsx-1112415212 DropDownContainer__header']");
    }
    public WebElement checkChoiceShop(){
        return getElementByXpath("//button[text()='Выбрать магазин']");
    }
}
