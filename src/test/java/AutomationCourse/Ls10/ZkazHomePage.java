package AutomationCourse.Ls10;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZkazHomePage extends BasePage {

    public ZkazHomePage(WebDriver driver) {
        super(driver);
    }

    public void goZakaz() {
        driver.get("https://zakaz.ua/ru/");

    }

    public WebElement goVarus() {
        return getElementByXpath("//img[@alt='Varus']");
    }

}