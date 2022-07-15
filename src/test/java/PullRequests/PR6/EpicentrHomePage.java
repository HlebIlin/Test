package PullRequests.PR6;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EpicentrHomePage extends BasePage {
    public EpicentrHomePage(WebDriver driver) {
        super(driver);
    }
    public void goEpicenrtpage() {
        driver.get("https://epicentrk.ua/");
    }
    public WebElement getSearch() {
        return getElementByXpath("//input[@placeholder='Пошук']");
    }
}
