package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoveryPage {
    private WebDriver driver;
    private final String registrationUrl = "https://stellarburgers.nomoreparties.site/forgot-password";
    private By userLoginButton = By.xpath(".//a[contains(@class, 'Auth_link') and (text()='Войти')]");
    private By constructorButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Конструктор')]");
    private By logoButton = By.xpath(".//*[local-name()='svg' and @fill='none']");
    public RecoveryPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(registrationUrl);
    }
    public void userLoginButton() {
        driver.findElement(userLoginButton).click();
    }
    public void constructorButton() {
        driver.findElement(constructorButton).click();
    }
    public void logoButton() {
        driver.findElement(logoButton).click();
    }
}
