package PullRequests.PR6;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartHomePage3 extends BasePage {
    public CartHomePage3(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getAddSomeProduct() {
        return getElementsByXpath("//button[@data-portion='1']");
    }
    public WebElement getCheckOutBtn() {
        return getElementByXpath("//button[@class='purchase-btn btn btn--1 btn--blue ']");
    }
}
