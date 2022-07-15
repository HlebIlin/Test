package PullRequests.PR3;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class CheckSupportVSU extends TestInit {
    @Test
    public void CheckSupportVSU() {
        ZakazBasePage1 zakazBasePage1 = new ZakazBasePage1(driver);
        HomePagePayment homePagePayment = new HomePagePayment(driver);
        maximize();
        zakazBasePage1.goZakazOpen();
        zakazBasePage1.getSupportVsuBtn().click();
        homePagePayment.getAmountBtn().sendKeys(" 1000\n");
        homePagePayment.getCartNamberBtn().sendKeys("123456789123\n");
        homePagePayment.getMMYYBtn().sendKeys("1234\n");
        homePagePayment.getCardCVVbtn().sendKeys("123\n");
        homePagePayment.getPayBtn().get(0);


    }


}
