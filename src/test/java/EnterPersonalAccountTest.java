import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PersonalAccount;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
public class EnterPersonalAccount {
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
    public void EnterPersonalAccount() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.enterAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        //Test body
        mainPage.personalAccount.click();
        //Assertions
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.profile.shouldBe(visible);
    }
}
