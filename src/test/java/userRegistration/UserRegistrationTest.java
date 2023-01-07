package userRegistration;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.LoginPage;
import pom.RegistrationPage;

import java.util.Random;

public class UserRegistrationTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    Random rand = new Random();
    private int data = rand.nextInt(1000);
    private final String username="tester";
    private final String useremail="tester@mail.ru";
    private final String userpassword="12345";

    @Test
    @Step("Check User successfully registered")
    public void userSuccessesRegistration() {
        RegistrationPage userRegistration = new RegistrationPage(browserRule.driver);
        userRegistration.open();
        userRegistration.userRegistration(username+data, data+useremail, data+userpassword);
        LoginPage userLogin = new LoginPage(browserRule.driver);
        userLogin.waitLoginPage();
    }

    @Test
    @Step("Check User try registrating with short password")
    public void userShortPasswordRegistration() {
        RegistrationPage userRegistration = new RegistrationPage(browserRule.driver);
        userRegistration.open();
        userRegistration.userRegistration(username+data, data+useremail, userpassword);
        userRegistration.userHasShortPassword();
        System.out.println("Пароль слишком короткий. Минимальное число символов-6.");
    }
}
