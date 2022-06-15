package AutomationCourse.Ls10;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusHomePage extends BasePage {
    public VarusHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement choiseMeat() {
        return getElementByXpath("//li[@title='Мясо, рыба, птица']");
    }

    public WebElement choiceBakalia() {
        return getElementByXpath("//li[@title='Бакалея']");
    }
}
