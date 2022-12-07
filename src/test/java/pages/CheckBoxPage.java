package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage extends BasePage {
    SelenideElement checkBox1 = $(By.xpath("//*[@type='checkbox'][1]"));

    public CheckBoxPage clickCheckBox1() {
        clickByElement(checkBox1);
              return this;
    }

    public CheckBoxPage checkCheckBoxOneIsClicked() {
        checkBox1.shouldBe(Condition.checked);
        return this;
    }


}
