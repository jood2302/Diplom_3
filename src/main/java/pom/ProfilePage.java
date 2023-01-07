package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    private WebDriver driver;
    private By userExitButton = By.xpath(".//button['Выход']");
    private By constructorButton = By.xpath(".//p[contains(@class, 'AppHeader') and (text()='Конструктор')]");
    private By logoButton = By.xpath(".//*[local-name()='svg' and @fill='none']");
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }
    public void waitProfilePage() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(userExitButton));
    }
    public void userLogoutButton() {
        driver.findElement(userExitButton).click();
    }
    public void constructorButton() {
        driver.findElement(constructorButton).click();
    }
    public void logoButton() {
        driver.findElement(logoButton).click();
    }
}
