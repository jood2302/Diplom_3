package userProfileTest;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.LoginPage;
import pom.MainPage;
import pom.ProfilePage;

public class UserProfileTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final String useremail="leo2302@mail.ru";
    private final String userpassword="leo2302";

    @Test
    @Step("Check Authorized User click profile page")
    public void userAuthorizedProfilePage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userLoginAccountButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
        userLoginPage.userLogin(useremail, userpassword);
        mainPage.waitMainPageForAuthorizedUser();
        mainPage.userProfileButton();
        ProfilePage userProfilePage = new ProfilePage(browserRule.driver);
        userProfilePage.waitProfilePage();
    }
    @Test
    @Step("Check UnAuthorized User click profile page")
    public void userUnauthorizedProfilePage() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.userProfileButton();
        LoginPage userLoginPage = new LoginPage(browserRule.driver);
        userLoginPage.waitLoginPage();
    }
}
