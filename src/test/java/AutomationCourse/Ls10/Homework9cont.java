package AutomationCourse.Ls10;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework9cont extends TestInit {
    @Test
    public void checkBakalia() {
        ZkazHomePage zkazHomePage = new ZkazHomePage(driver);
        VarusHomePage varusHomePage = new VarusHomePage(driver);
        VarusBakaliaHomePage varusBakaliaHomePage = new VarusBakaliaHomePage(driver);
        VarusSugarPage varusSugarPage = new VarusSugarPage(driver);
        maximize();
        zkazHomePage.goZakaz();

        zkazHomePage.goVarus().click();
        varusHomePage.choiceBakalia().click();
        Assert.assertTrue(varusBakaliaHomePage.checkTMDrOetker().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkTMAXA().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkTMDolinaJelaniy().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkMuka().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkKrupuiBobovue().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkPasta().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkButter().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSugar().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSuxoiZavtrak().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSalt().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkNuts().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkPolufabrikat().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkKonservu().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSouse().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkPripravu().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSweetKonserva().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSoda().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkDesigen().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkOrganicProduct().isDisplayed());
        Assert.assertTrue(varusBakaliaHomePage.checkSushi().isDisplayed());
        varusBakaliaHomePage.checkSugar().click();
        varusSugarPage.sugarBuy().click();
        Assert.assertTrue(varusSugarPage.sugarCart().isDisplayed());


    }
}
