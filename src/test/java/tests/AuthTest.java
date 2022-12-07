package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.WelcomePage;

public class AuthTest extends BaseTest {
    WelcomePage welcomePage;

    @BeforeEach
    void init() {
        welcomePage = new WelcomePage();
    }

    @Test
    void validCredentialTest() {
        welcomePage
                .openFormAuthPage()
                .fillvalidCredentialsAndClickLoginButton()
                .checkMainDiv()
                .checkLogoutButton()
                .checkSecureIsSuccees();
    }

    @Test
    void inValidCredentialTest() {
        welcomePage
                .openFormAuthPage()
                .fillInvalidCredentials()
                .clickLoginButton()
                .checkThatShowError();

    }
}
