import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import pageObject.PersonalAccount;
import static com.codeborne.selenide.Selenide.*;
public class LogoutTest {
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
    @DisplayName("Проверить, что выход из личного кабинета")
    public void Logout() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        mainPage.clickEnterAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.login("pa@ra.ram","123456");
        mainPage.clickPersonalAccount();
        //Test body
        PersonalAccount personalAccount = page(PersonalAccount.class);
        personalAccount.clickLogoutButton();
        //Assertions
        loginPage.checkEmailInputIsVisible();
    }
}
