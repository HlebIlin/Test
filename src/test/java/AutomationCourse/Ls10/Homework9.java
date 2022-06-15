package AutomationCourse.Ls10;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework9 extends TestInit {

    @Test
    public void checkBuyZakaz() {
        ZkazHomePage zkazHomePage = new ZkazHomePage(driver);
        VarusHomePage varusHomePage = new VarusHomePage(driver);
        VarusMeetChoise varusMeetChoise = new VarusMeetChoise(driver);
        VarusFreshMeat varusFreshMeat = new VarusFreshMeat(driver);
        VarusCart varusCart = new VarusCart(driver);
        OrderPage orderPage = new OrderPage(driver);
        zkazHomePage.goZakaz();
        maximize();

        zkazHomePage.goVarus().click();
        varusHomePage.choiseMeat().click();
        varusMeetChoise.varusMeetChoise().click();
        varusFreshMeat.varusChiseFreshMeat().click();
        varusFreshMeat.meatToCart().click();
        varusFreshMeat.choiceDelivery().click();
        varusFreshMeat.choiceLocality().click();
        varusFreshMeat.choiceCity().click();
        varusFreshMeat.toShopping().click();
        varusCart.meatQuantity().click();
        varusCart.cart().click();
        varusCart.add().click();
        orderPage.phoneNumber().sendKeys("+380932230047");
        orderPage.password().sendKeys("968531");
        orderPage.enter().click();
        Assert.assertTrue(orderPage.goOrderButton().isDisplayed());

    }


}

