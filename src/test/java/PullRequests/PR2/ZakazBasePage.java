package PullRequests.PR2;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazBasePage extends BasePage {
    public ZakazBasePage(WebDriver driver) {
        super(driver);
    }

    public void goZakazOpen() {
        driver.get("https://zakaz.ua/ru/");
    }

    public WebElement getAuchanBtn() {
        return getElementByXpath("//img[@alt='Auchan']");
    }
}
