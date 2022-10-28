package pageObject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class PersonalAccount {
    //Заголовок Профиль
    @FindBy(how = How.XPATH, using = ".//a[contains(text(),'Профиль')]")
    private SelenideElement profile;
    //Кнопка "Конструктор"
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Конструктор')]")
    private SelenideElement constructor;
    //Логотип "stellarburgers"
    @FindBy(how = How.XPATH, using = ".//header/nav[1]/div[1]/a[1]/*[1]")
    private SelenideElement stellarburgersLogo;
    //Кнопка Выход
    @FindBy(how = How.XPATH, using = ".//button[contains(text(),'Выход')]")
    private SelenideElement logoutButton;
    // клик по кнопке "Выход"
    public void clickLogoutButton(){
        logoutButton.click();
    }
    // клик по кнопке "Конструктор"
    public void clickСonstructor(){
        constructor.click();
    }
    // клик по лого "stellarburgers"
    public void clickStellarBurgers(){
        stellarburgersLogo.click();
    }
    //Метод который проверяет видимость на странице подсказки Некорректный пароль
    public void checkProfileIsVisible(){
        profile.shouldBe(visible, Duration.ofSeconds(10));
    }
}
