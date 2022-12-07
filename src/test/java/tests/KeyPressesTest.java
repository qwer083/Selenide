package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.WelcomePage;

public class KeyPressesTest extends BaseTest {
    WelcomePage welcomePage;

    @BeforeEach
    void init() {
        welcomePage = new WelcomePage();

    }

    @Test
    void keyPressTest() {
        welcomePage.openKeyPressesPage().sendKeysInInput("d").checkResultMessage("d");
    }

}
