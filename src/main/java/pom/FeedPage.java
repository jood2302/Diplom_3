package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedPage {
    private WebDriver driver;
    private final String feednUrl = "https://stellarburgers.nomoreparties.site/feed";
    private By userLoginButton = By.xpath(".//a[contains(@class, 'Auth_link') and (text()='Войти')]");
    private By constructorButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Конструктор')]");
    private By logoButton = By.xpath(".//*[local-name()='svg' and @fill='none']");
    public FeedPage(WebDriver driver){
        this.driver = driver;
    }

    public void open() {
        driver.get(feednUrl);
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
