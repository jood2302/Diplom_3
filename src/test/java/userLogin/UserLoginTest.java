package userLogin;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.LoginPage;
import pom.MainPage;
import pom.RecoveryPage;
import pom.RegistrationPage;


public class UserLoginTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final String useremail="leo2302@mail.ru";
    private final String userpassword="leo2302";

    @Test
    @Step("Check User login from main page")
    public void userLoginFromMainPage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userLoginAccountButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
        userLoginPage.userLogin(useremail, userpassword);
        mainPage.waitMainPageForAuthorizedUser();
    }

    @Test
    @Step("Check User login from profile page")
    public void userLoginFromProfilePage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userProfileButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
        userLoginPage.userLogin(useremail, userpassword);
        mainPage.waitMainPageForAuthorizedUser();
    }
    @Test
    @Step("Check User login from registration page")
    public void userLoginFromRegistrationPage() {
        RegistrationPage registrationPage = new RegistrationPage(browserRule.driver);
        registrationPage.open();
        registrationPage.userLoginButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
        userLoginPage.userLogin(useremail, userpassword);
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForAuthorizedUser();
    }
    @Test
    @Step("Check User login from recovery page")
    public void userLoginFromRecoveryPage() {
        RecoveryPage recoveryPage = new RecoveryPage(browserRule.driver);
        recoveryPage.open();
        recoveryPage.userLoginButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
        userLoginPage.userLogin(useremail, userpassword);
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.waitMainPageForAuthorizedUser();
    }
}
