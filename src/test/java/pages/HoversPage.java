package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HoversPage extends BasePage {
    SelenideElement imageOne = $(By.xpath("//*[@class='figure'][1]"));
    SelenideElement sighnAfterHover = $(By.className("figcaption"));
    SelenideElement userOneName = sighnAfterHover.$(By.tagName("h5"));
    SelenideElement userOneLink = sighnAfterHover.$(By.tagName("a"));
    public static final String USER_ONE_NAME_TEXT = "name: user1";
    public static final String USER_ONE_LINK_TEXT = "View profile";



    public HoversPage hoverOnImage() {
        hoverElement(imageOne);
        return this;

    }

    public HoversPage checkSighnsAfterHover() {
        sighnAfterHover.shouldBe(Condition.visible);
        userOneName.shouldBe(Condition.visible).shouldHave(Condition.text(USER_ONE_NAME_TEXT));
        userOneLink.shouldBe(Condition.visible).shouldHave(Condition.text(USER_ONE_LINK_TEXT));
        return this;
    }
}
