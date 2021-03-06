package AutomationCourse.Ls9;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework8 extends TestInit {

    @Test
    public void checkHeader() {
        TeslaHomePage teslaHomePage = new TeslaHomePage(driver);
        teslaHomePage.goToTesla();
        maximize();


        Assert.assertTrue(teslaHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(teslaHomePage.getModels3().isDisplayed());
        Assert.assertTrue(teslaHomePage.getModelX().isDisplayed());
        Assert.assertTrue(teslaHomePage.getModelY().isDisplayed());
        Assert.assertTrue(teslaHomePage.getSolarRoof().isDisplayed());
        Assert.assertTrue(teslaHomePage.getSolarPanels().isDisplayed());
        Assert.assertTrue(teslaHomePage.getShop().isDisplayed());
        Assert.assertTrue(teslaHomePage.getAccount().isDisplayed());
        Assert.assertTrue(teslaHomePage.getMenu().isDisplayed());


    }

    @Test
    public void checkShop() {
        TeslaHomePage teslaHomePage = new TeslaHomePage(driver);
        TeslaShop teslaShop = new TeslaShop(driver);
        teslaHomePage.goToTesla();
        maximize();

        teslaHomePage.getShop().click();
        Assert.assertTrue(teslaShop.getTeslaShop().isDisplayed());

    }

    @Test
    public void checkCustomOrder() {
        TeslaHomePage teslaHomePage = new TeslaHomePage(driver);
        teslaHomePage.goToTesla();
        maximize();

        teslaHomePage.getCustomOrder().click();


    }


}


