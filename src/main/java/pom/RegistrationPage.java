package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;
    private final String registrationUrl = "https://stellarburgers.nomoreparties.site/register";
    private By name = By.xpath(".//div[contains(label, 'Имя')]/input[@name='name']");
    private By email = By.xpath(".//div[contains(label, 'Email')]/input[@name='name']");
    private By password = By.xpath(".//input[@name='Пароль']");
    private By registrationButton = By.xpath(".//button[text()='Зарегистрироваться']");
    private By errorMessageAboutPassword = By.xpath(".//div[contains(p, 'Некорректный пароль')]");
    private By userLoginButton = By.xpath(".//a[contains(@class, 'Auth_link') and (text()='Войти')]");
    private By constructorButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Конструктор')]");
    private By logoButton = By.xpath(".//*[local-name()='svg' and @fill='none']");
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(registrationUrl);
    }

    public void userRegistration(String username, String useremail, String userpasswod) {
        driver.findElement(name).click();
        driver.findElement(name).sendKeys(username);
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(useremail);
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(userpasswod);
        driver.findElement(registrationButton).click();
    }

    public void userHasShortPassword() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(errorMessageAboutPassword));
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