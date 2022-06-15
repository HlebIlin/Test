package AutomationCourse.Ls5;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EldoradoIphoneHomePage extends BasePage {
    public EldoradoIphoneHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement go13ProMaxIphone() {
        return getElementByXpath("//img[@src='https://i.eldorado.ua//240x220/goods_images/1038946/7385159-1631699186.jpg']");
    }

    public WebElement go11Iphone() {
        return getElementByXpath("//img[@title='Смартфон APPLE iPhone 11 128GB Black (MHDH3FS/A)']");
    }

    public WebElement go12Iphone() {
        return getElementByXpath("//img[@alt='Смартфон APPLE iPhone 12 64GB Black (MGJ53FS/A)']");
    }
}
