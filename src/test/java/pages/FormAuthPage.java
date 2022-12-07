package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormAuthPage extends BasePage {
    SelenideElement usernameField = $(By.id("username"));
    SelenideElement passwordField = $(By.id("password"));
    SelenideElement loginButton = $(By.className("radius"));
    SelenideElement allertWrongCredentials = $(By.id("flash"));

    public static final String ALLERT_TEXT = "Your password is invalid!";
    public static final String TRUE_LOGIN = "tomsmith";
    public static final String TRUE_PASSWORD = "SuperSecretPassword0!";

    public static final String WRONG_LOGIN = "abrabrabra";
    public static final String WRONG_PASSWORD = "blablablabla!";

    public FormAuthPage fillInvalidCredentials() {
        fillInput(usernameField, WRONG_LOGIN);
        fillInput(passwordField, WRONG_PASSWORD);
        return this;
    }

    public SecureAreaPage fillvalidCredentialsAndClickLoginButton() {
        fillInput(usernameField, TRUE_LOGIN);
        fillInput(passwordField, TRUE_PASSWORD);
        clickLoginButton();
        return new SecureAreaPage();
    }
    public FormAuthPage clickLoginButton() {
        clickByElement(loginButton);
        return this;
    }

    public FormAuthPage checkThatShowError() {
        allertWrongCredentials.shouldBe(Condition.visible).shouldHave(Condition.text(ALLERT_TEXT));
        return this;
    }


}
