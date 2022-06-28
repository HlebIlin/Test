package PullRequests.PR1;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ZakazHomePageList extends BasePage {
    public ZakazHomePageList(WebDriver driver) {
        super(driver);
    }
    public void goZakazOpen() {
        driver.get("https://zakaz.ua/ru/");
    }
    public List<WebElement> getHelpInHeaderBtn(){
        return getElementsByXpath("//a[@href='/ru/help/']");
    }

}
