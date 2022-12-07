package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {
    SelenideElement secureAreaMainDiv = $(By.id("content"));
    SelenideElement secureSighn = secureAreaMainDiv.$(By.tagName("h2"));
    SelenideElement welcomeSighn = secureAreaMainDiv.$(By.tagName("h4"));
    SelenideElement logoutButton = $(By.xpath("//*[contains(text(),'Logout')]//ancestor::a"));
    SelenideElement succeesBanner = $(By.id("flash-messages"));
    public static final String SUCCEES_STRING = " You logged into a secure area!";
    public static final String SECURE_TEXT = " Secure Area";
    public static final String WELCOME_TEXT = "Welcome to the Secure Area. When you are done click logout below.";

    public SecureAreaPage checkSecureIsSuccees() {
        succeesBanner.shouldBe(Condition.visible).shouldHave(Condition.text(SUCCEES_STRING));
        return this;
    }

    public SecureAreaPage checkMainDiv() {
        secureAreaMainDiv.shouldBe(Condition.visible, Duration.ofSeconds(10));
        secureSighn.shouldBe(Condition.visible).shouldHave(Condition.text(SECURE_TEXT), Duration.ofSeconds(10));
        welcomeSighn.shouldBe(Condition.visible).shouldHave(Condition.text(WELCOME_TEXT), Duration.ofSeconds(10));
        return this;
    }

    public SecureAreaPage checkLogoutButton() {
        logoutButton.shouldBe(Condition.visible);
        return this;
    }

}
