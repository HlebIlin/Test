package PullRequests.PR3;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazBasePage1 extends BasePage {
    public ZakazBasePage1(WebDriver driver) {
        super(driver);
    }

    public void goZakazOpen() {
        driver.get("https://zakaz.ua/ru/");
    }

    public WebElement getSupportVsuBtn() {
        return getElementByXpath("//a[@class='jsx-1383361387 ZsuHelp__donateButton']");
    }
}
