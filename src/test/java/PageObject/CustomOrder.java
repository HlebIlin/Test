package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomOrder extends BasePage {

    public CustomOrder(WebDriver driver) {
        super(driver);
    }
    public WebElement getCustomOrder(){
        return driver.findElement(By.xpath("//*[@id='block-tesla-frontend-content']"));
    }
}
