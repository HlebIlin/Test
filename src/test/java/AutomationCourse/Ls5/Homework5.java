package AutomationCourse.Ls5;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class Homework5 extends TestInit {

    @Test

    public void eldorado() {
        EldorapoHomePage eldorapoHomePage = new EldorapoHomePage(driver);
        EldoradoIphoneHomePage eldoradoIphoneHomePage = new EldoradoIphoneHomePage(driver);
        EldoradoBuyIphone eldoradoBuyIphone = new EldoradoBuyIphone(driver);
        EldoradoCartPage eldoradoCartPage = new EldoradoCartPage(driver);
        eldorapoHomePage.openEldorado();

        maximize();

        eldorapoHomePage.pushSearch().click();
        eldorapoHomePage.pushSearch().sendKeys("IPhone 13 pro max\n");
        eldoradoIphoneHomePage.go13ProMaxIphone().click();
        eldoradoBuyIphone.buyIphone().click();
        eldoradoBuyIphone.basketButton().click();
        for (int i = 0; i < 4; i++) {
            eldoradoCartPage.cartIphone().click();
        }
        eldorapoHomePage.openEldorado();
        eldorapoHomePage.pushSearch().click();
        eldorapoHomePage.pushSearch().sendKeys("Iphone 11\n");
        eldoradoIphoneHomePage.go11Iphone().click();
        eldoradoBuyIphone.buyIphone().click();
        eldoradoBuyIphone.basketButton().click();
        for (int i = 0; i < 4; i++) {
            eldoradoCartPage.cartIphone().click();
        }
        eldorapoHomePage.openEldorado();
        eldorapoHomePage.pushSearch().click();
        eldorapoHomePage.pushSearch().sendKeys("Iphone 12\n");
        eldoradoIphoneHomePage.go12Iphone().click();
        eldoradoBuyIphone.buyIphone().click();
        eldoradoBuyIphone.basketButton().click();
        for (int i = 0; i < 4; i++) {
            eldoradoCartPage.cartIphone().click();
        }

    }
}