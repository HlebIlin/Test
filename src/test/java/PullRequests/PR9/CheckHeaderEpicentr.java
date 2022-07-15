package PullRequests.PR9;

import TestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHeaderEpicentr extends TestInit {
    @Test
    public void CheckHeaderEpicentr() {
        EpicentrBasePage epicentrBasePage = new EpicentrBasePage(driver);
        maximize();
        epicentrBasePage.goEpicentr();
        Assert.assertTrue(epicentrBasePage.getCatalogProductBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getLogoBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getTumblerLanguageBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getAddressFieldBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getSearch().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getInformationBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getVugodaBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getCollationBtn().get(0).isDisplayed());
        Assert.assertTrue(epicentrBasePage.getFavoriteBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getSingInBtn().isDisplayed());
        Assert.assertTrue(epicentrBasePage.getCartBtn().isDisplayed());
    }
}
