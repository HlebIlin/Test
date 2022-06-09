package AutomationCourse.Ls5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson5 {

           public void sleep(int seconds){
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        @Test

        public void Novus () {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://novus.zakaz.ua/ru/");
            driver.manage().window().maximize();
            sleep(3);
            driver.findElement(By.xpath("//div[@data-marker='Address']")).click();
            sleep(2);
            driver.findElement(By.xpath("//li[@data-testid='deliveryType_pickup']")).click();
            sleep(2);
            driver.findElement(By.xpath("//div[@data-marker='Locality']")).click();
            sleep(3);
            driver.findElement(By.xpath("//div[@data-market='Locality']")).sendKeys("Ровно \n");
            driver.findElement(By.xpath("//a[@data-testid='product-tile'")).click();


        }

    }




