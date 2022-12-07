package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "http://the-internet.herokuapp.com/";
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    void openWelcomePage() {
        Selenide.open("http://the-internet.herokuapp.com/");
    }

    @AfterEach
    void tearDown() {
        WebDriverRunner.getWebDriver().close();
    }


}

