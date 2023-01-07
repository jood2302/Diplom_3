package siteConstructorAndLogoRedirect;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.*;

public class LogoRedirectTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final String useremail="leo2302@mail.ru";
    private final String userpassword="leo2302";

    @Test
    @Step("Check Logo redirect from feed page")
    public void logoRedirectFromFeedPage() {
        FeedPage logoRedirectFromFeedPage = new FeedPage(browserRule.driver);
        logoRedirectFromFeedPage.open();
        logoRedirectFromFeedPage.logoButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Logo redirect from profile page")
    public void logoRedirectFromProfilePage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userLoginAccountButton();
        LoginPage loginPage = new LoginPage(browserRule.driver);
        loginPage.waitLoginPage();
        loginPage.userLogin(useremail, userpassword);
        mainPage.waitMainPageForAuthorizedUser();
        mainPage.userProfileButton();
        ProfilePage logoRedirectFromProfilePage = new ProfilePage(browserRule.driver);
        logoRedirectFromProfilePage.waitProfilePage();
        logoRedirectFromProfilePage.logoButton();
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Logo redirect from login page")
    public void logoRedirectFromLoginPage() {
        LoginPage logoRedirectFromLoginPage = new LoginPage(browserRule.driver);
        logoRedirectFromLoginPage.open();
        logoRedirectFromLoginPage.logoButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Logo redirect from recovery page")
    public void logoRedirectFromRecoveryPage() {
        RecoveryPage logoRedirectFromRecoveryPage = new RecoveryPage(browserRule.driver);
        logoRedirectFromRecoveryPage.open();
        logoRedirectFromRecoveryPage.logoButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
    @Test
    @Step("Check Logo redirect from registration page")
    public void logoRedirectFromRegistrationPage() {
        RegistrationPage logoRedirectFromRegistrationPage = new RegistrationPage(browserRule.driver);
        logoRedirectFromRegistrationPage.open();
        logoRedirectFromRegistrationPage.logoButton();
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForUnauthorizedUser();
    }
}
