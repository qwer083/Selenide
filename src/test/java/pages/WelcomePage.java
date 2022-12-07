package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WelcomePage extends BasePage {
    SelenideElement checkBox = $(By.xpath("//*[contains(text(),'Checkboxes')]"));
    SelenideElement formAuthentication = $(By.xpath("//*[contains(text(),'Form Authentication')]"));
    SelenideElement hovers = $(By.xpath("//*[contains(text(),'Hovers')]"));
    SelenideElement dynamicallyLoadedPageElements = $(By.xpath("//*[contains(text(),'Dynamic Loading')]"));
    SelenideElement keyPresses = $(By.xpath("//*[contains(text(),'Key Presses')]"));

    public CheckBoxPage openCheckBoxPage() {
        clickByElement(checkBox);
        return new CheckBoxPage();
    }


    public HoversPage openHoversPage() {
        clickByElement(hovers);
        return new HoversPage();
    }

    public KeyPressesPage openKeyPressesPage() {
        clickByElement(keyPresses);
        return new KeyPressesPage();
    }

    public FormAuthPage openFormAuthPage(){
        clickByElement(formAuthentication);
        return new FormAuthPage();
}




}
