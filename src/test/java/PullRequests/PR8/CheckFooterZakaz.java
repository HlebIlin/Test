package PullRequests.PR8;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFooterZakaz extends TestInit {

    @Test
    public void checkZakaz() {
        HomePageZakaz homePageZakaz = new HomePageZakaz(driver);
        maximize();
        homePageZakaz.goZakazOpen();

        Assert.assertTrue(homePageZakaz.helpButton().isDisplayed());
        Assert.assertTrue(homePageZakaz.facebookButton().isDisplayed());
        Assert.assertTrue(homePageZakaz.appleButton().isDisplayed());
        Assert.assertTrue(homePageZakaz.politicConfi().isDisplayed());


    }
}
