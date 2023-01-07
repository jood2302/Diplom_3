package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private final String mainPageUrl = "https://stellarburgers.nomoreparties.site";
    private By loginButton = By.xpath(".//button['Войти в аккаунт']");
    private By orderButton = By.xpath(".//button['Оформить заказ']");
    private By userProfileButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Личный Кабинет')]");
    private By ingredientsButton = By.xpath(".//span[contains(@class, 'text') and (text()='Начинки')]");
    private By saucesButton = By.xpath(".//span[contains(@class, 'text') and (text()='Соусы')]");
    private By bunsButton = By.xpath(".//span[contains(@class, 'text') and (text()='Булки')]");
    private By ingredientsText = By.xpath(".//h2[contains(@class, 'text') and (text()='Начинки')]");
    private By saucesText = By.xpath(".//h2[contains(@class, 'text') and (text()='Соусы')]");
    private By bunsText = By.xpath(".//h2[contains(@class, 'text') and (text()='Булки')]");
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(mainPageUrl);
    }
    public void userLoginAccountButton() {
        driver.findElement(loginButton).click();
    }
    public void userProfileButton() {
        driver.findElement(userProfileButton).click();
    }
    public void waitMainPageForAuthorizedUser() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(orderButton));
    }
    public void waitMainPageForUnauthorizedUser() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(loginButton));
    }
    public void ingredientsButtonClick() {
        driver.findElement(ingredientsButton).click();
    }
    public void waitIngredientsTextVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(ingredientsText));
    }
    public void saucesButtonClick() {
        driver.findElement(saucesButton).click();
    }
    public void waitSaucesTextVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(saucesText));
    }
    public void bunsButtonClick() {
        driver.findElement(bunsButton).click();
    }
    public void waitBunsTextVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(bunsText));
    }
}
