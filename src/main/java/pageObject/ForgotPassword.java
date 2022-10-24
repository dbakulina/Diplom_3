import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPassword {
    //Кнопка Войти
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Войти')]")
    public static SelenideElement enter;
}
