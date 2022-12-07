package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.WelcomePage;

public class HoversPageTest extends BaseTest {
    WelcomePage welcomePage;

    @BeforeEach
    void init() {
        welcomePage = new WelcomePage();

    }

    @Test
    void hoversTest() {
        welcomePage.openHoversPage().hoverOnImage().checkSighnsAfterHover();
    }

}
