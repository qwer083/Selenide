package pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class BasePage {
    protected void clickByElement(SelenideElement selenideElement) {
        selenideElement.shouldBe(visible, Duration.ofSeconds(25)).click();
    }

    protected void fillInput(SelenideElement selenideElement, String textForInput) {
        selenideElement.shouldBe(visible).sendKeys(textForInput);
    }

    protected void hoverElement(SelenideElement element){
        element.shouldBe(visible).hover();
    }
}
