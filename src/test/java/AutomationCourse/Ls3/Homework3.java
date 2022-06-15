package AutomationCourse.Ls3;

import TestInit.TestInit;
import org.testng.annotations.Test;

public class Homework3 extends TestInit {


    @Test
    public void checkDeviceGames() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        RozetkaGamersDevaicePage rozetkaGamersDevaicePage = new RozetkaGamersDevaicePage(driver);
        rozetkaHomePage.goRozetka();
        maximize();

        rozetkaHomePage.goDeviceOfGamers().click();
        rozetkaGamersDevaicePage.goGamersLaptop().click();


    }

}
