package AutomationCourse.Ls9;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeslaHomePage extends BasePage {

    public TeslaHomePage(WebDriver driver) {
        super(driver);
    }

    public void goToTesla() {
        driver.get("https://www.tesla.com/");
    }

    public WebElement getLogoImage() {
        return driver.findElement(By.xpath("//a[@aria-label='Tesla Logo']"));
    }

    public WebElement getModelS() {
        return driver.findElement(By.xpath("//a[@title='Model S']"));
    }

    public WebElement getModels3() {
        return driver.findElement(By.xpath("//a[@title='Model 3']"));
    }

    public WebElement getModelX() {
        return driver.findElement(By.xpath("//a[@title='Model X']"));
    }

    public WebElement getModelY() {
        return driver.findElement(By.xpath("//a[@title='Model Y']"));
    }

    public WebElement getSolarRoof() {
        return driver.findElement(By.xpath("//a[@title='Solar Roof']"));
    }

    public WebElement getSolarPanels() {
        return driver.findElement(By.xpath("//a[@title='Solar Panels']"));
    }

    public WebElement getShop() {
        return driver.findElement(By.xpath("//a[@title='Shop']"));
    }

    public WebElement getAccount() {
        return driver.findElement(By.xpath("//a[@title='Account']"));
    }

    public WebElement getMenu() {
        return driver.findElement(By.xpath("//button[@title='Menu']"));
    }

    public WebElement getCustomOrder() {
        return driver.findElement(By.xpath("//*[@id='block-tesla-frontend-content']"));
    }
}