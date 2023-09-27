package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.loginPageSteps;


import static com.codeborne.selenide.Selenide.open;

public class JiraTestLogin extends loginPageSteps {

    @BeforeAll
    public static void JiraOpen() {

        open("/");
    }
    @Test
    public void loginTest() {
        enterUsername("AT10");
        enterPassword("Qwerty123");
        clickLoginButton();
    }
}








