import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
    //Поле ввода Имя
    @FindBy(how = How.XPATH, using = ".//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
    public static SelenideElement nameInput;
    //Поле ввода Email
    @FindBy(how = How.XPATH, using = ".//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/fieldset[2]/div[1]/div[1]/input[1]")
    public static SelenideElement emailInput;
    //Поле ввода Пароль
    @FindBy(how = How.XPATH, using = ".//body/div[@id='root']/div[1]/main[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/input[1]")
    public static SelenideElement passwordInput;
    //Кнопка Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Зарегистрироваться')]")
    public static SelenideElement registerButton;
    //Подсказка Некорректный пароль
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Некорректный')]")
    public static SelenideElement wrongPassword;
    //Кнопка "Войти"
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Войти')]")
    public static SelenideElement enterButton;
}
