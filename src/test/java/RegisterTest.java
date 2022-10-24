import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.RegisterPage;
import java.time.Duration;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
public class Register {
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
    public void SuccessfulRegistrationTest() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.personalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.register.shouldBe(interactable, Duration.ofSeconds(10)).click();
        RegisterPage registerPage = page(RegisterPage.class);
        registerPage.nameInput.setValue("Иван");
        registerPage.emailInput.setValue(RandomStringUtils.randomAlphanumeric(4) +"@ru.ru");
        registerPage.passwordInput.setValue(RandomStringUtils.randomAlphanumeric(7));
        registerPage.registerButton.click();
        //Assertions
        loginPage.register.shouldBe(visible);
    }
    @Test
    public void UnsuccessfulRegistrationPasswordFiveSymbolsTest() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.personalAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.register.click();
        RegisterPage registerPage = page(RegisterPage.class);
        registerPage.nameInput.setValue("Иван");
        registerPage.emailInput.setValue(RandomStringUtils.randomAlphanumeric(4) +"@ru.ru");
        registerPage.passwordInput.setValue(RandomStringUtils.randomAlphanumeric(5));
        registerPage.registerButton.click();
        //Assertions
        registerPage.wrongPassword.shouldBe(visible);
    }
}
