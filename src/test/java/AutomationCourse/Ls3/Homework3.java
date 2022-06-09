package AutomationCourse.Ls3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework3 {
     @Test
    public void Rozetka(){
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://rozetka.com.ua/ua/game-zone/c80261/");
         driver.findElement(By.xpath("//img[@alt='Ігрові ноутбуки']")).click();



    }
}
