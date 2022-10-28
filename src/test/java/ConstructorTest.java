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
    //Проверь, что работают переходы к разделам:«Булки»
    @Test
    public void goToTheBunsSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        //Assertions
        mainPage.checkBunIsWhite();
    }
    //Проверь, что работают переходы к разделам:«Cоусы»
    @Test
    public void goToTheSousesSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.scrollIntoTraditional();
        //Assertions
        mainPage.checkSauseIsWhite();
    }
    //Проверь, что работают переходы к разделам:«Начинки»
    @Test
    public void goToTheFillingsSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.scrollIntoFallenianTree();
        //Assertions
        mainPage.checkFillingsIsWhite();
    }
}
