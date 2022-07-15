package PullRequests.PR6;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAddCartSomeProduct extends TestInit {
    @Test
    public void CheckAddCartSomeProduct() {
        EpicentrHomePage epicentrHomePage = new EpicentrHomePage(driver);
        LobzikHomePage lobzikHomePage = new LobzikHomePage(driver);
        LobzikCompassDl2306HomePage lobzikCompassDl2306HomePage = new LobzikCompassDl2306HomePage(driver);
        CartHomePage3 cartHomePage3 = new CartHomePage3(driver);
        maximize();
        epicentrHomePage.goEpicenrtpage();
        epicentrHomePage.getSearch().sendKeys("Лобзик\n");
        lobzikHomePage.getLobzikCompassDL2306BuyBtn().get(1).click();
        lobzikCompassDl2306HomePage.getBuyBtn().get(0).click();
        for (int i = 0; i < 4; i++) {
            cartHomePage3.getAddSomeProduct().get(1).click();
        }
        Assert.assertTrue(cartHomePage3.getCheckOutBtn().isDisplayed());

    }
}
