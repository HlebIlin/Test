package PullRequests.PR4;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAddCartProduct extends TestInit {
    @Test
    public void CheckAddCartProduct() {
        YesOriginalHomePage yesOriginalHomePage = new YesOriginalHomePage(driver);
        ManProductHomePage manProductHomePage = new ManProductHomePage(driver);
        HudiHomePage hudiHomePage = new HudiHomePage(driver);
        maximize();
        yesOriginalHomePage.goYesOriginal();
        yesOriginalHomePage.CheckManCatalogIMG().click();
        manProductHomePage.CheckHudiNB().get(0).click();
        hudiHomePage.choiceSizeHydi().get(3).click();
        hudiHomePage.choiceDataDelivery().get(7);
        Assert.assertTrue(hudiHomePage.getAddCartButton().isDisplayed());


    }
}
