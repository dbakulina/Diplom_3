import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
public class EnterAccount {
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
    //вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void EnterAccountMainPage() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.enterAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }
    //вход через кнопку «Личный кабинет»
    @Test
    public void EnterPersonalArea() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.personalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }
    //вход через кнопку в форме регистрации
    @Test
    public void EnterRegistrationForm() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.personalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.register.click();
        //Test body
        RegisterPage registerPage = page(RegisterPage.class);
        registerPage.enterButton.click();
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }
    //вход через кнопку в форме восстановления пароля.
    @Test
    public void EnterRestorePasswordForm() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.personalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.restorePassword.click();
        //Test body
        ForgotPassword forgotPassword = page(ForgotPassword.class);
        forgotPassword.enter.click();
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }
}
