import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PersonalAccount;
import java.time.Duration;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
public class Logout {
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
    public void Logout() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.enterAccount.click();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.emailInput.shouldBe(interactable, Duration.ofSeconds(10)).setValue("pa@ra.ram");
        loginPage.passwordInput.setValue("123456");
        loginPage.enter.click();
        mainPage.personalAccount.click();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.logoutButton.click();
        //Assertions
        loginPage.emailInput.shouldBe(visible);
    }
}
