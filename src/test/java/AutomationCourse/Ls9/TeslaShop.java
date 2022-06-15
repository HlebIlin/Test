package AutomationCourse.Ls9;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeslaShop extends BasePage {

    public TeslaShop(WebDriver driver) {
        super(driver);
    }

    public WebElement getTeslaShop() {
        return driver.findElement(By.xpath("//a[text()='Charging']"));

    }
}