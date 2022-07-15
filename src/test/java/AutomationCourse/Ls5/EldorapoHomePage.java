package AutomationCourse.Ls5;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EldorapoHomePage extends BasePage {
    public EldorapoHomePage(WebDriver driver) {
        super(driver);
    }

    public void openEldorado() {

        driver.get("https://eldorado.ua/");
    }

    public WebElement pushSearch() {
        return getElementByXpath("//input[@class='search-input']");
    }
}
