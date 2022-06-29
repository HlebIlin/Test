package PullRequests.PR1;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class CheckZakazList extends TestInit {
    @Test
    public void checkInfoPayment() {
        ZakazHomePageList zakazHomePageList = new ZakazHomePageList(driver);
        ZakazHelpHomePage zakazHelpHomePage = new ZakazHelpHomePage(driver);
        maximize();
        zakazHomePageList.goZakazOpen();

        zakazHomePageList.getHelpInHeaderBtn().get(0).click();
        zakazHelpHomePage.getPaymentBtn().click();


    }

}
