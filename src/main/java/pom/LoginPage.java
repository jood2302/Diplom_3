package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private final String loginUrl = "https://stellarburgers.nomoreparties.site/login";
    private By email = By.xpath(".//div[contains(label, 'Email')]/input[@name='name']");
    private By password = By.xpath(".//input[@name='Пароль']");
    private By loginnButton = By.xpath(".//button[text()='Войти']");
    private By loginText = By.xpath(".//div[contains(h2, 'Вход')]");
    private By constructorButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Конструктор')]");
    private By logoButton = By.xpath(".//*[local-name()='svg' and @fill='none']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void open() {
        driver.get(loginUrl);
    }
    public void waitLoginPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(loginText));
    }
    public void userLogin(String useremail, String userpasswod) {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(useremail);
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(userpasswod);
        driver.findElement(loginnButton).click();
    }
    public void constructorButton() {
        driver.findElement(constructorButton).click();
    }
    public void logoButton() {
        driver.findElement(logoButton).click();
    }

}
