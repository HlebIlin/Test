package AutomationCourse.Ls3;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public void goRozetka() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public WebElement goDeviceOfGamers() {
        return getElementByXpath("//*[@class='menu-categories__link'][@href='https://rozetka.com.ua/ua/game-zone/c80261/']");
    }
}
