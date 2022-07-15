package PullRequests.PR2;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class CheckQuantityProductInCart extends TestInit {
    @Test
    public void checkQuantityProductInCart() {
        ZakazBasePage zakazBasePage = new ZakazBasePage(driver);
        AuchanBasePage auchanBasePage = new AuchanBasePage(driver);
        ColaHomePage colaHomePage = new ColaHomePage(driver);
        maximize();
        zakazBasePage.goZakazOpen();

        zakazBasePage.getAuchanBtn().click();
        auchanBasePage.getSearchField().click();
        auchanBasePage.getSearchField().sendKeys("cola\n");
        colaHomePage.yes18().click();
        colaHomePage.getCola2LBtn().get(0).click();
        colaHomePage.getAddToCartBtn().click();
        colaHomePage.getPickUpBtn().click();
        colaHomePage.getLocationBtn().click();
        colaHomePage.getDneprBtn().click();
        colaHomePage.getToShoppingBtn().click();


    }
}

