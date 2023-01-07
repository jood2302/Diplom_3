package userLogout;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.LoginPage;
import pom.MainPage;
import pom.ProfilePage;

public class UserLogoutTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    private final String useremail="leo2302@mail.ru";
    private final String userpassword="leo2302";

    @Test
    @Step("Check User logout from profile page")
    public void userLogoutFromProfilePage() {
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
        userProfilePage.userLogoutButton();
        userLoginPage.waitLoginPage();
    }
}
