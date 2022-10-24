import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalAccount {
    //Заголовок Профиль
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Профиль')]")
    public static SelenideElement profile;
    //Кнопка "Конструктор"
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Конструктор')]")
    public static SelenideElement constructor;
    //Логотип "stellarburgers"
    @FindBy(how = How.XPATH, using = ".//header/nav[1]/div[1]/a[1]/*[1]")
    public static SelenideElement stellarburgersLogo;
    //Кнопка Выход //button[contains(text(),'Выход')]
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Выход')]")
    public static SelenideElement logoutButton;
}
