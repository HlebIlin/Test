package AutomationCourse.Ls4;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class Homework4 extends TestInit {


    @Test
    public void checkZakazEko() {
        ZakazEcoHomePage zakazEcoHomePage = new ZakazEcoHomePage(driver);
        ZakazEcoMarketHomePage zakazEcoMarketHomePage = new ZakazEcoMarketHomePage(driver);
        ZakazEcoAlcoholPage zakazEcoAlcoholPage = new ZakazEcoAlcoholPage(driver);
        zakazEcoHomePage.goZkazEco();
        maximize();


        zakazEcoHomePage.goEco().click();
        zakazEcoMarketHomePage.goSearch();
        zakazEcoMarketHomePage.goTextAlcohol().sendKeys("Алкоголь \n");
        zakazEcoAlcoholPage.yes18().click();
        zakazEcoAlcoholPage.nalivkaSpokusa().click();
        zakazEcoAlcoholPage.addToCart().click();
        zakazEcoAlcoholPage.xzSho().click();
        zakazEcoAlcoholPage.novaPoshta();


    }

}
