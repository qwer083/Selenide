package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class KeyPressesPage extends BasePage {
    SelenideElement inputField = $(By.id("target"));
    SelenideElement resultSigne = $(By.id("result"));
    public static final String RESULT_MESSAGE = "You entered:";

    public KeyPressesPage sendKeysInInput(String value) {
        fillInput(inputField, value);
        return this;
    }

    public KeyPressesPage checkResultMessage(String value) {
        resultSigne.shouldHave(Condition.text(RESULT_MESSAGE + " " + value.toUpperCase(Locale.ROOT)));
        return this;
    }


}

