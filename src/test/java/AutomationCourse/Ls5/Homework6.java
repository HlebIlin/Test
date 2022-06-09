package AutomationCourse.Ls5;

import TestInit.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework6 extends TestInit {


    @Test

    public void rozetka() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/");
        driver.manage().window().maximize();
        sleep(2);
        driver.findElement(By.xpath("//input[@name='search']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("coca-cola\n");
        sleep(2);
        driver.findElement(By.xpath("//div[@data-goods-id='340229965']")).click();


    }
}
