package AutomationCourse.Ls10;

import AutomationCourse.PageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VarusBakaliaHomePage extends BasePage {
    public VarusBakaliaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkTMDrOetker() {
        return getElementByXpath("//*[text()='TM Dr.Oetker']");
    }

    public WebElement checkTMAXA() {
        return getElementByXpath("//*[text()='TM AXA']");
    }

    public WebElement checkTMDolinaJelaniy() {
        return getElementByXpath("//*[text()='ТМ Долина Желаний']");
    }

    public WebElement checkMuka() {
        return getElementByXpath("//*[text()='Мука']");
    }

    public WebElement checkKrupuiBobovue() {
        return getElementByXpath("//*[text()='Крупы и бобовые']");
    }

    public WebElement checkPasta() {
        return getElementByXpath("//*[text()='Макаронные изделия']");
    }

    public WebElement checkButter() {
        return getElementByXpath("//*[text()='Масло и уксус']");
    }

    public WebElement checkSugar() {
        return getElementByXpath("//*[text()='Сахар']");
    }

    public WebElement checkSuxoiZavtrak() {
        return getElementByXpath("//*[text()='Сухие завтраки и каши']");
    }

    public WebElement checkSalt() {
        return getElementByXpath("//*[text()='Соль']");
    }

    public WebElement checkNuts() {
        return getElementByXpath("//*[text()='Орехи и сухофрукты']");
    }

    public WebElement checkPolufabrikat() {
        return getElementByXpath("//*[text()='Продукты быстрого приготовления']");
    }

    public WebElement checkKonservu() {
        return getElementByXpath("//*[text()='Консервы']");
    }

    public WebElement checkSouse() {
        return getElementByXpath("//*[text()='Соусы, майонез, заправки']");
    }

    public WebElement checkPripravu() {
        return getElementByXpath("//*[text()='Приправы и специи']");
    }

    public WebElement checkSweetKonserva() {
        return getElementByXpath("//*[text()='Сладкая консервация']");
    }

    public WebElement checkSoda() {
        return getElementByXpath("//*[text()='Сода и крахмал']");
    }

    public WebElement checkDesigen() {
        return getElementByXpath("//*[text()='Добавки для выпечки и десертов']");
    }

    public WebElement checkOrganicProduct() {
        return getElementByXpath("//*[text()='Органические продукты']");
    }

    public WebElement checkSushi() {
        return getElementByXpath("//*[text()='Все для суши']");
    }
}