package siteConstructorAndLogoRedirect;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.*;

public class ConstructorRedirectTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final String useremail="leo2302@mail.ru";
    private final String userpassword="leo2302";

    @Test
    @Step("Check Constructor redirect from feed page")
    public void constructorRedirectFromFeedPage() {
        FeedPage constructorRedirectFromFeedPage = new FeedPage(browserRule.driver);
        constructorRedirectFromFeedPage.open();
        constructorRedirectFromFeedPage.constructorButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Constructor redirect from profile page")
    public void constructorRedirectFromProfilePage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userLoginAccountButton();
        LoginPage loginPage = new LoginPage(browserRule.driver);
        loginPage.waitLoginPage();
        loginPage.userLogin(useremail, userpassword);
        mainPage.waitMainPageForAuthorizedUser();
        mainPage.userProfileButton();
        ProfilePage constructorRedirectFromProfilePage = new ProfilePage(browserRule.driver);
        constructorRedirectFromProfilePage.waitProfilePage();
        constructorRedirectFromProfilePage.constructorButton();
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Constructor redirect from login page")
    public void constructorRedirectFromLoginPage() {
        LoginPage constructorRedirectFromLoginPage = new LoginPage(browserRule.driver);
        constructorRedirectFromLoginPage.open();
        constructorRedirectFromLoginPage.constructorButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Constructor redirect from recovery page")
    public void constructorRedirectFromRecoveryPage() {
        RecoveryPage constructorRedirectFromRecoveryPage = new RecoveryPage(browserRule.driver);
        constructorRedirectFromRecoveryPage.open();
        constructorRedirectFromRecoveryPage.constructorButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Constructor redirect from registration page")
    public void constructorRedirectFromRegistrationPage() {
        RegistrationPage constructorRedirectFromRegistrationPage = new RegistrationPage(browserRule.driver);
        constructorRedirectFromRegistrationPage.open();
        constructorRedirectFromRegistrationPage.constructorButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
}
