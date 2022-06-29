package PullRequests.PR5;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFooterYesOriginal extends TestInit {
    @Test
    public void CheckHeaderYesOriginal() {
        YesOriginalHomePage1 yesOriginalHomePage1 = new YesOriginalHomePage1(driver);
        maximize();
        yesOriginalHomePage1.goYesOriginal();
        Assert.assertTrue(yesOriginalHomePage1.getReviewBtn().isDisplayed());
        Assert.assertTrue(yesOriginalHomePage1.getContactBtn().isDisplayed());
        Assert.assertTrue(yesOriginalHomePage1.getSiteMapBtn().isDisplayed());
        Assert.assertTrue(yesOriginalHomePage1.getLoyaltyProgramBtn().isDisplayed());
        Assert.assertTrue(yesOriginalHomePage1.getDeliveryPayment().isDisplayed());



    }
}
