package TestInit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public class TestInit {

    protected WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public void openEldorado (){

        driver.get("https://eldorado.ua/");
    }
    public void maximize (){

        driver.manage().window().maximize();
    }
    public void TavriaB (){
        driver.findElement(By.xpath("//img[@alt='Таврія В']")).click();

    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//div[@data-marker-store-id='default']"));

    }

    @AfterMethod
    public void finishSession() {
        driver.quit();
    }
    public void openZakaz (){

        driver.get("https://zakaz.ua/ru/");
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}




