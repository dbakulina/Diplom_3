import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.MainPage;
import static com.codeborne.selenide.Selenide.*;
public class ConstructorTest {
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
    @DisplayName("Проверить, что работает переход к разделу Булки")
    public void goToTheBunsSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        //Assertions
        mainPage.checkBunIsWhite();
    }

    @Test
    @DisplayName("Проверить, что работает переход к разделу Соусы")
    public void goToTheSousesSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.scrollIntoTraditional();
        //Assertions
        mainPage.checkSauseIsWhite();
    }

    @Test
    @DisplayName("Проверить, что работает переход к разделу Начинки")
    public void goToTheFillingsSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.scrollIntoFallenianTree();
        //Assertions
        mainPage.checkFillingsIsWhite();
    }
}
