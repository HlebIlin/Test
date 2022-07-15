package AutomationCourse.Ls7;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zakaza1HomePage extends BasePage {
    public Zakaza1HomePage(WebDriver driver) {
        super(driver);
    }

    public void goZakaz() {
        driver.get("https://zakaz.ua/ru/");
    }

    public WebElement tavriaB() {
        return getElementByXpath("//a[@href='https://tavriav.zakaz.ua/ru/']");
    }
}