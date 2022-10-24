import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    //Кнопка Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Зарегистрироваться')]")
    public static SelenideElement register;
    //Поле ввода email
    @FindBy(how = How.XPATH, using = ".//fieldset[1]/div[1]/div[1]/input[1]")
    public static SelenideElement emailInput;
    //Поле ввода пароль
    @FindBy(how = How.XPATH, using = ".//fieldset[2]/div[1]/div[1]/input[1]")
    public static SelenideElement passwordInput;
    //Кнопка Войти
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Войти')]")
    public static SelenideElement enter;
    //Кнопка "Восстановить пароль" //a[contains(text(),'Восстановить пароль')]
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Восстановить пароль')]")
    public static SelenideElement restorePassword;
}
