package PullRequests.PR4;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class YesOriginalHomePage extends BasePage {
    public YesOriginalHomePage(WebDriver driver) {
        super(driver);
    }

    public void goYesOriginal() {
        driver.get("https://yesoriginal.com.ua/ru");
    }

    public WebElement CheckManCatalogIMG() {
        return getElementByXpath("//img[@src='/image/catalog/yesoriginal/man.webp']");
    }
}
