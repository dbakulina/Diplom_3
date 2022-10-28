import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.RegisterPage;
import static com.codeborne.selenide.Selenide.*;
public class RegisterTest {
    @Before
    public void setup() {
        //Configuration.browser = "firefox";
        //Configuration.browser = "opera";
        //Configuration.browser = "yandex";
    }
    @After
    public void tearDown() {
        closeWebDriver();
    }
    @Test
    @DisplayName("Проверить, что работает регистрация с валидными данными")
    public void SuccessfulRegistrationTest() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.clickPersonalAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.clickRegister();
        RegisterPage registerPage = page(RegisterPage.class);
        registerPage.successfulRegisterUser();
        //Assertions
        loginPage.checkRegisterVisible();
    }
    @Test
    @DisplayName("Проверить, что при регистрации с невалидными данными появляется ошибка")
    public void UnsuccessfulRegistrationPasswordFiveSymbolsTest() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.clickPersonalAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.clickRegister();
        RegisterPage registerPage = page(RegisterPage.class);
        registerPage.unsuccessfulRegisterUser();
        //Assertions
        registerPage.checkWrongPasswordIsVisible();
    }
}
