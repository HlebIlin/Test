package AutomationCourse.Ls5;

import TestInit.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Homework7 extends TestInit {

    @Test

    public void eldorado() {
        openEldorado();
        maximize();
        sleep(2);
        WebDriver driver = null;
        driver.findElement(By.xpath("//input[@class='search-input']")).click();
        driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("IPhone 12 pro max\n");
        sleep(2);
        driver.findElement(By.xpath("//img[@alt='Смартфон APPLE iPhone 12 Pro Max 512GB Silver (MGDK3FS/A)']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@class='button']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class='basket-button']")).click();
        sleep(2);
        for (int i = 0; i <4; i++) {
            sleep(2);
            driver.findElement(By.xpath("//div[@class='increase change-number']")).click();
        }

        driver.findElement(By.xpath("//*[@title='eldorado.ua - ради семей']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@class='search-input']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("Iphone 11\n");
        sleep(2);
        driver.findElement(By.xpath("//img[@title='Смартфон APPLE iPhone 11 128GB Black (MHDH3FS/A)']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@class='button']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class='basket-button']")).click();
        sleep(2);
        for (int i = 0; i <4; i++) {
            sleep(2);
            driver.findElement(By.xpath("//div[@class='increase change-number']")).click();
        }
        driver.findElement(By.xpath("//*[@title='eldorado.ua - ради семей']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@class='search-input']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("Iphone 12\n");
        sleep(2);
        driver.findElement(By.xpath("//img[@alt='Смартфон APPLE iPhone 12 64GB Black (MGJ53FS/A)']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@class='button']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class='basket-button']")).click();
        sleep(2);
        for (int i = 0; i <4; i++) {
            sleep(2);
            driver.findElement(By.xpath("//div[@class='increase change-number']")).click();
        }





    }
}