import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObject.MainPage;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class Constructor {
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
        mainPage.buns.shouldHave(cssValue("color","rgba(255, 255, 255, 1)"));
        mainPage.sauces.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
        mainPage.fillings.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
    }
    //Проверь, что работают переходы к разделам:«Cоусы»
    @Test
    public void goToTheSousesSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.traditional.scrollIntoView(false);
        //Assertions
        mainPage.sauces.shouldHave(cssValue("color","rgba(255, 255, 255, 1)"));
        mainPage.buns.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
        mainPage.fillings.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
    }
    //Проверь, что работают переходы к разделам:«Начинки»
    @Test
    public void goToTheFillingsSection() {
        //Setup
        MainPage mainPage = open(Config.STELLARBURGERS_BASE_URL, MainPage.class);
        //Test body
        mainPage.fallenianTree.scrollIntoView(false);
        //Assertions
        mainPage.buns.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
        mainPage.sauces.shouldHave(cssValue("color","rgba(133, 133, 173, 1)"));
        mainPage.fillings.shouldHave(cssValue("color","rgba(255, 255, 255, 1)"));
    }
}
