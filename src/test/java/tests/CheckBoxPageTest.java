package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.WelcomePage;

public class CheckBoxPageTest extends BaseTest {
    WelcomePage welcomePage;


    @BeforeEach
    void init() {
        welcomePage = new WelcomePage();

    }

    @Test
    void checkBoxTest(){
        welcomePage.openCheckBoxPage().clickCheckBox1().checkCheckBoxOneIsClicked();
    }
}
