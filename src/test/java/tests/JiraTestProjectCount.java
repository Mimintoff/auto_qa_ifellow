package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.projectPageSteps;

import static com.codeborne.selenide.Selenide.open;
import static steps.loginPageSteps.*;

public class JiraTestProjectCount extends projectPageSteps {

    @BeforeAll
    public static void JiraOpen() {
        open("/");
        enterUsername("AT10");
        enterPassword("Qwerty123");
        clickLoginButton();
    }

    @Test
    public void checkTotalTasks() {
        clickProjectLink();
        clickProjectChoice();
        clickProjectSearch();
        projectCountGeneral();
    }

}
