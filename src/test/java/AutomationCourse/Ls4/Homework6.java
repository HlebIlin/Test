package AutomationCourse.Ls4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework6 {
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void checkNovaPoshta () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get ("https://zakaz.ua/ru/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='EKO']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Алкоголь \n");
        sleep(2);
        driver.findElement(By.xpath("//button[@data-testid='buttonYes']")).click();
        driver.findElement(By.xpath("//img[@alt='Набор подарочный №3 Бурбон Bulleit 0,7л 3шт + набор коктейльных бокалов Bulleit Jar 6шт']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='BigProductCardTopInfo__addButtons']")).click();
        sleep(2);
        driver.findElement(By.xpath("//li[@class='Tab Tab_rounded Tab_rounded_selected']")).click();
        driver.findElement(By.xpath("//li[@data-testid='deliveryType_novaPoshta']")).click();








    }

}
