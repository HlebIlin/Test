package AutomationCourse.Ls4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lesson4cont {
    @Test
    public void openGlovo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://glovoapp.com/");
        driver.findElement(By.xpath("//div[@data-test-id='address-input-placeholder']")).click();
        driver.findElement(By.xpath("//div[@data-test-id='address-input-autocomplete']")).click();
        driver.findElement(By.xpath("//div[@data-test-id='address-input-autocomplete']"));
    }
}
