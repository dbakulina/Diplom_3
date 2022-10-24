import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PersonalAccount;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
public class EnterConstructor {
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
    //Проверь переход по клику на «Конструктор»
    @Test
    public void EnterConstructor() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.enterAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        mainPage.personalAccount.click();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.constructor.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }

    //Проверь переход по клику на логотип Stellar Burgers
    @Test
    public void EnterStellarBurgersLogo() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.enterAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        mainPage.personalAccount.click();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.stellarburgersLogo.click();
        //Assertions
        mainPage.makeUpBurger.shouldBe(visible);
    }
}