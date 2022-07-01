package PullRequests.PR9;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EpicentrBasePage extends BasePage {
    public EpicentrBasePage(WebDriver driver) {
        super(driver);
    }
    public void goEpicentr() {
        driver.get("https://epicentrk.ua/");
    }
    public WebElement getCatalogProductBtn() {
        return getElementByXpath("//div[@class='header__menu-opener-button-text']");
    }
    public WebElement getLogoBtn() {
        return getElementByXpath("//img[@alt='Епіцентр']");
    }
    public WebElement getTumblerLanguageBtn() {
        return getElementByXpath("//label[@class='switch__label']");
    }
    public WebElement getAddressFieldBtn() {
        return getElementByXpath("//div[@class='header__locations-street']");
    }
    public WebElement getSearch() {
        return getElementByXpath("//div[@data-is='Search']");
    }
    public WebElement getInformationBtn() {
        return getElementByXpath("//*[@class='icon header__info-toggle-info']");
    }
    public WebElement getVugodaBtn() {
        return getElementByXpath("//a[@title='Вигода']");
    }
    public List<WebElement> getCollationBtn() {
        return getElementsByXpath("//*[@class='icon icon-compare']");
    }
    public WebElement getFavoriteBtn() {
        return getElementByXpath("//*[@class='icon icon-favorite']");
    }
    public WebElement getSingInBtn() {
        return getElementByXpath("//div[@data-is='EnterBtn']");
    }
    public WebElement getCartBtn() {
        return getElementByXpath("//div[@data-is='SmallCart']");
    }
}
