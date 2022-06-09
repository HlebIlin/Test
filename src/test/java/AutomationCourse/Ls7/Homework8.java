package AutomationCourse.Ls7;


import TestInit.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class Homework8 extends TestInit {


    @Test
    public void Zakaz() {
        openZakaz();
        maximize();
        TavriaB();
        sleep(2);
        getSearchField().click();
        sleep(3);
        driver.findElement(By.xpath("//li[@data-testid='deliveryType_pickup']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@class='RegionSelect__control css-yk16xz-control']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='react-select-3-option-0']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@data-testid='To shopping']")).click();
        sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");


    }


}


