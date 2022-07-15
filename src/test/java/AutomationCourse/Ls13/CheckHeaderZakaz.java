package AutomationCourse.Ls13;

import TestInit.TestInit;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHeaderZakaz extends TestInit {
    @Test
    public void checkHeader(){
        HeaderZakazHomePage headerZakazHomePage = new HeaderZakazHomePage(driver);
        maximize();
        headerZakazHomePage.goZakazOpen();

        Assert.assertTrue(headerZakazHomePage.checkLogo().isDisplayed());
        Assert.assertTrue(headerZakazHomePage.checkLanguage().isDisplayed());
        Assert.assertTrue(headerZakazHomePage.checkPartners().isDisplayed());
        Assert.assertTrue(headerZakazHomePage.checkChoiceShop().isDisplayed());



    }
}
