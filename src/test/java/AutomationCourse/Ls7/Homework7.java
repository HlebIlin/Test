package AutomationCourse.Ls7;


import TestInit.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class Homework7 extends TestInit {


    @Test
    public void zakaz() {
        Zakaza1HomePage zakaza1HomePage = new Zakaza1HomePage(driver);
        TavriaBHomePage tavriaBHomePage = new TavriaBHomePage(driver);
        zakaza1HomePage.goZakaz();
        maximize();

        zakaza1HomePage.tavriaB().click();
        tavriaBHomePage.clickAddress().click();
        tavriaBHomePage.deliveryTakeAway().click();
        tavriaBHomePage.choiceCity().click();
        tavriaBHomePage.choiceNikolayev().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");

    }


}


