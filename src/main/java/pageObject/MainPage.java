import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    //Кнопка Личный кабинет
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Личный Кабинет')]")
    public static SelenideElement personalAccount;
    //Кнопка войти в аккаунт
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Войти в аккаунт')]")
    public static SelenideElement enterAccount;
    //Заголовок Соберите бургер
    @FindBy(how = How.XPATH, using = ".//h1[contains(text(),'Соберите бургер')]")
    public static SelenideElement makeUpBurger;
}
