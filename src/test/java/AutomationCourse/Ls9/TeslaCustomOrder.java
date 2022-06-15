package AutomationCourse.Ls9;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeslaCustomOrder extends BasePage {

    public TeslaCustomOrder(WebDriver driver) {
        super(driver);
    }

    public WebElement getCustomOrder() {
        return driver.findElement(By.xpath("//*[@id='block-tesla-frontend-content']"));
    }
}
