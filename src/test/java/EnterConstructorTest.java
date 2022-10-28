import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PersonalAccount;
import static com.codeborne.selenide.Selenide.*;
public class EnterConstructorTest {
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
        mainPage.clickEnterAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.login("pa@ra.ram","123456");
        mainPage.clickPersonalAccount();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.clickСonstructor();
        //Assertions
        mainPage.checkMakeUpBurgerIsVisible();
    }

    //Проверь переход по клику на логотип Stellar Burgers
    @Test
    public void EnterStellarBurgersLogo() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.clickEnterAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.login("pa@ra.ram","123456");
        mainPage.clickPersonalAccount();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.clickStellarBurgers();
        //Assertions
        mainPage.checkMakeUpBurgerIsVisible();
    }
}