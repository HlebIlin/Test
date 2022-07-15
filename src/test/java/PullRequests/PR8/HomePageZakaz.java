package PullRequests.PR8;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageZakaz extends BasePage {
    public HomePageZakaz(WebDriver driver) {
        super(driver);
    }

    public void goZakazOpen() {
        driver.get("https://zakaz.ua/ru/");
    }

    public WebElement helpButton() {
        return getElementByXpath("//a[@href='tel:help@zakaz.ua']");
    }

    public WebElement facebookButton() {
        return getElementByXpath("//a[@href='https://www.facebook.com/Zakaz.ua']");
    }

    public WebElement appleButton() {
        return getElementByXpath("//img[@src='/static/images/app-store-gray.svg']");
    }

    public WebElement politicConfi() {
        return getElementByXpath("//*[@href='/ru/policy/']");
    }
}
