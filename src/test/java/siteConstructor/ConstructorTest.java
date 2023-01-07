package siteConstructor;

import io.qameta.allure.Step;
import main.BrowserRule;
import org.junit.Rule;
import org.junit.Test;
import pom.MainPage;

public class ConstructorTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @Step("Click Ingredients->Sauces->Buns and check visibility")
    public void constructorVisibility() {
        MainPage mainPage = new MainPage(browserRule.driver);
        mainPage.open();
        mainPage.waitMainPageForUnauthorizedUser();
        mainPage.ingredientsButtonClick();
        mainPage.waitIngredientsTextVisible();
        mainPage.saucesButtonClick();
        mainPage.waitSaucesTextVisible();
        mainPage.bunsButtonClick();
        mainPage.waitBunsTextVisible();
    }
}